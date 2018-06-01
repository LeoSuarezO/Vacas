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
	
	public PanelDataBovineMilk() {
		super();
		this.nameBovine = new JLabel("NOMBRE: Gardenia");
		this.raceBovine = new JLabel("RAZA: Holstein");
		this.numberBirths = new JLabel("NUMERO DE PARTOS: 3");
		this.dataLastBirth = new JLabel("FECHA DEL ULTIMO PARTO: 23/02/2018");
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

}
