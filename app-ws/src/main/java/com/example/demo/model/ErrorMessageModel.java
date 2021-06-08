package com.example.demo.model;

import java.util.Date;

public class ErrorMessageModel {
	private Date timestamp;
	private String message;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
