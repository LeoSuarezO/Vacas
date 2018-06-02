package Test;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.uptc.livestock.model.entity.Bovine;
import com.uptc.livestock.model.entity.HealthCondition;
import com.uptc.livestock.model.entity.MyDate;
import com.uptc.livestock.model.entity.Race;
import com.uptc.livestock.view.BovineGUI;
import com.uptc.livestock.view.JPanelPersonalDataBovine;

public class TestViewDataBovine {
	public static void main(String[] args) {
		Bovine bovine = new Bovine((short)123, "Mimi", new MyDate((short)11, (short)03, (short)2000), Race.CAQUETEÑO, 200, "mastitis", HealthCondition.GOOD_HEALTH);
		BovineGUI bovineGUI = new BovineGUI(bovine);
		JPanelPersonalDataBovine jPanelPersonalDataBovine = new JPanelPersonalDataBovine(bovineGUI);
		jPanelPersonalDataBovine.setTextLanguaje("ID: ", "NOMBRE: ", "RAZA: ", "GENERO: ", "PESO: ", "VACUNAS: ", "ESTADO DE SALUD: ", "DATOS PERSONALES", "REGRESAR");
		JFrame jFrame = new JFrame("Milk Production");
		jFrame.setVisible(true);
		jFrame.setSize(660, 500);
		jFrame.setLocationRelativeTo(null);;
		jFrame.add(jPanelPersonalDataBovine);
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
