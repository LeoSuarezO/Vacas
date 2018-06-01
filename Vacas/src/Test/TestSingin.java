package Test;

import com.uptc.livestock.view.SignInJDialog;

public class TestSingin {
	public static void main(String[] args) {
		SignInJDialog sd= new SignInJDialog();
		sd.setStringsLanguage(
				"Nombre", 
				"Apellido", 
				"Correo",
				"Telefono",
				"0000000",
				"0000000", 
				"Crear cuenta", 
				"Ingresar", 
				"Crear");
		sd.setVisible(true);
	}
}
