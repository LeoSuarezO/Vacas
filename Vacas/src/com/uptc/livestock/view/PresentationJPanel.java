package com.uptc.livestock.view;

import javax.swing.JPanel;
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

public class PresentationJPanel extends JPanel{
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
		gbl_centerPanel.rowHeights = new int[]{0, 40, 150};
		gbl_centerPanel.columnWidths = new int[]{150, 40, 150};
		centerPanel.setLayout(gbl_centerPanel);
		
		JLabel titleLabel = new JLabel("Ganado");
		titleLabel.setFont(new Font("Constantia", Font.PLAIN, 50));
		titleLabel.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridwidth = 3;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 0);
		gbc_lblTitulo.gridx = 0;
		gbc_lblTitulo.gridy = 0;
		centerPanel.add(titleLabel, gbc_lblTitulo);
		
		JButton signinButton = new JButton("Crear cuenta");
		signinButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signinButton.setBackground(Color.WHITE);
		signinButton.setForeground(new Color(255, 99, 71));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 2;
		centerPanel.add(signinButton, gbc_btnNewButton);
		
		JButton loginButton = new JButton("Iniciar sesión");
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		loginButton.setBackground(Color.WHITE);
		loginButton.setForeground(new Color(255, 99, 71));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.gridx = 2;
		gbc_button.gridy = 2;
		centerPanel.add(loginButton, gbc_button);
		
		JPanel southPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) southPanel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		southPanel.setBackground(Color.WHITE);
		add(southPanel, BorderLayout.SOUTH);
		
		JComboBox<String> comboBox = new JComboBox<>(Language.DEFAULT.getLanguageList(Language.ESPANIOL));
		southPanel.add(comboBox);
		
		JButton btnAcercaDe = new JButton("Acerca de");
		southPanel.add(btnAcercaDe);
	}
	
}
