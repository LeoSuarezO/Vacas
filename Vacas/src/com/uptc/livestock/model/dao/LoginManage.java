package com.uptc.livestock.model.dao;

import java.util.HashMap;
import java.util.Map;

public class LoginManage {
	private Map<String, String> userNamePassword;

	public LoginManage() {
		userNamePassword = new HashMap<>();
	}

	public String generateUsername(String userFirstName, String userLastName, String password) {
		String username = useName(userFirstName, userLastName);
		userNamePassword.put(username, password);
		return username;
	}

	public String useName(String userFirstName, String userLastName) {
		String username = buildUsername(userFirstName,userLastName);
		int counter = 1;
		while (userNamePassword.keySet().contains(username)) {
			username = buildUsername(userFirstName,userLastName) + 00 + counter;
			counter++;
		}
		return username;
	}

	private String buildUsername(String userFirstName, String userLastName) {
		return (userFirstName + '.' + userLastName).toLowerCase();
	}
}
