package com.uptc.livestock.model.dao;

import java.util.ArrayList;

import com.uptc.livestock.model.entity.Rancher;

public class RancherDao {
	private ArrayList<Rancher> ranchers;

	public RancherDao() {
		ranchers = new ArrayList<>();
	}

	public void createRancher(String[] data, String username) {
		ranchers.add(new Rancher(data[0], data[1], data[2], Integer.parseInt(data[3]), username));
	}

	public Rancher readRancher(String username) {
		return ranchers.get(searchUserIndex(username));
	}

	public void updateRancher(String[] data, String username) {
		ranchers.set(searchUserIndex(username),
				new Rancher(data[0], data[1], data[2], Integer.parseInt(data[3]), username));
	}

	public void deleteRancher(String username) {
		ranchers.remove(searchUserIndex(username));
	}

	public int searchUserIndex(String username) {
		for (int i = 0; i < ranchers.size(); i++) {
			if (ranchers.get(i).getUsername().equals(username))
				return i;
		}
		return -1;
	}
}
