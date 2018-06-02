package com.uptc.livestock.view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelGeneralData extends JPanel{
	
	private BovineGUI bovineGUI;
	private JLabel nameBovine;
	private JLabel idBovine;
	private JLabel raceBovine;
	private JLabel gender;
	private JLabel weight;
	private JLabel vaccine;
	private JLabel healthCondition;
	
	public PanelGeneralData(BovineGUI bovineGUI) {
		super();
		this.bovineGUI = bovineGUI;
		this.nameBovine = new JLabel();
		this.idBovine = new JLabel();
		this.raceBovine = new JLabel();
		this.gender = new JLabel("Male");
		this.weight = new JLabel();
		this.vaccine = new JLabel();
		this.healthCondition = new JLabel();
		init();
	}

	private void init() {
		this.setLayout(new GridLayout(7, 1, 5, 5));
		this.add(idBovine);
		this.add(nameBovine);
		this.add(raceBovine);
		this.add(weight);
		this.add(vaccine);
		this.add(gender);
		this.add(healthCondition);
	}
	
	public void setTextLanguage(String id, String name, String raceBovine, String gender, String weight, String vaccine, String health) {
		this.idBovine.setText(id +bovineGUI.getId());
		this.nameBovine.setText(name +bovineGUI.getName());
		this.raceBovine.setText(raceBovine +bovineGUI.getRace());
		this.weight.setText(weight);
		this.vaccine.setText(vaccine +bovineGUI.getVaccine());
		this.healthCondition.setText(health +bovineGUI.getHealthCondition());
	}

}
