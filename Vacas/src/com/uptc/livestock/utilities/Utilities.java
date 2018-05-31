package com.uptc.livestock.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase Utilities
 * 
 * @since 1.8
 * @author Andres Chaparro, Fabian Cristancho, David Malaver, Kevin Suerez
 * @Fecha Fecha: 30/05/2018
 */
public class Utilities {

	/**
	 * Atrapa la excepcion del parse de la clase {@link SimpleDateFormat} y
	 * si no es exitoso lo coloca en null.
	 * @param dateText Fecha en {@link String} .
	 * @return Un objeto {@link Date} con la fecha establecida por dateText.
	 */
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
