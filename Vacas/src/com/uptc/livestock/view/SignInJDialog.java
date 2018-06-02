package com.uptc.livestock.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.uptc.livestock.controller.ChangeLanguage;
import com.uptc.livestock.controller.Command;
import com.uptc.livestock.controller.LivestockListener;
import com.uptc.livestock.controller.PasswordListener;
import com.uptc.livestock.model.dao.LoginManage;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class SignInJDialog extends JDialog {
	private HintJTextField firstNameField;
	private HintJTextField lastNameField;
	private JLabel UsernameLabel;
	private HintJTextField addressField;
	private HintJTextField phoneField;
	private HintJPasswordField passwordField;
	private HintJPasswordField confirmPasswordField;
	private JLabel showingLabel;
	private JButton signInButton;
	private JButton logInButton;
	private JPanel contentPanel;

	public SignInJDialog() {
		LivestockListener.getIntance().setSignInJDialog(this);
		init();
	}

	private void init() {
		ChangeLanguage.getInstance().setSignInJDialog(this);
		setBounds(100, 100, 600, 350);

		getContentPane().setBackground(new Color(100, 149, 237));

		contentPanel = new JPanel();
		contentPanel.setOpaque(false);

		passwordField = new HintJPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.addKeyListener(PasswordListener.getInstance());

		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		GridBagLayout gb_contentpanel = new GridBagLayout();
		gb_contentpanel.columnWeights = new double[] { 0.0, 0.0 };
		gb_contentpanel.rowHeights = new int[] { 37, 50, 0, 50, 50, 34 };
		gb_contentpanel.columnWidths = new int[] { 245, 215 };
		contentPanel.setLayout(gb_contentpanel);

		showingLabel = new JLabel();
		showingLabel.setForeground(Color.WHITE);
		showingLabel.setFont(new Font("Arial", Font.PLAIN, 20));

		GridBagConstraints gbc_showingLabel = new GridBagConstraints();
		gbc_showingLabel.gridwidth = 2;
		gbc_showingLabel.insets = new Insets(0, 0, 5, 0);
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

		lastNameField = new HintJTextField();
		lastNameField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lastNameField.setHorizontalAlignment(SwingConstants.CENTER);
		lastNameField.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				UsernameLabel.setText(LoginManage.useName(firstNameField.getText(), lastNameField.getText()));
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		lastNameField.setActionCommand(Command.CONFIRM_FIELD.toString());

		GridBagConstraints gbc_usernameField = new GridBagConstraints();
		gbc_usernameField.insets = new Insets(0, 0, 5, 0);
		gbc_usernameField.fill = GridBagConstraints.BOTH;
		gbc_usernameField.gridx = 1;
		gbc_usernameField.gridy = 1;
		contentPanel.add(lastNameField, gbc_usernameField);

		UsernameLabel = new JLabel();
		UsernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		UsernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		UsernameLabel.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblUsernamelabel = new GridBagConstraints();
		gbc_lblUsernamelabel.gridwidth = 2;
		gbc_lblUsernamelabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsernamelabel.gridx = 0;
		gbc_lblUsernamelabel.gridy = 2;
		contentPanel.add(UsernameLabel, gbc_lblUsernamelabel);

		addressField = new HintJTextField();
		addressField.setHorizontalAlignment(SwingConstants.CENTER);
		addressField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_addressField = new GridBagConstraints();
		gbc_addressField.insets = new Insets(0, 0, 5, 5);
		gbc_addressField.fill = GridBagConstraints.BOTH;
		gbc_addressField.gridx = 0;
		gbc_addressField.gridy = 3;
		contentPanel.add(addressField, gbc_addressField);

		phoneField = new HintJTextField();
		phoneField.setHorizontalAlignment(SwingConstants.CENTER);
		phoneField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_phoneField = new GridBagConstraints();
		gbc_phoneField.insets = new Insets(0, 0, 5, 0);
		gbc_phoneField.fill = GridBagConstraints.BOTH;
		gbc_phoneField.gridx = 1;
		gbc_phoneField.gridy = 3;
		contentPanel.add(phoneField, gbc_phoneField);

		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.BOTH;
		gbc_passwordField.gridx = 0;
		gbc_passwordField.gridy = 4;
		contentPanel.add(passwordField, gbc_passwordField);

		signInButton = new JButton();

		signInButton.addActionListener(LivestockListener.getIntance());

		confirmPasswordField = new HintJPasswordField();
		confirmPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		confirmPasswordField.setHorizontalAlignment(SwingConstants.CENTER);
		confirmPasswordField.addKeyListener(PasswordListener.getInstance());
		GridBagConstraints gbc_confirmPasswordField = new GridBagConstraints();
		gbc_confirmPasswordField.fill = GridBagConstraints.BOTH;
		gbc_confirmPasswordField.insets = new Insets(0, 0, 5, 0);
		gbc_confirmPasswordField.gridx = 1;
		gbc_confirmPasswordField.gridy = 4;
		contentPanel.add(confirmPasswordField, gbc_confirmPasswordField);
		signInButton.setActionCommand(Command.SIGNIN_ACCOUNT.toString());
		signInButton.setBorderPainted(false);
		signInButton.setForeground(new Color(100, 149, 237));
		signInButton.setBackground(Color.WHITE);
		signInButton.setEnabled(false);

		GridBagConstraints gbc_loginButton = new GridBagConstraints();
		gbc_loginButton.gridwidth = 2;
		gbc_loginButton.fill = GridBagConstraints.VERTICAL;
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

		PasswordListener.getInstance().setSignInButton(signInButton);
		PasswordListener.getInstance().setPasswordField(passwordField);
		PasswordListener.getInstance().setConfirmPasswordField(confirmPasswordField);
		
		optionPanel.add(logInButton);

		setLocationRelativeTo(null);
		setUndecorated(true);
	}

	public String[] getUserData() {
		return new String[] { firstNameField.getText(), lastNameField.getText(), addressField.getText(),
				phoneField.getText(), passwordField.getText() };
	}

	public void setStringsLanguage(String firstNameHint, String lastNameHint, String addressHint, String phoneHint,
			String passwordHint, String confirmPasswordHint, String showingTitle, String loginButton,
			String signinButton) {
		this.firstNameField.setHint(firstNameHint);
		this.lastNameField.setHint(lastNameHint);
		this.addressField.setHint(addressHint);
		this.phoneField.setHint(phoneHint);
		this.passwordField.setHint(passwordHint);
		this.confirmPasswordField.setHint(confirmPasswordHint);
		this.showingLabel.setText(showingTitle);
		this.logInButton.setText(loginButton);
		this.signInButton.setText(signinButton);
	}

}
