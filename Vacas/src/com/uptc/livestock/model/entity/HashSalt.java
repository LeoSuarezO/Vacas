package com.uptc.livestock.model.entity;

public class HashSalt {
	private String hash;
	private String salt;

	public HashSalt(String hash, String salt) {
		this.hash = hash;
		this.salt = salt;
	}

	public String getHash() {
		return hash;
	}

	public String getSalt() {
		return salt;
	}
}