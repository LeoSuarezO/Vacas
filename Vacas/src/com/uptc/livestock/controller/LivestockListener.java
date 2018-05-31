package com.uptc.livestock.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.uptc.livestock.model.entity.Command;
import com.uptc.livestock.view.LogInJDialog;

public class LivestockListener implements ActionListener {
	private static LivestockListener livestockListener;
	private LogInJDialog logInJDialog;

	private LivestockListener() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Command.valueOf(e.getActionCommand())) {
		case DISPOSE_LOGIN_JDIALOG:
			logInJDialog.dispose();
			break;
		}
	}

	public static LivestockListener getIntance() {
		if (livestockListener == null) {
			livestockListener = new LivestockListener();
		}
		return livestockListener;
	}

	public void setLogInJDialog(LogInJDialog logInJDialog) {
		this.logInJDialog = logInJDialog;
	}
}

