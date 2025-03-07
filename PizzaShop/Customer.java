package com.dkte.pizzaShop.entities;

import java.util.Scanner;

public class Customer {
	private int cid;
	private String name;
	private String password;
	private String email;
	private String mobile;
	
	
	public Customer()
	{
		
	}


	public Customer(int cid, String name, String password, String email, String mobile) {
		this.cid = cid;
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void accept(Scanner sc)
	{
		System.out.println("Enter email id : ");
		email = sc.next();
		System.out.println("Enter password : ");
		password = sc.next();
		System.out.println("Enter mobile : ");
		mobile = sc.next();
	}

	@Override
	public String toString() {
		return "customer [cid=" + cid + ", name=" + name + ", password=" + password + ", email=" + email + ", mobile="
				+ mobile + "]";
	}
}
