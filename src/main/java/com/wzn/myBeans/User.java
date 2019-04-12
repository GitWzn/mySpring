package com.wzn.myBeans;

import java.util.Set;

public class User {
	private String username;
	private int age;
	private String sex;
	private Set<String> sets;
	private UserInfo userInfo;

	public User() {
	}

	public User(String username, int age, String sex) {
		this.username = username;
		this.age = age;
		this.sex = sex;
	}
	
	

	public User(String username, int age, String sex, Set<String> sets, UserInfo userInfo) {
		this.username = username;
		this.age = age;
		this.sex = sex;
		this.sets = sets;
		this.userInfo = userInfo;
	}
	

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + ", sex=" + sex + ", sets=" + sets + ", userInfo="
				+ userInfo + "]";
	}
}
