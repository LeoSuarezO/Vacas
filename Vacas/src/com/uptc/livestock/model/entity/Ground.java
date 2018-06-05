package com.uptc.livestock.model.entity;

import java.util.ArrayList;

import com.uptc.livestock.model.dao.BovineDao;

public class Ground {
	
	private Weather currentWeather;
	private double area;
	private short groundId;
	private Rancher owner;
	private int totalCapacity;
	private int currentCapacity;
	private Weather groundWeather;
	private Purpose purpose;
	private BovineDao bovineList;
	
	public Ground(Weather currentWeather, double area, short groundId, Rancher owner, int totalCapacity,
			int currentCapacity, Weather groundWeather, Purpose purpose, ArrayList<Bull> bulls, ArrayList<Cow> cows) {
		
		this.currentWeather = currentWeather;
		this.area = area;
		this.groundId = groundId;
		this.owner = owner;
		this.totalCapacity = totalCapacity;
		this.currentCapacity = currentCapacity;
		this.groundWeather = groundWeather;
		this.purpose = purpose;
	
	}

	public Weather getCurrentWeather() {
		return currentWeather;
	}

	public double getArea() {
		return area;
	}

	public short getGroundId() {
		return groundId;
	}

	public Rancher getOwner() {
		return owner;
	}

	public int getTotalCapacity() {
		return totalCapacity;
	}

	public int getCurrentCapacity() {
		return currentCapacity;
	}

	public Weather getGroundWeather() {
		return groundWeather;
	}

	public Purpose getPurpose() {
		return purpose;
	}

	
	
	
	
}