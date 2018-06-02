package com.uptc.livestock.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.uptc.livestock.controller.ChangeLanguage;
import com.uptc.livestock.controller.LivestockListener;

public class AppJMenuBar extends JMenuBar {

	private JMenu optionsMenu;
	private JMenu helpMenu;

	private JMenu languageMenu;
	private JMenuItem spanishItem;
	private JMenuItem englishItem;
	private JMenuItem deutschItem;

	private JMenuItem aboutItem;
	private JMenuItem contactItem;

	public AppJMenuBar() {
		this.optionsMenu = new JMenu();
		this.helpMenu = new JMenu();

		this.languageMenu = new JMenu();
		this.spanishItem = new JMenuItem();
		this.englishItem = new JMenuItem();
		this.deutschItem = new JMenuItem();

		this.aboutItem = new JMenuItem();
		this.contactItem = new JMenuItem();

		init();
	}

	private void init() {
		spanishItem.addActionListener(LivestockListener.getIntance());
		englishItem.addActionListener(LivestockListener.getIntance());
		deutschItem.addActionListener(LivestockListener.getIntance());
		
		spanishItem.setActionCommand(Language.ESPANIOL.toString());
		englishItem.setActionCommand(Language.ENGLISH.toString());
		deutschItem.setActionCommand(Language.DEUTSCH.toString());
		
		optionsMenu.add(languageMenu);

		languageMenu.add(spanishItem);
		languageMenu.add(englishItem);
		languageMenu.add(deutschItem);

		helpMenu.add(contactItem);
		helpMenu.add(aboutItem);

		add(optionsMenu);
		add(helpMenu);
		
		ChangeLanguage.getInstance().setAppJMenuBar(this);
	}

	public void setStringsLanguage(String options, String help, String about, String contact, String language, String spanish, String english, String deutsch) {
		this.optionsMenu.setText(options);
		this.helpMenu.setText(help);
		
		this.aboutItem.setText(about);
		this.contactItem.setText(contact);
	
		this.languageMenu.setText(language);
		this.spanishItem.setText(spanish);
		this.englishItem.setText(english);
		this.deutschItem.setText(deutsch);
	}
}
