package com.uptc.livestock.model.entity;

import java.util.Date;

import com.uptc.livestock.utilities.Utilities;

public class Cow extends Bovine {

	public Cow(short id, String name, Date birthDate, Race race, double weight, String vaccine,
			HealthCondition healthCondition) {
		super(id, name, birthDate, race, weight, vaccine, healthCondition);
	}

	public Cow(String[] data) {
		this(Short.parseShort(data[0]), data[1], Utilities.parseDate(data[2]), Race.valueOf(data[3]),
				Double.parseDouble(data[4]), data[5], HealthCondition.valueOf(data[6]));
	}
}
