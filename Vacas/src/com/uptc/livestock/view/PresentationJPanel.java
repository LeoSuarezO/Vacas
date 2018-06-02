package com.uptc.livestock.view;

import javax.swing.JPanel;

import com.uptc.livestock.controller.ChangeLanguage;
import com.uptc.livestock.controller.Command;
import com.uptc.livestock.controller.LanguageListener;
import com.uptc.livestock.controller.LivestockListener;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.awt.FlowLayout;

public class PresentationJPanel extends JPanel {

	private JLabel titleLabel;
	private JButton signinButton;
	private JButton loginButton;
	private JButton aboutButton;
	private JComboBox<String> comboBox;

	public PresentationJPanel() {
		init();
	}

	private void init() {
		setBackground(new Color(255, 99, 71));
		setLayout(new BorderLayout());

		JPanel centerPanel = new JPanel();
		centerPanel.setOpaque(false);
		add(centerPanel, BorderLayout.CENTER);
		GridBagLayout gbl_centerPanel = new GridBagLayout();
		gbl_centerPanel.rowHeights = new int[] { 0, 40, 150 };
		gbl_centerPanel.columnWidths = new int[] { 150, 40, 150 };
		centerPanel.setLayout(gbl_centerPanel);

		titleLabel = new JLabel();
		titleLabel.setFont(new Font("Constantia", Font.PLAIN, 50));
		titleLabel.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridwidth = 3;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 0);
		gbc_lblTitulo.gridx = 0;
		gbc_lblTitulo.gridy = 0;
		centerPanel.add(titleLabel, gbc_lblTitulo);

		signinButton = new JButton();
		signinButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signinButton.setBackground(Color.WHITE);
		signinButton.setForeground(new Color(255, 99, 71));
		signinButton.setActionCommand(Command.CREATE_ACCOUNT.toString());
		signinButton.addActionListener(LivestockListener.getIntance());
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 2;
		centerPanel.add(signinButton, gbc_btnNewButton);

		loginButton = new JButton();
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		loginButton.setBackground(Color.WHITE);
		loginButton.setForeground(new Color(255, 99, 71));
		loginButton.setActionCommand(Command.SIGNIN_LOGIN.toString());
		loginButton.addActionListener(LivestockListener.getIntance());
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.gridx = 2;
		gbc_button.gridy = 2;
		centerPanel.add(loginButton, gbc_button);

		JPanel southPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) southPanel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		southPanel.setBackground(new Color(250, 250, 210));
		add(southPanel, BorderLayout.SOUTH);

		ChangeLanguage.getInstance().setLanguage(Language.ESPANIOL);
		comboBox = new JComboBox<>(ChangeLanguage.getInstance().getLanguageList());
		this.comboBox.addItemListener(LanguageListener.getInstance());
		southPanel.add(comboBox);
		
		aboutButton = new JButton();
		aboutButton.setActionCommand(Command.ABOUT.toString());
		aboutButton.addActionListener(LivestockListener.getIntance());
		southPanel.add(aboutButton);
		
		ChangeLanguage.getInstance().setPresentationJPanel(this);
	}

	public void setStringsLanguage(String title, String createAccount, String logIn, String about) {
		this.titleLabel.setText(title);
		this.signinButton.setText(createAccount);
		this.loginButton.setText(logIn);
		this.aboutButton.setText(about);
	}
}
