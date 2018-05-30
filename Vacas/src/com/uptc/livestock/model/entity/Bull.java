package com.uptc.livestock.model.entity;

import java.util.Date;

public class Bull extends Bovine{

	public Bull(short id, String name, Date birthDate, Race race, double weight, String vaccine,
			HealthCondition healthCondition) {
		super(id, name, birthDate, race, weight, vaccine, healthCondition);
	}
	
	

}
