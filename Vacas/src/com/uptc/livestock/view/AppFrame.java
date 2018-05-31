package com.uptc.livestock.view;

import javax.swing.JFrame;

import com.uptc.livestock.persistence.MyProperties;

public class AppFrame extends JFrame {
	private LogInJDialog logInJDialog;
	public AppFrame() {
		this.logInJDialog=new LogInJDialog();
		this.init();
	}

	private void init() {
		this.language(Language.ESPANIOL);
		
		logInJDialog.setVisible(true);
		
		this.setSize(640,480);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void language(Language language) {
		MyProperties properties = new MyProperties(language);
		this.setTitle(properties.getProperty("title"));
		this.logInJDialog.setStringsLanguages(
				properties.getProperty("login_username"),
				properties.getProperty("login_password"),
				properties.getProperty("login_showing_title"),
				properties.getProperty("login_button"),
				properties.getProperty("login_signin"),
				properties.getProperty("login_forget_password"));
	}
}
