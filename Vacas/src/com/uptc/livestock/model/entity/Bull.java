package com.uptc.livestock.model.entity;

public class Bull extends Bovine{

	public Bull(Bovine bovine) {
		super(bovine.getId(), bovine.getName(), bovine.getBirthDate(), bovine.getRace(), bovine.getWeight(), bovine.getVaccine(), bovine.getHealthCondition());
	}
	
	

}
