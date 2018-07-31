package com.zhao.springAnnotation.annotation;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-25 20:20
 * @描述 测试声明式事务
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.zhao.tx"})
public class TestTx {

    @Bean
    public DataSource dataSource() {
        System.out.println("---构造jdbc数据源---");
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/web");
        return druidDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }


    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

}