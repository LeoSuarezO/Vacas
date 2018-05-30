package com.uptc.livestock.model;

import java.util.Date;

public class Cow extends Bovine{
	
//	private double cantMilkProduce;

	public Cow(short id, String name, Date birthDate, Race race, double weight, String vaccine,
			HealthCondition healthCondition) {
		super(id, name, birthDate, race, weight, vaccine, healthCondition);
	}
}
