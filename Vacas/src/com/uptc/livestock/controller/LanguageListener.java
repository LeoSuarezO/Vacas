package com.uptc.livestock.controller;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import com.uptc.livestock.view.Language;

public class LanguageListener implements ItemListener{
	private static LanguageListener LanguageListener = null;
	
	private LanguageListener() {
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED)
		switch(Language.valueOf(Language.valueOfString(e.getItem().toString()).toString())) {
		case ESPANIOL:
			ChangeLanguage.getInstance().setLanguage(Language.ESPANIOL);
			break;
		case DEUTSCH:
			ChangeLanguage.getInstance().setLanguage(Language.DEUTSCH);
			break;
		case ENGLISH:
			ChangeLanguage.getInstance().setLanguage(Language.ENGLISH);
			break;
		default:
			System.out.println("Este lenguaje " + Language.valueOfString(e.getItem().toString()).toString() + " no tiene funcion aun");
			break;
		}
	}
	
	public static LanguageListener getInstance() {
		if(LanguageListener==null) {
			LanguageListener=new LanguageListener();
		}
		return LanguageListener;
	}
}