package com.wzn.myFactory;

import com.wzn.myBeans.User;
//生产user对象的工厂类
public class UserFactory {
	//静态的生产方法    可以直接使用类名调用
	public static User createUser(String username, int age, String sex){
		return new User(username, age, sex);
	}
	//非静态的生产方法   不可以直接用类名直接调用
	public User getUser(String username, int age, String sex){
		return new User(username, age, sex);
	}
}	
