package com.wzn.myDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.wzn.User;

@Service   //注入的注解   意思是将该类注入到容器中    默认注入后的对象名称是对象的首字母小写  如：userDao
public class UserDao {
	//获取数据库的执行对象
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addUser(){
		System.out.println("世界上最帅的男人！！");
	}
	//在这个类中，是真正操作数据库的，这里不负责逻辑、异常的处理
	public void addUser(User user) {
		String sql = "INSERT INTO user(username,age,sex) VALUES(?,?,?)";
		int update = jdbcTemplate.update(
				sql, 
				user.getUsername(),
				user.getAge(),
				user.getSex());
		System.out.println("添加数据后的结果：" + update);
	}
}
