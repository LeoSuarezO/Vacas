package com.uptc.livestock.view.login;

import javax.swing.JPanel;

import com.uptc.livestock.controller.LivestockListener;
import com.uptc.livestock.model.entity.Rancher;

public class MainJPanel extends JPanel{
	
	private RecentUserJPanel recentUserJPanel;
	private FrequentUserJPanel frequentUserJPanel;
	
	private Rancher rancher;
	
	public MainJPanel() {
		init();
	}
	
	private void init() {
		LivestockListener.getIntance().setMainJPanel(this);
	}
	
	public void setRancher(Rancher rancher) {
		this.rancher = rancher;
		if(rancher.getHerds().isEmpty())
			addRecentUser();
		else
			addFrequentUser();
	}
	
	private void addRecentUser() {
		this.recentUserJPanel= new RecentUserJPanel();
		add(recentUserJPanel);
	}
	
	private void addFrequentUser() {
		this.frequentUserJPanel = new FrequentUserJPanel();
		add(frequentUserJPanel);
	}
}
