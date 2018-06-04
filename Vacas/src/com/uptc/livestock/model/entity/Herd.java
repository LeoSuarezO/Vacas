package com.uptc.livestock.model.entity;

import com.uptc.livestock.model.dao.BovineDao;

public class Herd {
	private BovineDao bovineDao;
	
	public Herd() {
		this.bovineDao = new BovineDao();
	}
	
	public BovineDao getBovines() {
		return bovineDao;
	}
}
