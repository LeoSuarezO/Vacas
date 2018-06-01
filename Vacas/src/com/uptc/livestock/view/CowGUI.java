package com.uptc.livestock.view;

import com.uptc.livestock.model.entity.Bovine;
import com.uptc.livestock.model.entity.Cow;

public class CowGUI extends Cow{

	public CowGUI(Bovine bovine, Cow cow) {
		super(bovine, cow.getDatePart(), cow.getNumParts(), cow.getDateDryPeriod());
	}
}
