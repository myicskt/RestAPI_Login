package com.mr.home.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	
	@Id
	@Column(name="user_id")
	int userId;
	
	
	@Column(name="user_name")
	String userName;
	
	@Column(name="user_password")
	String userPassword;
	
	
	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	
	
	@Override
	public String toString() {
		return "Login [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}

}
