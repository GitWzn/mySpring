package com.wzn;

public class test {
	public static void main(String[] args) {
		//正则表达式 替换功能
		//电话号码 18818877374 转换为 188****7374
		String cardNumber = "18818877374";
		String regex = "(\\d{3})(\\d{4})";
		String newCard = cardNumber.replaceAll(regex, "$1*****");
		System.out.println(newCard);
	}
}
