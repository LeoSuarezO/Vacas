package Test;

import com.uptc.livestock.model.entity.Bovine;
import com.uptc.livestock.model.entity.HealthCondition;
import com.uptc.livestock.model.entity.MyDate;
import com.uptc.livestock.model.entity.Race;

public class TestBovine {
	
	public static void main(String[] args) {
		Bovine[] bovine = {new Bovine((short) 123, "Ramon", new MyDate((short)23, (short)05, (short)2014), Race.ANGUS, 120, "None", HealthCondition.GOOD_HEALTH),
							new Bovine((short) 124, "Manchas", new MyDate((short)12, (short)03, (short)2016), Race.BLANCO_OREJINEGRO, 120, "None", HealthCondition.GOOD_HEALTH),
							new Bovine((short) 125, "Filomena", new MyDate((short)20, (short)8, (short)2017), Race.BRAHMAN, 100, "None", HealthCondition.GOOD_HEALTH)
						  };
		
		for (Bovine bovine2 : bovine) {
			System.out.println("Raza de " +bovine2.getName() +": " +bovine2.getRace());
			System.out.println("Peso de " +bovine2.getName() +": " +bovine2.getWeight() +" kilogramos");
			System.out.println(bovine2.getName() +" va a producir " +bovine2.productionMeat() +" kg. de carne");
			System.out.println("=========================================");
		}		
	}
	
}
