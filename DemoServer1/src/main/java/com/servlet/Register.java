package com.servlet;

public class Register {
	
	String name;
	String email;
	int mobile;
	String password;
	String confirmpassword;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public Register(String name, String email, int mobile, String password, String confirmpassword) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	public Register() {
		super();
	}
	@Override
	public String toString() {
		return "Registration [name=" + name + ", email=" + email + ", mobile=" + mobile + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + "]";
	}

}
