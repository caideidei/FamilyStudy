package com.example.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.example.mapper") // 指定Mapper接口所在的包
public class MybatisConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        // 可以通过sessionFactory.setConfigLocation()等方法来配置MyBatis
        // 例如，加载自定义的MyBatis配置文件
         sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        // 但在这个例子中，我们直接使用了Spring Boot的自动配置
        return sessionFactory.getObject();
    }


}
