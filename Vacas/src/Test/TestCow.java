package Test;

import com.uptc.livestock.model.entity.Bovine;
import com.uptc.livestock.model.entity.Cow;
import com.uptc.livestock.model.entity.HealthCondition;
import com.uptc.livestock.model.entity.MyDate;
import com.uptc.livestock.model.entity.Race;

public class TestCow {
	
	public static void main(String[] args) {
		Bovine bovine = new Bovine((short)123, "Mimi", new MyDate((short)11, (short)03, (short)2018), Race.HOLSTEIN, 200, "mastitis", HealthCondition.GOOD_HEALTH);
		Cow cow = new Cow(bovine, new MyDate((short)7, (short)5, (short)2018), 6, (short)120);
		System.out.println("Posible produccion de litros de leche para mañana:" +cow.getCantMilkProduce());
	}

}
