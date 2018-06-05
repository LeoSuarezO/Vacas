package com.uptc.livestock.view.login;

import javax.swing.JPanel;

import com.uptc.livestock.controller.ChangeLanguage;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;

public class RecentUserJPanel extends JPanel{
	private JButton addHerdButton;
	private JButton addBovineButton;
	
	public RecentUserJPanel() {
		addHerdButton = new JButton();
		addBovineButton = new JButton();
		init();
	}
	
	private void init() {
		ChangeLanguage.getInstance().setRecentUserJPanel(this);
		ChangeLanguage.getInstance().updateRecentUserJPanelLanguage();
		
		setOpaque(false);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.EAST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(addHerdButton);
		panel.add(addBovineButton);
		
	}
	
	public void setStringsLanguage(String herdbutton, String bovinebutton) {
		addHerdButton.setText(herdbutton);
		addBovineButton.setText(bovinebutton);
	}
	
}
