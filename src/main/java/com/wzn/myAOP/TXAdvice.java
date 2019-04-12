package com.wzn.myAOP;

//该类是事务的通知就是增强
public class TXAdvice {
	public void openTX(){
		System.out.println("开启事务应用！！");
	}
	
	public void commitTX(){
		System.out.println("事务提交！");
	}
}
