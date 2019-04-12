package com.wzn.testSpring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wzn.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateTest2 {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void test2() {
		//使用JdbcTemplate提供的模板，来查找数据库中的数据
		String sql = "SELECT *FROM `user` WHERE id = ?";
		Object[] params = {1};
		//查询的方法一：
		/*List<User> users = jdbcTemplate.query(
				sql, 
				params, 
				new RowMapper<User>(){
					@Override
					//查询到的结果会被封装成ResultSet，有几条数据，这里就执行几次
					//查询到就执行，没查询到就不执行
					public User mapRow(ResultSet re, int index) throws SQLException {
						User user = new User(re.getString("username"), re.getInt("age"), re.getString("sex"));
						return user;
					}
				});*/
		//查询单条数据的方法二：
		BeanPropertyRowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
		User user = jdbcTemplate.queryForObject(sql, params, rowMapper);
		System.out.println(user);
	}
}
