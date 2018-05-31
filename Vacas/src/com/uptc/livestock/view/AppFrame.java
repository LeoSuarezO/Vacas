package com.uptc.livestock.view;

import javax.swing.JFrame;

public class AppFrame extends JFrame {
	public AppFrame() {
		new LogInJDialog(new String[] { "Usuario", "        ", "INGRESAR AL SERVICIO", "Ingresar", "Crear cuenta",
				"\u00BFOlvido su contrase\u00F1a?" });
		init();
	}

	private void init() {
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
