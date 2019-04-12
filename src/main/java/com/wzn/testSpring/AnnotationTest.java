package com.wzn.testSpring;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wzn.myDao.UserDao;

//应该先加载Spring配置文件，要想使用注解帮助我们加载配置文件    就要是使用到Spring中集成的Junit去帮助我们对程序的开发测试
@RunWith(SpringJUnit4ClassRunner.class)    //是Junit提供给其他框架测试环境接口扩展，为了使用Spring的依赖注入
@ContextConfiguration("classpath:applicationContext.xml")   //使用注解来加载Spring配置文件
public class AnnotationTest {
	/*//向容器中获取对应名称的对象
	@Resource    //因为Spring配置文件没有加载就从容器中获取对象   所以是空值    
	public UserDao userDao;
	@Test
	public void test1 (){
		//加载Spring配置文件
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//获取对象
		userDao.addUser();
	}*/
	
	//向容器中根据对象类型匹配的对象
	//@Autowired
	//向容器中根据注入类的对象的名称匹配对象
	@Resource
	public UserDao userDao;
	@Test
	public void test2 (){
		userDao.addUser();
	}
	
	
}
