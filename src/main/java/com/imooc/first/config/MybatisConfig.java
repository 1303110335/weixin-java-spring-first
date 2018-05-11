package com.imooc.first.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.imooc.first.config.dao.SessionFactoryConfiguration;
import net.sf.log4jdbc.Log4jdbcProxyDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
public class MybatisConfig {
    @Primary
    @Bean(name = "masterdb")
    @ConfigurationProperties(prefix = "masterdb.druid")
    public DataSource masterDataSource() {
        return new DruidDataSource();
    }

    // mybatis-config.xml配置文件的路径
    private static String mybatisConfigFile;

    @Value("${mybatis_config_file}")
    public void setMybatisConfigFile(String mybatisConfigFile) {
        MybatisConfig.mybatisConfigFile = mybatisConfigFile;
    }

    // mybatis mapper文件所在路径
    private static String mapperPath;

    @Value("${mapper_path}")
    public void setMapperPath(String mapperPath) {
        MybatisConfig.mapperPath = mapperPath;
    }


    // 实体类所在的package
    @Value("${type_alias_package}")
    private String typeAliasPackage;

    // dao所在的package
    @Value("${type_base_package}")
    private String typeBasePackage;

    @Bean(name = "sqlSessionFactory")
    @Autowired
    public SqlSessionFactory sqlSessionFactory(Log4jdbcProxyDataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setTypeAliasesPackage(typeAliasPackage);
        sqlSessionFactory.setConfigLocation(new ClassPathResource(mybatisConfigFile));
        sqlSessionFactory.setFailFast(true);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperPath;
        sqlSessionFactory.setMapperLocations(resolver.getResources(packageSearchPath));
        return sqlSessionFactory.getObject();
    }

    @Bean
    @Autowired
    public Log4jdbcProxyDataSource loggingDataSource(@Qualifier("masterdb") DataSource dataSource) {
        return new Log4jdbcProxyDataSource(dataSource);
    }

    /**
     * mapper scanner
     *
     * @return
     */
    @Bean
    public MapperScannerConfigurer makeMapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.imooc.first.dao");
        return mapperScannerConfigurer;
    }

    @Bean
    @Autowired
    public DataSourceTransactionManager transactionManager(Log4jdbcProxyDataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
