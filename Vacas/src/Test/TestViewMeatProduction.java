package Test;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.uptc.livestock.model.entity.Bovine;
import com.uptc.livestock.model.entity.Cow;
import com.uptc.livestock.model.entity.HealthCondition;
import com.uptc.livestock.model.entity.MyDate;
import com.uptc.livestock.model.entity.Race;
import com.uptc.livestock.view.CowGUI;
import com.uptc.livestock.view.JPanelMeatProduction;

public class TestViewMeatProduction {
	
	public static void main(String[] args) {
		Bovine bovine = new Bovine((short)123, "Mimi", new MyDate((short)11, (short)03, (short)2000), Race.HOLSTEIN, 200, "mastitis", HealthCondition.GOOD_HEALTH);
		Cow cow = new Cow(bovine, new MyDate((short)7, (short)5, (short)2018), 2, (short)120);
		CowGUI cowGUI = new CowGUI(bovine, cow);
		JPanelMeatProduction jPanelMeatProduction = new JPanelMeatProduction(cowGUI);
		jPanelMeatProduction.setStringsLanguaje("NOMBRE DEL BOVINO: ", "RAZA DEL BOVINO: ", "PESO VIVO (Kg): ", "PESO MUERTO (kg): pendiente", "PRODUCCION DE CARNE", "TOTAL DE CARNE PRODUCIDA", "CAMBIAR DE BOVINO", "REGRESAR");
		JFrame jFrame = new JFrame("Milk Production");
		jFrame.setVisible(true);
		jFrame.setSize(660, 500);
		jFrame.setLocationRelativeTo(null);;
		jFrame.add(jPanelMeatProduction);
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
