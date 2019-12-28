package com.lisz.controller;

import java.io.Serializable;

public class ResponseStatus implements Serializable {
	/**
	 * 注意：Dubbo项目的话，服务提供者返回的类必须实现Serializable接口，否则会重试三次，每次开启一个新线程，
	 * 如果是插入操作，第二次的时候就报错了，因为有的column可能规定不能重复：unique
	 */
	private static final long serialVersionUID = 4944669278298801979L;
	private int code;
	private String message;
	private String data; // JSON
	
	public ResponseStatus() {}
	
	public ResponseStatus(int code, String message, String data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public static ResponseStatus build(int i) {
		return new ResponseStatus(200, "OK", "Created an account successfully.");
	}
	
}
