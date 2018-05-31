package com.uptc.livestock.view;

import javax.swing.JFrame;

public class AppFrame extends JFrame {
	public AppFrame() {
		new LogInJDialog();
		init();
	}

	private void init() {
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
