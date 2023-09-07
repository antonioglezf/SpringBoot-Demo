package com.example.demo;

public class HelloApplicationContext {
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void getMsg() {
		System.out.println("Response Message : " + msg);
	}
}
