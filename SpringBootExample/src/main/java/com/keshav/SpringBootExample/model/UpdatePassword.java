package com.keshav.SpringBootExample.model;

public class UpdatePassword {
	private String username;
	private String currentpassword;
	private String newpassword;
	private String confirmpassword;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCurrentpassword() {
		return currentpassword;
	}
	public void setCurrentpassword(String currentpassword) {
		this.currentpassword = currentpassword;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

}
