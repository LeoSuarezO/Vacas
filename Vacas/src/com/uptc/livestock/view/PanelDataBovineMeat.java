package com.uptc.livestock.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDataBovineMeat extends JPanel{
	
	private JLabel nameBovine;
	private JLabel raceBovine;
	private JLabel liveWeight;
	private CowGUI cowGUI;
	
	public PanelDataBovineMeat(CowGUI cowGUI) {
		super();
		this.cowGUI = cowGUI;
		this.nameBovine = new JLabel();
		this.raceBovine = new JLabel();
		this.liveWeight = new JLabel();
		init();
	}

	private void init() {
		this.setLayout(new GridLayout(4, 1, 20, 20));
		this.nameBovine.setFont(new Font("constantia", Font.BOLD, 15));
		this.raceBovine.setFont(new Font("constantia", Font.BOLD, 15));
		this.liveWeight.setFont(new Font("constantia", Font.BOLD, 15));
		this.add(nameBovine);
		this.add(raceBovine);
		this.add(liveWeight);
	}
	
	public void setStringsLanguaje(String nameBovine, String raceBovine, String liveWeight) {
		this.nameBovine.setText(nameBovine +this.cowGUI.getName());
		this.raceBovine.setText(raceBovine +cowGUI.getRace());
		this.liveWeight.setText(liveWeight +cowGUI.getWeight());
	}

}
