package com.cgi.spring_order_example.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@ComponentScan(basePackages = "com.cgi.spring_order_example")
@Configuration
public class SpringConfig {
	
	
		@Bean
		public DataSource dataSource(){
			DriverManagerDataSource datasource = new DriverManagerDataSource();
			datasource.setUrl("jdbc:mysql://localhost:3306/hr");
			datasource.setUsername("root");
			datasource.setPassword("12345");
			datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			return datasource;
		}
}
