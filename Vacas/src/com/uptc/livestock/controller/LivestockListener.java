package com.uptc.livestock.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.uptc.livestock.view.Language;
import com.uptc.livestock.view.LogInJDialog;
import com.uptc.livestock.view.SignInJDialog;

public class LivestockListener implements ActionListener {
	private static LivestockListener livestockListener = null;

	private SignInJDialog signInJDialog;
	private LogInJDialog logInJDialog;

	private LivestockListener() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
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
}
