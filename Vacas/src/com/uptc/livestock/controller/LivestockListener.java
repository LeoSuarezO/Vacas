package com.uptc.livestock.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LivestockListener implements ActionListener {
	private LivestockListener livestockListener;

	private LivestockListener() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

	public LivestockListener getIntance() {
		if (livestockListener == null) {
			livestockListener = new LivestockListener();
		}
		return livestockListener;
	}
}
