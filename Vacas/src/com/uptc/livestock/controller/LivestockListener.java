package com.uptc.livestock.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.uptc.livestock.model.dao.LoginManage;
import com.uptc.livestock.utilities.PasswordUtil;
import com.uptc.livestock.view.AppFrame;
import com.uptc.livestock.view.AppJMenuBar;
import com.uptc.livestock.view.Language;
import com.uptc.livestock.view.LogInJDialog;
import com.uptc.livestock.view.PresentationJPanel;
import com.uptc.livestock.view.SignInJDialog;

public class LivestockListener implements ActionListener {
	private static LivestockListener livestockListener = null;

	private SignInJDialog signInJDialog;
	private LogInJDialog logInJDialog;
	
	private PresentationJPanel presentationJPanel;
	
	private AppFrame appFrame;
	private AppJMenuBar appJMenuBar;

	private LivestockListener() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			switch (Command.valueOf(e.getActionCommand())) {
			case DISPOSE_LOGIN_JDIALOG:
				logInJDialog.dispose();
				logInJDialog.resetFields();
				break;
			case DISPOSE_SIGNIN_JDIALOG:
				signInJDialog.dispose();
				signInJDialog.resetFields();
				break;
			case CREATE_ACCOUNT:
				logInJDialog.dispose();
				logInJDialog.resetFields();
				signInJDialog.setVisible(true);
				break;
			case SIGNIN_LOGIN:
				signInJDialog.dispose();
				signInJDialog.resetFields();
				logInJDialog.setVisible(true);
				break;
			case SIGNIN_ACCOUNT:
				String[] data = signInJDialog.getUserData();
				String username;
				try {
					username = LoginManage.generateUsername(data[0], data[1], PasswordUtil.getHash(data[4]));
				} catch (Exception exc) {
				}
				signInJDialog.dispose();
				signInJDialog.resetFields();
				logInJDialog.setVisible(true);
				break;
			case LOGIN_ACCOUNT:
				data = logInJDialog.getUserData();
				if (LoginManage.existUser(data[0], data[1])) {
					appFrame.dispose();
					appFrame.remove(presentationJPanel);
					appFrame.setJMenuBar(appJMenuBar);
					appFrame.setUndecorated(false);
					appFrame.setVisible(true);
				} else {
				}
				logInJDialog.dispose();
				logInJDialog.resetFields();
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

	public void setSignInJDialog(SignInJDialog signInJDialog) {
		this.signInJDialog = signInJDialog;
	}

	public void setLogInJDialog(LogInJDialog logInJDialog) {
		this.logInJDialog = logInJDialog;
	}

	public void setAppJMenuBar(AppJMenuBar appJMenuBar) {
		this.appJMenuBar = appJMenuBar;
	}

	public void setAppFrame(AppFrame appFrame) {
		this.appFrame = appFrame;
	}
	
	public void setPresentationJPanel(PresentationJPanel presentationJPanel) {
		this.presentationJPanel = presentationJPanel;
	}
}
