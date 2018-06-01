package com.uptc.livestock.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDataBovineMeat extends JPanel{
	
	private JLabel nameBovine;
	private JLabel raceBovine;
	private JLabel liveWeight;
	private JLabel deathWeight;
	
	public PanelDataBovineMeat() {
		super();
		this.nameBovine = new JLabel("NOMBRE: Lola");
		this.raceBovine = new JLabel("RAZA: Brahman");
		this.liveWeight = new JLabel("PESO VIVO: 120");
		this.deathWeight = new JLabel("PESO MUERTO: 75");
		init();
	}

	private void init() {
		this.setLayout(new GridLayout(4, 1, 20, 20));
		this.nameBovine.setFont(new Font("constantia", Font.BOLD, 15));
		this.raceBovine.setFont(new Font("constantia", Font.BOLD, 15));
		this.liveWeight.setFont(new Font("constantia", Font.BOLD, 15));
		this.deathWeight.setFont(new Font("constantia", Font.BOLD, 15));
		this.add(nameBovine);
		this.add(raceBovine);
		this.add(liveWeight);
		this.add(deathWeight);
	}

}
