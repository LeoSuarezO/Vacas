package com.uptc.livestock.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.uptc.livestock.model.dao.LoginManage;
import com.uptc.livestock.model.dao.RancherDao;
import com.uptc.livestock.utilities.PasswordUtil;
import com.uptc.livestock.view.AppFrame;
import com.uptc.livestock.view.Language;
import com.uptc.livestock.view.LogInJDialog;
import com.uptc.livestock.view.SignInJDialog;

public class LivestockListener implements ActionListener {
	private static LivestockListener livestockListener = null;

	private SignInJDialog signInJDialog;
	private LogInJDialog logInJDialog;
	
	private AppFrame appFrame;

	private RancherDao rancherDao;
	
	private LivestockListener() {
		rancherDao= new RancherDao();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			switch (Command.valueOf(e.getActionCommand())) {
			case DISPOSE_LOGIN_JDIALOG:
				disposeLogin();
				break;
			case DISPOSE_SIGNIN_JDIALOG:
				disposeSignin();
				break;
			case CREATE_ACCOUNT:
				changeToSignin();
				break;
			case SIGNIN_LOGIN:
				changeToLogin();
				break;
			case SIGNIN_ACCOUNT:
				accountCreation();
				break;
			case LOGIN_ACCOUNT:
				loginAccount();
				break;
			default:
				System.out.println("Este boton " + e.getActionCommand() + " no tiene funcion aun");
				break;
			}
		} catch (IllegalArgumentException ex) {
		}
		try {
			switch (Language.valueOf(e.getActionCommand())) {
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
				System.out.println("Este lenguaje " + e.getActionCommand() + " no tiene funcion aun");
				break;
			}
		} catch (IllegalArgumentException ex) {
		}
	}

	public static LivestockListener getIntance() {
		if (livestockListener == null) {
			livestockListener = new LivestockListener();
		}
		return livestockListener;
	}

	private void disposeLogin() {
		logInJDialog.dispose();
		logInJDialog.resetFields();
	}
	
	private void disposeSignin() {
		signInJDialog.dispose();
		signInJDialog.resetFields();
	}
	
	private void changeToSignin() {
		disposeLogin();
		signInJDialog.setVisible(true);
	}
	
	private void changeToLogin() {
		disposeSignin();
		logInJDialog.setVisible(true);
	}
	
	private void accountCreation() {
		String[] data = signInJDialog.getUserData();
		String username=null;
		try {
			username = LoginManage.generateUsername(data[0], data[1], PasswordUtil.getHash(data[4]));
		} catch (Exception exc) {
		}
		rancherDao.createRancher(data, username);
		changeToLogin();
	}
	
	private void loginAccount() {
		String[] data = logInJDialog.getUserData();
		if (LoginManage.existUser(data[0], data[1])) {
			appFrame.loginProcess();
		} else {
		}
		disposeLogin();
	}
	
	public void setSignInJDialog(SignInJDialog signInJDialog) {
		this.signInJDialog = signInJDialog;
	}

	public void setLogInJDialog(LogInJDialog logInJDialog) {
		this.logInJDialog = logInJDialog;
	}

	public void setAppFrame(AppFrame appFrame) {
		this.appFrame = appFrame;
	}
}
