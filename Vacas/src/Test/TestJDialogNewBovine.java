package Test;

import com.uptc.livestock.view.JDialogNewBovine;

public class TestJDialogNewBovine {

	public static void main(String[] args) {

		JDialogNewBovine newBovine = new JDialogNewBovine();

		newBovine.setStringsLanguages("Nombre", "Etapa de lactancia", "Dia", "Mes", "A�o", "Peso", "Vacunas",
				"Numero de Partos", "Macho", "Hembra", "A�adir", "Cancelar", "A�adir Bovino");
		newBovine.setVisible(true);

	}

}
