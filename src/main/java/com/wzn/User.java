package com.wzn;

public class User {
	private String username;
	private int age;
	private String sex;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, int age, String sex) {
		super();
		this.username = username;
		this.age = age;
		this.sex = sex;
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
		return "User [username=" + username + ", age=" + age + ", sex=" + sex + "]";
	}
}
