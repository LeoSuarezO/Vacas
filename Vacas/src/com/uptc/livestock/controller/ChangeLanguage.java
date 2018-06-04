package com.uptc.livestock.controller;

import com.uptc.livestock.persistence.MyProperties;
import com.uptc.livestock.view.AppFrame;
import com.uptc.livestock.view.AppJMenuBar;
import com.uptc.livestock.view.Language;
import com.uptc.livestock.view.LogInJDialog;
import com.uptc.livestock.view.PresentationJPanel;
import com.uptc.livestock.view.SignInJDialog;
import com.uptc.livestock.view.login.FrequentUserJPanel;
import com.uptc.livestock.view.login.RecentUserJPanel;

public class ChangeLanguage {
	private static ChangeLanguage changeLanguage = null;

	private MyProperties properties;

	private AppFrame appFrame;

	private SignInJDialog signInJDialog;
	private LogInJDialog logInJDialog;

	private AppJMenuBar appJMenuBar;

	private PresentationJPanel presentationJPanel;
	private RecentUserJPanel recentUserJPanel;
	private FrequentUserJPanel frequentUserJPanel;

	private String[] languageList;

	private ChangeLanguage() {
	}

	public void setLanguage(Language language) {
		properties = new MyProperties(language);

		languageList = new String[] { properties.getProperty("spanish"), properties.getProperty("english"),
				properties.getProperty("deutsch") };
		updateAppFrameLanguage();
		updateLoginJDialog();
		updateSigninJDialog();
		updateAppJMenuBar();
		updatePresentationJPanelLanguage();
		updateRecentUserJPanelLanguage();
		updateFrequentUserJPanelLanguage();
	}

	public void updateAppFrameLanguage() {
		if (appFrame != null)
			this.appFrame.setTitle(properties.getProperty("title"));
	}

	public void updateLoginJDialog() {
		if (logInJDialog != null)
			this.logInJDialog.setStringsLanguages(properties.getProperty("login_username"),
					properties.getProperty("login_password"), properties.getProperty("login_showing_title"),
					properties.getProperty("login_button"), properties.getProperty("login_signin"),
					properties.getProperty("login_forget_password"));
	}

	public void updateSigninJDialog() {
		if (signInJDialog != null)
			this.signInJDialog.setStringsLanguage(properties.getProperty("signin_firstname"),
					properties.getProperty("signin_lastname"), properties.getProperty("signin_address"),
					properties.getProperty("signin_phone"), properties.getProperty("login_password"),
					properties.getProperty("login_password"), properties.getProperty("signin_showing_title"),
					properties.getProperty("signin_button"), properties.getProperty("signin_login_button"));
	}

	public void updateAppJMenuBar() {
		if (appJMenuBar != null)
			this.appJMenuBar.setStringsLanguage(properties.getProperty("menu_options"),
					properties.getProperty("menu_help"), properties.getProperty("menu_about"),
					properties.getProperty("menu_contact"), properties.getProperty("menu_language"),
					properties.getProperty("spanish"), properties.getProperty("english"),
					properties.getProperty("deutsch"));
	}

	public void updatePresentationJPanelLanguage() {
		if (presentationJPanel != null)
			this.presentationJPanel.setStringsLanguage(properties.getProperty("title"),
					properties.getProperty("login_signin"), properties.getProperty("login_button"),
					properties.getProperty("menu_about"));
	}

	public void updateFrequentUserJPanelLanguage() {

	}

	public void updateRecentUserJPanelLanguage() {
		if (recentUserJPanel != null)
			recentUserJPanel.setStringsLanguage(properties.getProperty("main_add_herd"),
					properties.getProperty("main_add_bovine"));
	}

	public String[] getLanguageList() {
		return languageList;
	}

	public static ChangeLanguage getInstance() {
		if (changeLanguage == null) {
			changeLanguage = new ChangeLanguage();
		}
		return changeLanguage;
	}

	public void setAppFrame(AppFrame appFrame) {
		this.appFrame = appFrame;
	}

	public void setSignInJDialog(SignInJDialog signInJDialog) {
		this.signInJDialog = signInJDialog;
	}

	public void setLogInJDialog(LogInJDialog logInJDialog) {
		this.logInJDialog = logInJDialog;
	}

	public void setAppJMenuBar(AppJMenuBar appJMenuBar) {
		this.appJMenuBar = appJMenuBar;
	}

	public void setPresentationJPanel(PresentationJPanel presentationJPanel) {
		this.presentationJPanel = presentationJPanel;
	}

	public void setRecentUserJPanel(RecentUserJPanel recentUserJPanel) {
		this.recentUserJPanel = recentUserJPanel;
	}

	public void setFrequentUserJPanel(FrequentUserJPanel frequentUserJPanel) {
		this.frequentUserJPanel = frequentUserJPanel;
	}
}
