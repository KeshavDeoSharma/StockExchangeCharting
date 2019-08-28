package com.keshav.SpringBootExample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.context.annotation.Scope;

@Entity
@Table(name="user")
@Scope("session")
public class Register {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String username;
private String password;
@Transient
private String confirmpassword;
private String usertype;
private String email;
@Column(name="mobilenumber")
private long mobileNumber;
private int confirmed;
public Register(int id, String username, String password, String usertype, String email, long mobileNumber,
		int confirmed) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.usertype = usertype;
	this.email = email;
	this.mobileNumber = mobileNumber;
	this.confirmed = confirmed;
}

public String getConfirmpassword() {
	return confirmpassword;
}

public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUsertype() {
	return usertype;
}
public void setUsertype(String usertype) {
	this.usertype = usertype;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public int getConfirmed() {
	return confirmed;
}
public void setConfirmed(int confirmed) {
	this.confirmed = confirmed;
}
public Register() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Register [id=" + id + ", username=" + username + ", password=" + password + ", confirmpassword="
			+ confirmpassword + ", usertype=" + usertype + ", email=" + email + ", mobileNumber=" + mobileNumber
			+ ", confirmed=" + confirmed + "]";
}

}
