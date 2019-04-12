package com.wzn.testSpring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-TX.xml")
public class JdbcTemplateTest1 {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void test1() {
		//使用JdbcTemplate提供的模板，来保存数据到数据库中
		String sql = "INSERT INTO `user`(`username`,`age`,`sex`)"
				+ "VALUES (?,?,?)";
		Object[] params = {"世界上最帅的男人",11,"男"};
		int update = jdbcTemplate.update(sql, params);
		System.out.println(update);
	}
}
