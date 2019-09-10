package com.ems.configuration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration 
@ComponentScan("com.ems")
public class EmsConfig {

	@Bean
	public Connection getConnection() throws SQLException
	{
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/EmployeeDB","sagar","Sagar@1996");
		return con;
		
	}
	
	
	@Bean
	public BufferedReader getBufferReaderBean()
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		return in;
	}
}
