package com.uptc.livestock.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.uptc.livestock.controller.Command;
import com.uptc.livestock.controller.LivestockListener;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class LogInJDialog extends JDialog {
	private HintJTextField usernameField;
	private HintJPasswordField passwordField;
	private JLabel showingLabel;
	private JButton logInButton;
	private JButton signInButton;
	private JButton forgetPasswordButton;

	public LogInJDialog() {
		LivestockListener.getIntance().setLogInJDialog(this);
		init();
	}

	private void init() {
		setBounds(100, 100, 450, 300);

		JPanel contentPanel = new JPanel();

		getContentPane().setBackground(new Color(100, 149, 237));

		contentPanel = new JPanel();
		contentPanel.setOpaque(false);

		usernameField = new HintJTextField();
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		usernameField.setHorizontalAlignment(SwingConstants.CENTER);

		passwordField = new HintJPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);

		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		GridBagLayout gb_contentpanel = new GridBagLayout();
		gb_contentpanel.rowHeights = new int[] { 37, 50, 50, 34 };
		gb_contentpanel.columnWidths = new int[] { 209 };
		contentPanel.setLayout(gb_contentpanel);

		showingLabel = new JLabel();
		showingLabel.setForeground(Color.WHITE);
		showingLabel.setFont(new Font("Arial", Font.PLAIN, 20));

		GridBagConstraints gbc_showingLabel = new GridBagConstraints();
		gbc_showingLabel.insets = new Insets(0, 0, 5, 0);
		gbc_showingLabel.gridx = 0;
		gbc_showingLabel.gridy = 0;
		contentPanel.add(showingLabel, gbc_showingLabel);

		GridBagConstraints gbc_usernameField = new GridBagConstraints();
		gbc_usernameField.insets = new Insets(0, 0, 5, 0);
		gbc_usernameField.fill = GridBagConstraints.BOTH;
		gbc_usernameField.gridx = 0;
		gbc_usernameField.gridy = 1;
		contentPanel.add(usernameField, gbc_usernameField);
		usernameField.setColumns(10);

		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.BOTH;
		gbc_passwordField.gridx = 0;
		gbc_passwordField.gridy = 2;
		contentPanel.add(passwordField, gbc_passwordField);

		logInButton = new JButton();

		logInButton.addActionListener(LivestockListener.getIntance());
		logInButton.setActionCommand(Command.LOGIN_ACCOUNT.toString());
		logInButton.setBorderPainted(false);
		logInButton.setForeground(new Color(100, 149, 237));
		logInButton.setBackground(Color.WHITE);

		GridBagConstraints gbc_loginButton = new GridBagConstraints();
		gbc_loginButton.fill = GridBagConstraints.BOTH;
		gbc_loginButton.gridx = 0;
		gbc_loginButton.gridy = 3;
		contentPanel.add(logInButton, gbc_loginButton);

		getContentPane().add(contentPanel);

		JPanel closePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 5));
		closePanel.setBackground(new Color(100, 149, 237));
		closePanel.setPreferredSize(new Dimension(0, 20));
		getContentPane().add(closePanel, BorderLayout.NORTH);

		JButton closeButton = new JButton("X");
		closeButton.addActionListener(LivestockListener.getIntance());
		closeButton.setActionCommand(Command.DISPOSE_LOGIN_JDIALOG.toString());
		closeButton.setOpaque(false);
		closeButton.setContentAreaFilled(false);
		closeButton.setForeground(Color.WHITE);
		closeButton.setBorder(null);
		closePanel.add(closeButton);

		JPanel optionPanel = new JPanel(new GridLayout(1, 2));
		optionPanel.setBackground(new Color(100, 149, 237));
		optionPanel.setPreferredSize(new Dimension(0, 20));
		getContentPane().add(optionPanel, BorderLayout.SOUTH);

		signInButton = new JButton();
		signInButton.addActionListener(LivestockListener.getIntance());
		signInButton.setActionCommand(Command.CREATE_ACCOUNT.toString());
		signInButton.setOpaque(false);
		signInButton.setContentAreaFilled(false);
		signInButton.setForeground(Color.WHITE);
		signInButton.setBorder(null);

		forgetPasswordButton = new JButton();
		forgetPasswordButton.addActionListener(LivestockListener.getIntance());
		forgetPasswordButton.setActionCommand(Command.FORGET_PASSWORD.toString());
		forgetPasswordButton.setOpaque(false);
		forgetPasswordButton.setContentAreaFilled(false);
		forgetPasswordButton.setForeground(Color.WHITE);
		forgetPasswordButton.setBorder(null);

		optionPanel.add(signInButton);
		optionPanel.add(forgetPasswordButton);

		setLocationRelativeTo(null);
		setUndecorated(true);
	}

	public String[] getUserData() {
		return new String[] { usernameField.getText(), passwordField.getText() };
	}

	public void setStringsLanguages(String usernameHint, String passwordHint, String showingTitle, String loginButton,
			String signinButton, String forgetPasswordButton) {
		this.usernameField.setHint(usernameHint);
		this.passwordField.setHint(passwordHint);
		this.showingLabel.setText(showingTitle);
		this.logInButton.setText(loginButton);
		this.signInButton.setText(signinButton);
		this.forgetPasswordButton.setText(forgetPasswordButton);
	}
}
