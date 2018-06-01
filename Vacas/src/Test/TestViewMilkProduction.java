package Test;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.uptc.livestock.model.entity.Bovine;
import com.uptc.livestock.model.entity.Cow;
import com.uptc.livestock.model.entity.HealthCondition;
import com.uptc.livestock.model.entity.MyDate;
import com.uptc.livestock.model.entity.Race;
import com.uptc.livestock.view.CowGUI;
import com.uptc.livestock.view.JPanelMilkProduction;

public class TestViewMilkProduction {

	public static void main(String[] args) {
		Bovine bovine = new Bovine((short)123, "Mimi", new MyDate((short)11, (short)03, (short)2000), Race.HOLSTEIN, 200, "mastitis", HealthCondition.GOOD_HEALTH);
		Cow cow = new Cow(bovine, new MyDate((short)7, (short)5, (short)2018), 2, (short)120);
		CowGUI cowGUI = new CowGUI(bovine, cow);
		JPanelMilkProduction jPanelMilkProduction = new JPanelMilkProduction(cowGUI);
		jPanelMilkProduction.setTextLanguaje("NOMBRE DEL BOVINO: ", "RAZA DEL BOVINO: ", "NUMERO DE PARTOS: ", "FECHA ULTIMO PARTO: ", "PRODUCCION DE LECHE", "LITROS DE LECHE ESPERADOS: ", "CAMBIAR DE BOVINO", "SALIR");
		JFrame jFrame = new JFrame("Milk Production");
		jFrame.setVisible(true);
		jFrame.setSize(660, 500);
		jFrame.setLocationRelativeTo(null);;
		jFrame.add(jPanelMilkProduction);
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
