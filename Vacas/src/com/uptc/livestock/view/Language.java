package com.uptc.livestock.view;

public enum Language {
//("","",""),
	DEFAULT("","",""),ESPANIOL("Espa�ol","Spanish",""), ENGLISH("Ingl�s","English",""), DEUTSCH("Aleman","German","Deutsch");
	private String spanish, english, deutsch;

	private Language(String spanish, String english, String deutch) {
		this.spanish= spanish;
		this.english=english;
		this.deutsch=deutch;
	}
	
	public String[] getLanguageList(Language language) {
		String[] languageStrings = new String[Language.values().length-1];
		switch (language) {
		case ESPANIOL:
			for (int i = 1; i < Language.values().length; i++) {
				languageStrings[i-1]=Language.values()[i].spanish;
			}
			break;
		case ENGLISH:
			for (int i = 0; i < Language.values().length; i++) {
				languageStrings[i]=Language.values()[i].english;
			}
			break;
		case DEUTSCH:
			for (int i = 0; i < Language.values().length; i++) {
				languageStrings[i]=Language.values()[i].deutsch;
			}
			break;
		case DEFAULT:
			for (int i = 0; i < Language.values().length; i++) {
				languageStrings[i]=Language.values()[i].spanish;
			}
			break;
		default:
			break;
		}
		return languageStrings;
	}
}
