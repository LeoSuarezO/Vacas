package com.uptc.livestock.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelMilkProduction extends JPanel{
	
	private PanelDataBovineMilk panelDataBovineMilk;
	private CowGUI cowGUI;
	
	private JLabel title;
	private JLabel labelTotalMeat;
	private JLabel imageBovine;
	private JButton changeBovine;
	private JButton exit;;
	
	public JPanelMilkProduction(CowGUI cowGUI) {
		super();
		this.cowGUI = cowGUI;
		this.title = new JLabel();
		this.labelTotalMeat = new JLabel();
		this.panelDataBovineMilk = new PanelDataBovineMilk(cowGUI);
		this.imageBovine = new JLabel();
		this.changeBovine = new JButton();
		this.exit = new JButton();
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
		this.add(panelDataBovineMilk, grConstraints);
		
		
//		this.labelTotalMeat.setText("LITROS DE LECHE ESPERADOS: " +cowGUI.getCantMilkProduce());
		this.labelTotalMeat.setFont(new Font("constantia", Font.BOLD, 15));
		grConstraints.gridx = 0;
		grConstraints.gridy = 3;
		grConstraints.gridwidth = 1;
		grConstraints.gridheight = 1;
		grConstraints.weighty = 1;
		this.add(labelTotalMeat, grConstraints);
		
		grConstraints.gridx = 1;
		grConstraints.gridy = 4;
		grConstraints.gridwidth = 1;
		grConstraints.gridheight = 1;
		grConstraints.weightx = 0;
		this.add(changeBovine, grConstraints);
		
		grConstraints.gridx = 2;
		grConstraints.gridy = 4;
		grConstraints.gridwidth = 1;
		grConstraints.gridheight = 2;
		grConstraints.weightx = 1;
		this.add(exit, grConstraints);
		
		ImageIcon imageIcon = new ImageIcon("src/res/images/canteen.png");
		Icon icon = new ImageIcon(imageIcon.getImage().getScaledInstance(320, 300, Image.SCALE_AREA_AVERAGING));
		this.imageBovine.setIcon(icon);
		grConstraints.gridx = 1;
		grConstraints.gridy = 1;
		grConstraints.gridwidth = 2;
		grConstraints.gridheight = 1;
		grConstraints.weightx = 0;
		grConstraints.weighty = 0;
		this.add(imageBovine, grConstraints);		
	}
	
	public void setTextLanguaje(String nameBovine, String raceBovine, String numberBirths, String dataLastBirth, String tile, String labelTotalMilk, String buttonChangeBovine, String buttonExit) {
		this.panelDataBovineMilk.setStringsLanguaje(nameBovine, raceBovine, numberBirths, dataLastBirth);
		this.title.setText(tile);
		this.labelTotalMeat.setText(labelTotalMilk +this.cowGUI.getCantMilkProduce());
		this.changeBovine.setText(buttonChangeBovine);
		this.exit.setText(buttonExit);
	}

}
