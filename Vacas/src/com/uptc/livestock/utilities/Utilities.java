package com.uptc.livestock.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
	
	public static Date parseDate(String dateText) {
		Date date;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(dateText);
		} catch (ParseException e) {
			date = null;
		}
		return date;
	}
}
