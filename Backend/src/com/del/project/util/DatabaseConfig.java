package com.del.project.util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:oracle.properties")
@Profile("prod")

public class DatabaseConfig {
	@Value("${db.driver}")
public String driver;
	@Value("${db.url}")
public String url;
	@Value("${db.user}")
public String username;
	@Value("${db.password}")
public String password;
	@Bean
	@Qualifier("dataSource")
	public DataSource createDataSource() {
		System.out.println("creating datasource");
		DriverManagerDataSource dm=new DriverManagerDataSource();
		dm.setDriverClassName(driver);
		dm.setUrl(url);
		dm.setUsername(username);
		dm.setPassword(password);
		return dm;
		
	}
}
