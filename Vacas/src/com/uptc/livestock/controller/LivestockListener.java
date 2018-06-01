package com.uptc.livestock.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.uptc.livestock.view.AppFrame;
import com.uptc.livestock.view.Language;
import com.uptc.livestock.view.LogInJDialog;
import com.uptc.livestock.view.SignInJDialog;

public class LivestockListener implements ActionListener {
	private static LivestockListener livestockListener=null;
	
	private SignInJDialog signInJDialog;
	private LogInJDialog logInJDialog;
	private AppFrame appFrame;
	
	
	private LivestockListener() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Command.valueOf(e.getActionCommand())) {
		case DISPOSE_LOGIN_JDIALOG:
			logInJDialog.dispose();
			break;
		case DISPOSE_SIGNIN_JDIALOG:
			signInJDialog.dispose();
			break;
		case CREATE_ACCOUNT:
			logInJDialog.dispose();
			signInJDialog.setVisible(true);
			break;
		case SIGNIN_LOGIN:
			logInJDialog.setVisible(true);
			signInJDialog.dispose();
			break;
		case SIGNIN_ACCOUNT:

			break;
		case SPANISH:
			appFrame.setLanguage(Language.ESPANIOL);
			break;
		case DEUTSCH:
			appFrame.setLanguage(Language.DEUTSCH);
			break;
		case ENGLISH:
			appFrame.setLanguage(Language.ENGLISH);
			break;
		default:
			System.out.println("Este boton "+e.getActionCommand()+" no tiene funcion aun");
			break;
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
	
	public void setAppFrame(AppFrame appFrame) {
		this.appFrame = appFrame;
	}
}

