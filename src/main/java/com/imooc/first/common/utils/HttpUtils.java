package com.imooc.first.common.utils;

import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class HttpUtils {
    private static final Logger logger = LoggerFactory.getLogger(HttpUtils.class);

    private static CloseableHttpClient httpClient;

    private static final int SOCKET_TIMEOUT = 1000 * 15;
    private static final int CONNECT_TIMEOUT = 1000 * 15;

    private static final List<BasicHeader> DEFAULT_HEADER = Arrays.asList(new BasicHeader(
            HttpHeaders.CONTENT_ENCODING,
            "utf-8"
    ));

    static {
        //设置http连接池
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
        cm.setMaxTotal(200);
        cm.setDefaultMaxPerRoute(20);
        HttpHost localhost = new HttpHost("localhost", 8080);
        cm.setMaxPerRoute(new HttpRoute(localhost), 50);
        RequestConfig config = RequestConfig.custom()
                .setSocketTimeout(SOCKET_TIMEOUT)
                .setConnectTimeout(CONNECT_TIMEOUT)
                .build();
        httpClient = HttpClients.custom().setConnectionManager(cm).setDefaultRequestConfig(config).build();
    }

    public static String post(String url, List<Header> headers, String post) throws IOException {
        return request(new HttpPost(url), headers, null, post);
    }

    /**
     *
     * @param httpRequest
     * @param headers
     * @param nvps
     * @param postData
     * @return
     * @throws IOException
     * @throws ClientProtocolException
     */
    private static String request(HttpRequestBase httpRequest, List<Header> headers, List<NameValuePair> nvps, String postData) throws IOException, ClientProtocolException {
        Date start = new Date();
        String result = "";
        CloseableHttpResponse response = null;

        try {
            if (headers != null && !headers.isEmpty()) {
                headers.forEach(header -> {
                    httpRequest.addHeader(header);
                });
            } else {
                DEFAULT_HEADER.forEach(header -> { httpRequest.addHeader(header); });
            }

            boolean isInstanceOfHttpPost = httpRequest instanceof HttpPost;

            if (nvps != null && !nvps.isEmpty() && isInstanceOfHttpPost) {
                ((HttpPost) httpRequest).setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
            }

            if (postData != null && isInstanceOfHttpPost) {
                ((HttpPost) httpRequest).setEntity(new StringEntity(postData, "utf-8"));
            }

            response = httpClient.execute(httpRequest);
            HttpEntity entity = response.getEntity();

            result = EntityUtils.toString(entity, "utf-8");
            EntityUtils.consume(entity);
        } catch (ClientProtocolException e) {
            logger.error(e.getMessage(), e);
            throw e;
        } catch (UnsupportedEncodingException e) {
            logger.error(e.getMessage(), e);
            throw e;
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
            throw e;
        } finally {
            closeQuietly(response);
        }
        logger.warn("http request spend time:" + (System.currentTimeMillis() - start.getTime()));
        return result;
    }

    private static void closeQuietly(Closeable c) throws IOException {
        try {
            if (c != null) {
                c.close();
            }
        } catch (IOException e) {
            //ignore
        }
    }
}
