package com.uptc.livestock.view;

import javax.swing.JPanel;

import com.uptc.livestock.controller.LivestockListener;
import com.uptc.livestock.model.entity.Herd;
import com.uptc.livestock.model.entity.Rancher;

public class MainJPanel extends JPanel{
	private Rancher rancher;
	public MainJPanel() {
		init();
	}
	private void init() {
		LivestockListener.getIntance().setMainJPanel(this);
	}
	
	public void setRancher(Rancher rancher) {
		this.rancher = rancher;
	}
}
