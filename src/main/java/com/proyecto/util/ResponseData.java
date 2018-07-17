package com.proyecto.util;

public class ResponseData<T> {
	T data;
	int statusHttp;
	String title;
	String message;
	public ResponseData() {
		super();
	}
	
	public ResponseData(T data, int statusHttp, String title, String message) {
		super();
		this.data = data;
		this.statusHttp = statusHttp;
		this.title = title;
		this.message = message;
	}

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public int getStatusHttp() {
		return statusHttp;
	}
	public void setStatusHttp(int statusHttp) {
		this.statusHttp = statusHttp;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


	
}
