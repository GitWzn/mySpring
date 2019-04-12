package com.wzn.testSpring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wzn.User;
import com.wzn.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-TX.xml")
public class TX_Test {
	@Autowired
	private UserService userService;
	
	@Test
	public void test() {
		//创建两个User对象
		User user1 = new User("啥子",43,"男");
		User user2 = new User("很好",32,"女");
		userService.insertUser(user1, user2);
		System.out.println("添加数据完毕~");
	}
}
