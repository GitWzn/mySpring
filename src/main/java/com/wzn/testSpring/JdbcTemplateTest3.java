package com.wzn.testSpring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wzn.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateTest3 {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test   //查询统计
	public void test2() {
		//统计数据库中的数据有多少条
		String sql = "SELECT COUNT(*) FROM `user`";
		Integer num = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(num);
	}
}
