package com.uptc.livestock.view;

import javax.swing.JFrame;

import com.uptc.livestock.controller.ChangeLanguage;
import com.uptc.livestock.controller.LivestockListener;

public class AppFrame extends JFrame {
	private AppJMenuBar appJMenuBar;
	private PresentationJPanel presentationJPanel;
	
	public AppFrame() {
		this.presentationJPanel= new PresentationJPanel();
		new SignInJDialog();
		new LogInJDialog();
		this.appJMenuBar = new AppJMenuBar();
		this.init();
	}

	private void init() {
		ChangeLanguage.getInstance().setLanguage(Language.ESPANIOL);
		LivestockListener.getIntance().setAppFrame(this);
		LivestockListener.getIntance().setAppJMenuBar(appJMenuBar);
		
		add(presentationJPanel);

		ChangeLanguage.getInstance().setAppFrame(this);
	
//		this.setUndecorated(true);
		this.setSize(640, 480);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
