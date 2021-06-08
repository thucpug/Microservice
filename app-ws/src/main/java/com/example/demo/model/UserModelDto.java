package com.example.demo.model;

import org.springframework.lang.NonNull;

public class UserModelDto {
	public UserModelDto() {
		setUserName("thuc");
		setPhone("09632587845");
	}
    
	private String userName;
	@NonNull
	private String phone;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
