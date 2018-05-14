package com.imooc.first.config.dao;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 配置datasource到ioc容器里面
 * @author xuleyan
 */
@Configuration
// 配置mybatis mapper的扫描路径
@MapperScan("com.imooc.first.dao")
public class DruidDataSourceConfiguration {
    @Primary
    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "masterdb.druid")
    public DataSource masterDataSource() {
        return new DruidDataSource();
    }

}
