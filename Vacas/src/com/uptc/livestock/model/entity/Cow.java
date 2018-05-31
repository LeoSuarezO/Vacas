package com.uptc.livestock.model.entity;

public class Cow extends Bovine {

	private double cantMilkProduce;
	private MyDate dateBirths;
	private int numberBirths;
	private MyDate dateDryPeriod;
	

	public Cow(Bovine bovine, MyDate datePart, int numberBirths, MyDate dateDryPeriod) {
		super(bovine.getId(), bovine.getName(), bovine.getBirthDate(), bovine.getRace(), bovine.getWeight(), bovine.getVaccine(), bovine.getHealthCondition());
		this.dateDryPeriod = dateDryPeriod;
		this.dateBirths = datePart;
		this.numberBirths = numberBirths;
	}
	
	public void cantProdAge() {
		if(this.getAge()>=2 && this.getAge()<=8) {
			cantMilkProduce+= (cantMilkProduce*0.25);
		}else if(this.getAge()>=8) {
			cantMilkProduce -= (cantMilkProduce*0.10);
		}
	}
	
	public void cantProdParts() {
		if(true) ;
	}
	
	/**
	 * Obtiene la diferencia entre el mes actual y el mes de parto de la cria
	 */
	private short getMonthDiferences() {
		return (short) (MyDate.getCurrentMonth()-dateBirths.getMonth());
	}
	
	/**
	 * disminuye la cantidad de produccion a medida que aumenta el tiempo desde el mes del parto
	 */
	
	public void breastFeedingPeriod() {
		int i=1;
		double percent = 0.008;
		while(i!=getMonthDiferences()) {
			percent*=2;
			i++;
		}
		cantMilkProduce -= (cantMilkProduce*percent);
	}
	
	public void getnumberBirths() {
		if(numberBirths > 5) {
			System.out.println("La vaca no puede dar mas leche porque el numero de partos está al tope");
		}
	}
	
	public void cowIsSick(){
		if(this.getHealthCondition().equals(HealthCondition.SICK)) {
			System.out.println("La leche no debería ser consumida porque la vaca está enferma");
		}
	}

	
	public void productionMilkAverage() {
		switch (this.getRace()) {
		case BLANCO_OREJINEGRO:
			cantMilkProduce = 18;
			break;
		case BUFALA:
			cantMilkProduce = 20;
			break;
		case NORMANDO:
			cantMilkProduce = 14.2;
			break;
		case SIMMENTAL:
			cantMilkProduce = 18;
			break;
		case JERSEY:
			cantMilkProduce = 18;
			break;
		case HOLSTEIN:
			cantMilkProduce = 25;
			break;
		case CEBU:
			cantMilkProduce = 22;
			break;
		case CAQUETEÑO:
			cantMilkProduce = 15;
			break;
		case CHINO_SANTANDEREANO:
			cantMilkProduce = 12;
			break;
		case COSTEÑO_CON_CUERNOS_:
			cantMilkProduce = 17;
			break;
		case HARTON_DEL_VALLE:
			cantMilkProduce = 20;
			break;
		case LUCERNA:
			cantMilkProduce = 20;
			break;
		case SANMARTINERO:
			cantMilkProduce = 15;
			break;
		case VELAZQUEZ:
			cantMilkProduce = 7.5;
			break;
		case GYR:
			cantMilkProduce = 32;
			break;
		default:
			cantMilkProduce = 15;
			break;
		}
	}
	
	
	//Getters y Setters
	
	public double getCantMilkProduce() {
		return cantMilkProduce;
	}
	
	public void setCantMilkProduce(double cantMilkProduce) {
		this.cantMilkProduce = cantMilkProduce;
	}

	public MyDate getDatePart() {
		return dateBirths;
	}

	public void setDatePart(MyDate datePart) {
		this.dateBirths = datePart;
	}

	public MyDate getDateDryPeriod() {
		return dateDryPeriod;
	}

	public void setDateDryPeriod(MyDate dateDryPeriod) {
		this.dateDryPeriod = dateDryPeriod;
	}

	public int getNumParts() {
		return numberBirths;
	}

	public void setNumParts(int numParts) {
		this.numberBirths = numParts;
	}
}
