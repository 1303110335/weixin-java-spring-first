package com.imooc.first.filter;

import ch.qos.logback.classic.Level;
import com.imooc.first.common.utils.IpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.imooc.first.filter.logging.ThreadLevelFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.LogRecord;

@Component
public class LoggingFilter implements Filter {
    private static Logger logger = LoggerFactory.getLogger(LoggingFilter.class);

    private Set<String> errorLevelUriSet = new HashSet<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        errorLevelUriSet.add("/api/platform/wallet/statistics");
        errorLevelUriSet.add("/api/user/");
        errorLevelUriSet.add("/favicon.ico");
        errorLevelUriSet.add("/");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        setLoggingLevel(req);
        StringBuilder sb = new StringBuilder("\n");
        sb.append("requestIpAddress:").append(IpUtils.getRemoteHost(req)).append("\n")
                .append("url:").append(req.getRequestURL()).append("\n")
                .append("method:").append(req.getMethod()).append("\n")
                .append("header").append("\n");
        Enumeration<String> headerNames = req.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            sb.append("{\"").append(name).append("\":\"").append(req.getHeader(name)).append("\"}").append("\n");
        }

        sb.append("params:").append("\n");
        for (String name : request.getParameterMap().keySet()) {
            sb.append(name).append("=").append(request.getParameter(name)).append("\n");
        }
        logger.warn(sb.toString());
        chain.doFilter(request, response);
        recoverLoggingLevel(req);
    }

    private void recoverLoggingLevel(HttpServletRequest req) {
        if (errorLevelUriSet.contains(req.getRequestURI())) {
            ThreadLevelFilter.setLevel(null);
        }
    }

    private void setLoggingLevel(HttpServletRequest req) {
        if (errorLevelUriSet.contains(req.getRequestURI())) {
            ThreadLevelFilter.setLevel(Level.ERROR);
        }
    }

    @Override
    public void destroy() {

    }
}
