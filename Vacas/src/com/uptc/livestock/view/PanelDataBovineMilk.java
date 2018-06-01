package com.uptc.livestock.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDataBovineMilk extends JPanel{
	
	private JLabel nameBovine;
	private JLabel raceBovine;
	private JLabel numberBirths;
	private JLabel dataLastBirth;
	private CowGUI cowGUI;
	
	public PanelDataBovineMilk(CowGUI cowGUI) {
		super();
		this.cowGUI = cowGUI;
		this.nameBovine = new JLabel();
		this.raceBovine = new JLabel();
		this.numberBirths = new JLabel();
		this.dataLastBirth = new JLabel();
		init();
	}

	private void init() {
		this.setLayout(new GridLayout(4, 1, 20, 20));
		this.nameBovine.setFont(new Font("constantia", Font.BOLD, 15));
		this.raceBovine.setFont(new Font("constantia", Font.BOLD, 15));
		this.numberBirths.setFont(new Font("constantia", Font.BOLD, 15));
		this.dataLastBirth.setFont(new Font("constantia", Font.BOLD, 15));
		this.add(nameBovine);
		this.add(raceBovine);
		this.add(numberBirths);
		this.add(dataLastBirth);
	}
	
	public void setStringsLanguaje(String nameBovine, String raceBovine, String numberBirths, String dataLastBirth) {
		this.nameBovine.setText(nameBovine +this.cowGUI.getName());
		this.raceBovine.setText(raceBovine +cowGUI.getRace());
		this.numberBirths.setText(numberBirths +cowGUI.getNumParts());
		this.dataLastBirth.setText(dataLastBirth +cowGUI.getMessageAnyDate(cowGUI.getDatePart()));
	}

}
