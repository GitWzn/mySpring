package com.wzn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzn.User;
import com.wzn.myDao.UserDao;

@Service
public class UserService {
	//获取UserDao对象
	@Autowired
	private UserDao userDao;
	public void addUser(){
		System.out.println("添加用户信息~~");
	}
	//这个类对数据进行逻辑判断，操作是出现的异常，都可以在这个类中操作
	public void insertUser(User user1, User user2) {
		//数据的添加1
		userDao.addUser(user1);
		//System.out.println(1/0);
		userDao.addUser(user2);
	}
}
