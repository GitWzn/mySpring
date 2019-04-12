package com.wzn.myBeans;

public class UserInfo {
	private String address;
	private String phone;

	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInfo(String address, String phone) {
		this.address = address;
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserInfo [address=" + address + ", phone=" + phone + "]";
	}
}
