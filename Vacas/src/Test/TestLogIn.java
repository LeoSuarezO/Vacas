package Test;

import com.uptc.livestock.view.LogInJDialog;

public class TestLogIn {
	public static void main(String[] args) {
		LogInJDialog ld= new LogInJDialog();
		ld.setStringsLanguages(
				"usuario", 
				"000000", 
				"Ingresar al servicio", 
				"Ingresar", 
				"Crear cuent", 
				"olvido contraseña");
		ld.setVisible(true);
	}
}
