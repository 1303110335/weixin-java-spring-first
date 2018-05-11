package com.imooc.first.config;

import com.imooc.first.interceptor.OneInterceptor;
import com.imooc.first.interceptor.TwoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/superadmin/**")
                                                     .addPathPatterns("/redis/**");
        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/redis/**");
        super.addInterceptors(registry);
    }
}
