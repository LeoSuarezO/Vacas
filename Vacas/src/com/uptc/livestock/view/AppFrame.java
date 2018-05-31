package com.uptc.livestock.view;

import javax.swing.JFrame;

import com.uptc.livestock.persistence.MyProperties;

public class AppFrame extends JFrame {
	public AppFrame() {
		new LogInJDialog(new String[] { "Usuario", "        ", "INGRESAR AL SERVICIO", "Ingresar", "Crear cuenta",
				"\u00BFOlvido su contrase\u00F1a?" });
		init();
	}

	private void init() {
		language(Language.ESPANIOL);
		this.setSize(640,480);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void language(Language language) {
		MyProperties properties = new MyProperties(language);
		this.setTitle(properties.getProperty("title"));
	}
}
