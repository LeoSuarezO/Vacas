package com.uptc.livestock.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;

import com.uptc.livestock.view.HintJPasswordField;

public class PasswordListener implements KeyListener{
	private static PasswordListener passwordListener=null;
	
	private HintJPasswordField passwordField;
	private HintJPasswordField confirmPasswordField;
	private JButton signInButton; 
	
	
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (new String(passwordField.getPassword()).equals(new String(confirmPasswordField.getPassword()))) {
			signInButton.setEnabled(true);
		}else {
			signInButton.setEnabled(false);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}
	
	public void setPasswordField(HintJPasswordField passwordField) {
		this.passwordField = passwordField;
	}
	
	public void setConfirmPasswordField(HintJPasswordField confirmPasswordField) {
		this.confirmPasswordField = confirmPasswordField;
	}
	
	public void setSignInButton(JButton signInButton) {
		this.signInButton = signInButton;
	}
	
	public static PasswordListener getInstance() {
		if(passwordListener==null) {
			passwordListener=new PasswordListener();
		}
		return passwordListener;
	}
}