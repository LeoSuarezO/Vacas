package com.uptc.livestock.view;

import javax.swing.JFrame;

import com.uptc.livestock.controller.LivestockListener;
import com.uptc.livestock.persistence.MyProperties;

public class AppFrame extends JFrame {

	private SignInJDialog signInJDialog;
	private LogInJDialog logInJDialog;
	private AppJMenuBar appJMenuBar;

	public AppFrame() {
		this.signInJDialog = new SignInJDialog();
		this.logInJDialog = new LogInJDialog();
		this.appJMenuBar = new AppJMenuBar();
		this.init();
	}

	private void init() {
		LivestockListener.getIntance().setAppFrame(this);
		this.setLanguage(Language.ESPANIOL);

		setJMenuBar(appJMenuBar);

		this.setSize(640, 480);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void setLanguage(Language language) {
		MyProperties properties = new MyProperties(language);
		this.setTitle(properties.getProperty("title"));
		this.logInJDialog.setStringsLanguages(properties.getProperty("login_username"),
				properties.getProperty("login_password"), properties.getProperty("login_showing_title"),
				properties.getProperty("login_button"), properties.getProperty("login_signin"),
				properties.getProperty("login_forget_password"));
		this.appJMenuBar.setStringsLanguage(properties.getProperty("menu_options"), properties.getProperty("menu_help"),
				properties.getProperty("menu_about"), properties.getProperty("menu_contact"),
				properties.getProperty("menu_language"), properties.getProperty("spanish"),
				properties.getProperty("english"), properties.getProperty("deutsch"));
		this.signInJDialog.setStringsLanguage(properties.getProperty("signin_firstname"), 
				properties.getProperty("signin_lastname"),
				properties.getProperty("login_password"), 
				properties.getProperty("login_password"), 
				properties.getProperty("signin_showing_title"), 
				properties.getProperty("signin_button"), 
				properties.getProperty("signin_login_button"));
	}
}
