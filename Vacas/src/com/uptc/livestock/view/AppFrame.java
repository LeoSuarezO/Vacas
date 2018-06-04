package com.uptc.livestock.view;

import javax.swing.JFrame;

import com.uptc.livestock.controller.ChangeLanguage;
import com.uptc.livestock.controller.LivestockListener;

public class AppFrame extends JFrame {
	
	private AppJMenuBar appJMenuBar;
	private PresentationJPanel presentationJPanel;
	private MainJPanel mainJPanel;
	
	public AppFrame() {
		this.presentationJPanel= new PresentationJPanel();
		this.mainJPanel = new MainJPanel();
		new SignInJDialog();
		new LogInJDialog();
		this.appJMenuBar = new AppJMenuBar();
		this.init();
	}

	private void init() {
		ChangeLanguage.getInstance().setLanguage(Language.ESPANIOL);
		LivestockListener.getIntance().setAppFrame(this);
		
		add(presentationJPanel);

		ChangeLanguage.getInstance().setAppFrame(this);
		ChangeLanguage.getInstance().updateAppFrameLanguage();
		this.setUndecorated(true);
		this.setSize(640, 480);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void loginProcess() {
		dispose();
		remove(presentationJPanel);
		add(mainJPanel);
		setJMenuBar(appJMenuBar);
		setUndecorated(false);
		setVisible(true);
	}
	
	public void logoutProcess() {
		dispose();
		setJMenuBar(null);
		setUndecorated(true);
		setVisible(true);
	}
}
