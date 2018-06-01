package com.uptc.livestock.model.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.uptc.livestock.model.entity.HashSalt;
import com.uptc.livestock.utilities.PasswordUtil;

public class LoginManage {
	private Map<String, HashSalt> userNamePassword;

	public LoginManage() {
		userNamePassword = new HashMap<>();
	}

	public String generateUsername(String userFirstName, String userLastName, HashSalt hashSalt) {
		String username = useName(userFirstName, userLastName);
		userNamePassword.put(username, hashSalt);
		return username;
	}

	public String useName(String userFirstName, String userLastName) {
		String username = buildUsername(userFirstName, userLastName);
		int counter = 1;
		while (userNamePassword.keySet().contains(username)) {
			username = buildUsername(userFirstName, userLastName) + 00 + counter;
			counter++;
		}
		return username;
	}

	public boolean existUser(String username, String password) {
		Iterator<Entry<String, HashSalt>> it = userNamePassword.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, HashSalt> e = it.next();
			if(e.getKey().equals(username))
				if(PasswordUtil.ValidatePass(password, e.getValue().getHash(), e.getValue().getSalt()))
					return true;
		}
		return false;
	}

	private String buildUsername(String userFirstName, String userLastName) {
		return (userFirstName + '.' + userLastName).toLowerCase();
	}
}
