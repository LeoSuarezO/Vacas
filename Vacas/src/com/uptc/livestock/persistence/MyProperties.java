package com.uptc.livestock.persistence;

import java.io.IOException;
import java.util.Properties;

import com.uptc.livestock.view.Language;

public class MyProperties extends Properties {

	public MyProperties(Language language) {
		if (language.equals(Language.ESPANIOL)) {
			getProperties("language_es");
		} else if (language.equals(Language.ENGLISH)) {
			getProperties("language_en");
		} else if (language.equals(Language.DEUTSCH)) {
			getProperties("language_de");
		} else {
			getProperties("language_es");
		}
	}

	private void getProperties(String file) {
		try {
			super.load(getClass().getResourceAsStream("/res/properties/"+file+".properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getProperty(String key) {
		return super.getProperty("language." + key);
	}
}
