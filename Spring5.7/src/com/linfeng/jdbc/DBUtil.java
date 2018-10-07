package com.linfeng.jdbc;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DBUtil {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Test
	public void save() {
		 ApplicationContext context = 
	                new ClassPathXmlApplicationContext("beans_jdbc.xml");
		String sql = "insert into teacher(name,password,message) values (?,?,?)";
		 JdbcTemplate jdbcTemplate  =  (JdbcTemplate) context.getBean("jdbcTemplate");
		jdbcTemplate.update(sql,"admin","admin","hello world");
	}
}
