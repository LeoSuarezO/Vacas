package com.uptc.livestock.model.entity;

import com.uptc.livestock.model.dao.HerdDao;

public class Rancher {
	
	private String name;
	private String lastName;
	private String address;
	private int phoneNumber;
	private String username;
	private HerdDao herdDao;
	
	public Rancher(String name, String lastName, String address, int phoneNumber, String username) {
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.username = username;
		this.herdDao = new HerdDao();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getUsername() {
		return username;
	}
	
	public HerdDao getHerds() {
		return herdDao;
	}
}
