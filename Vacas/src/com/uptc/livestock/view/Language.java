package com.uptc.livestock.view;

public enum Language {
	ESPANIOL("Español"), ENGLISH("English"), DEUTSCH("Deutsch");
	private String natal;

	private Language(String natal) {
		this.natal = natal;
	}

	public static Language valueOfString(String string) {
		for (int i = 0; i < Language.values().length; i++) {
			if (string.equals(ESPANIOL.natal))
				return Language.ESPANIOL;
			if (string.equals(ENGLISH.natal))
				return Language.ENGLISH;
			if (string.equals(DEUTSCH.natal))
				return Language.DEUTSCH;
		}
		return null;
	}
}
