package Test;

import com.uptc.livestock.view.JDialogNewBovine;

public class TestJDialogNewBovine {

	public static void main(String[] args) {

		JDialogNewBovine newBovine = new JDialogNewBovine();

		newBovine.setStringsLanguages("Nombre", "Etapa de lactancia", "Dia", "Mes", "Año", "Peso", "Vacunas",
				"Numero de Partos", "Macho", "Hembra", "Añadir", "Cancelar", "Añadir Bovino");
		newBovine.setVisible(true);

	}

}
