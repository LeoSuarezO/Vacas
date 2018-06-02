package com.uptc.livestock.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelPersonalDataBovine extends JPanel{
	
	private PanelGeneralData panelGeneralData;
	private JLabel title;
	private JButton goBack;
	private JLabel imageBovine;
	private BovineGUI bovineGUI;
	
	public JPanelPersonalDataBovine(BovineGUI bovineGUI) {
		super();
		this.bovineGUI = bovineGUI;
		this.panelGeneralData = new PanelGeneralData(bovineGUI);
		this.title = new JLabel();
		this.imageBovine = new JLabel();
		this.goBack = new JButton();
		init();
	}

	private void init() {
		
		this.setBackground(new Color(235, 240, 244));
		this.setLayout(new GridBagLayout());
		this.title.setFont(new Font("constantia", Font.BOLD, 30));
		this.title.setForeground(new Color(8, 86, 142));
		GridBagConstraints grConstraints = new GridBagConstraints();
		grConstraints.gridx = 0;
		grConstraints.gridy = 0;
		grConstraints.gridwidth = 3;
		grConstraints.gridheight = 1;
		grConstraints.weightx = 1;
		grConstraints.weighty = 1;
		this.add(title, grConstraints);
		grConstraints.weighty = 0;
		
		grConstraints.gridx = 0;
		grConstraints.gridy = 1;
		grConstraints.gridwidth = 1;
		grConstraints.gridheight = 1;
		this.add(panelGeneralData, grConstraints);
		
		grConstraints.gridx = 2;
		grConstraints.gridy = 2;
		grConstraints.gridwidth = 1;
		grConstraints.gridheight = 1;
		grConstraints.weighty = 1;
//		grConstraints.weightx = 1;
		this.add(goBack, grConstraints);
		
//		ImageIcon imageIcon = new ImageIcon("src/res/images/GYR.jpg");
//		Icon icon = new ImageIcon(imageIcon.getImage().getScaledInstance(300, 200, Image.SCALE_AREA_AVERAGING));
		this.imageBovine.setIcon(bovineGUI.getImageBovine());
		grConstraints.gridx = 1;
		grConstraints.gridy = 1;
		grConstraints.gridwidth = 2;
		grConstraints.gridheight = 1;
		grConstraints.weightx = 0;
		grConstraints.weighty = 0;
		this.add(imageBovine, grConstraints);
	}
	
	public void setTextLanguaje(String id, String name, String raceBovine, String gender, String weight, String vaccine, String health, String title, String goBack) {
		panelGeneralData.setTextLanguage(id, name, raceBovine, gender, weight, vaccine, health);
		this.title.setText(title);
		this.goBack.setText(goBack);
	}
}
