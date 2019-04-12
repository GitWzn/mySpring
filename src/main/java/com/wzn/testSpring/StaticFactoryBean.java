package com.wzn.testSpring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wzn.myBeans.User;
import com.wzn.myBeans.UserGther;

public class StaticFactoryBean {
	@Test
	public void test1() throws Exception {
		//加载Spring的配置文件，指定从classpath路径中查找
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//从容器中获取到指定的对象，同过该对象在容器中的名称
		User user = cpxac.getBean("user", User.class);
		System.out.println(user);
	}
	
	@Test
	public void test2() throws Exception {
		//加载Spring的配置文件，指定从classpath路径中查找
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//从容器中获取指定的对象，通过该对象在容器中的名称
		User user = cpxac.getBean("user_1", User.class);
		System.out.println(user);
	}
	
	@Test
	public void test3() throws Exception {
		//加载Spring的配置文件，指定从classpath路径中查找
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//通过该对象在容器中的名称，从容器中获取指定的对象
		UserGther bean = cpxac.getBean("userGther", UserGther.class);
		System.out.println(bean);
	}
	
	@Test
	public void test4() throws Exception {
		//加载Spring的配置文件，指定从classpath路径中获取
		ClassPathXmlApplicationContext cpxap = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//通过该对象在容器中的名称，获取指定的对象
		User bean = cpxap.getBean("user_5", User.class);
		System.out.println(bean);
	}
}
