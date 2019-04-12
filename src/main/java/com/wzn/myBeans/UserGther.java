package com.wzn.myBeans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserGther {
	private String username;
	private int age;
	private String sex;
	private Set<String> sets;
	private Map<String, String> maps;
	private List<User> users;
	private int[] number;
	private User user;

	public UserGther() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserGther(String username, int age, String sex, Set<String> sets, Map<String, String> maps, List<User> users,
			int[] number, User user) {
		this.username = username;
		this.age = age;
		this.sex = sex;
		this.sets = sets;
		this.maps = maps;
		this.users = users;
		this.number = number;
		this.user = user;
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

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public int[] getNumber() {
		return number;
	}

	public void setNumber(int[] number) {
		this.number = number;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserGther [username=" + username + ", age=" + age + ", sex=" + sex + ", sets=" + sets + ", maps=" + maps
				+ ", users=" + users + ", number=" + Arrays.toString(number) + ", user=" + user + "]";
	}

}
