package Test;

import com.uptc.livestock.model.entity.Bovine;
import com.uptc.livestock.model.entity.Cow;
import com.uptc.livestock.model.entity.HealthCondition;
import com.uptc.livestock.model.entity.MyDate;
import com.uptc.livestock.model.entity.Race;

public class TestCow {
	
	public static void main(String[] args) {
		Bovine bovine = new Bovine((short)123, "Mimi", new MyDate((short)11, (short)03, (short)2018), Race.HOLSTEIN, 200, "mastitis", HealthCondition.SICK);
		Cow cow = new Cow(bovine, new MyDate((short)12, (short)02, (short)2018), 6, new MyDate((short)02, (short)02, (short)2018));
		cow.productionMilkAverage(); //cantidad de leche producida dependiendo de la raza
//		cow.cantProdAge(); //cantidad sube o baja dep. de la edad
		cow.cowIsSick();
		cow.breastFeedingPeriod(); //Cantidad baja dependiendo del periodo de lactancia
		cow.getnumberBirths();
		System.out.println("Posible produccion de litros de leche para mañana:" +cow.getCantMilkProduce());
	}

}
