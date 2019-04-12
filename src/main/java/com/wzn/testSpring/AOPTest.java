package com.wzn.testSpring;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wzn.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
//使用注解加载Spring配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class AOPTest {
	//根据匹配容器中的对象名称来获取对象
	@Resource
	public UserService userService;
	
	@Test
	public void test1 () throws Exception{
		userService.addUser();
	}
}
