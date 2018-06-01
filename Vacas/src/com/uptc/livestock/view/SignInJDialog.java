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

public class SignInJDialog extends JDialog {
	private HintJTextField lastNameField;
	private HintJTextField firstNameField;
	private HintJPasswordField passwordField;
	private HintJPasswordField confirmPasswordField;
	private JLabel showingLabel;
	private JButton signInButton;
	private JButton logInButton;

	public SignInJDialog() {
		LivestockListener.getIntance().setSignInJDialog(this);
		init();
	}

	private void init() {
		setBounds(100, 100, 450, 450);

		JPanel contentPanel = new JPanel();

		getContentPane().setBackground(new Color(100, 149, 237));

		contentPanel = new JPanel();
		contentPanel.setOpaque(false);

		lastNameField = new HintJTextField();
		lastNameField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lastNameField.setHorizontalAlignment(SwingConstants.CENTER);

		passwordField = new HintJPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);

		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		GridBagLayout gb_contentpanel = new GridBagLayout();
		gb_contentpanel.rowHeights = new int[] { 37, 50, 50, 50, 50, 34 };
		gb_contentpanel.columnWidths = new int[] { 209 };
		contentPanel.setLayout(gb_contentpanel);

		showingLabel = new JLabel();
		showingLabel.setForeground(Color.WHITE);
		showingLabel.setFont(new Font("Arial", Font.PLAIN, 20));

		GridBagConstraints gbc_showingLabel = new GridBagConstraints();
		gbc_showingLabel.insets = new Insets(0, 0, 5, 5);
		gbc_showingLabel.gridx = 0;
		gbc_showingLabel.gridy = 0;
		contentPanel.add(showingLabel, gbc_showingLabel);

		firstNameField = new HintJTextField();
		firstNameField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		firstNameField.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lastNameField = new GridBagConstraints();
		gbc_lastNameField.fill = GridBagConstraints.BOTH;
		gbc_lastNameField.insets = new Insets(0, 0, 5, 5);
		gbc_lastNameField.gridx = 0;
		gbc_lastNameField.gridy = 1;
		contentPanel.add(firstNameField, gbc_lastNameField);

		GridBagConstraints gbc_usernameField = new GridBagConstraints();
		gbc_usernameField.insets = new Insets(0, 0, 5, 5);
		gbc_usernameField.fill = GridBagConstraints.BOTH;
		gbc_usernameField.gridx = 0;
		gbc_usernameField.gridy = 2;
		contentPanel.add(lastNameField, gbc_usernameField);

		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.BOTH;
		gbc_passwordField.gridx = 0;
		gbc_passwordField.gridy = 3;
		contentPanel.add(passwordField, gbc_passwordField);

		signInButton = new JButton();

		signInButton.addActionListener(LivestockListener.getIntance());

		confirmPasswordField = new HintJPasswordField();
		confirmPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		confirmPasswordField.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_confirmPasswordField = new GridBagConstraints();
		gbc_confirmPasswordField.fill = GridBagConstraints.BOTH;
		gbc_confirmPasswordField.insets = new Insets(0, 0, 5, 5);
		gbc_confirmPasswordField.gridx = 0;
		gbc_confirmPasswordField.gridy = 4;
		contentPanel.add(confirmPasswordField, gbc_confirmPasswordField);
		signInButton.setActionCommand(Command.SIGNIN_ACCOUNT.toString());
		signInButton.setBorderPainted(false);
		signInButton.setForeground(new Color(100, 149, 237));
		signInButton.setBackground(Color.WHITE);

		GridBagConstraints gbc_loginButton = new GridBagConstraints();
		gbc_loginButton.insets = new Insets(0, 0, 0, 5);
		gbc_loginButton.fill = GridBagConstraints.BOTH;
		gbc_loginButton.gridx = 0;
		gbc_loginButton.gridy = 5;
		contentPanel.add(signInButton, gbc_loginButton);

		getContentPane().add(contentPanel);

		JPanel closePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 5));
		closePanel.setBackground(new Color(100, 149, 237));
		closePanel.setPreferredSize(new Dimension(0, 20));
		getContentPane().add(closePanel, BorderLayout.NORTH);

		JButton closeButton = new JButton("X");
		closeButton.addActionListener(LivestockListener.getIntance());
		closeButton.setActionCommand(Command.DISPOSE_SIGNIN_JDIALOG.toString());
		closeButton.setOpaque(false);
		closeButton.setContentAreaFilled(false);
		closeButton.setForeground(Color.WHITE);
		closeButton.setBorder(null);
		closePanel.add(closeButton);

		JPanel optionPanel = new JPanel(new GridLayout(1, 2));
		optionPanel.setBackground(new Color(100, 149, 237));
		optionPanel.setPreferredSize(new Dimension(0, 20));
		getContentPane().add(optionPanel, BorderLayout.SOUTH);

		logInButton = new JButton();
		logInButton.addActionListener(LivestockListener.getIntance());
		logInButton.setActionCommand(Command.SIGNIN_LOGIN.toString());
		logInButton.setOpaque(false);
		logInButton.setContentAreaFilled(false);
		logInButton.setForeground(Color.WHITE);
		logInButton.setBorder(null);

		optionPanel.add(logInButton);

		setLocationRelativeTo(null);
		setUndecorated(true);
	}

	public String[] getUserData() {
		return new String[] { lastNameField.getText(), passwordField.getText() };
	}

	public void setStringsLanguage(String firstNameHint, String lastNameHint, String passwordHint,
			String confirmPasswordHint, String showingTitle, String loginButton, String signinButton) {
		this.firstNameField.setHint(firstNameHint);
		this.lastNameField.setHint(lastNameHint);
		this.passwordField.setHint(passwordHint);
		this.confirmPasswordField.setHint(confirmPasswordHint);
		this.showingLabel.setText(showingTitle);
		this.logInButton.setText(loginButton);
		this.signInButton.setText(signinButton);
	}
}
