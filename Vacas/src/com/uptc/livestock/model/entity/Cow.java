package com.uptc.livestock.model.entity;

public class Cow extends Bovine {

	private double expectedMilkProduction;
//	private double realMilkProduction;
	private MyDate dateBirths;
	private int numberBirths;
	private short daysDryPeriod;
	

	public Cow(Bovine bovine, MyDate datePart, int numberBirths, short daysDryPeriod) {
		super(bovine.getId(), bovine.getName(), bovine.getBirthDate(), bovine.getRace(), bovine.getWeight(), bovine.getVaccine(), bovine.getHealthCondition());
		this.daysDryPeriod = daysDryPeriod;
		this.dateBirths = datePart;
		this.numberBirths = numberBirths;
	}
	
	//Factores que determinan la produccion de leche 
	
	private  void cantProdAge() {
		if(this.getAge()>=2 && this.getAge()<=8) { //Vacas maduras
			expectedMilkProduction+= (expectedMilkProduction*0.25);
		}else if(this.getAge()>=8) { //Vacas para matadero
			expectedMilkProduction -= (expectedMilkProduction*0.10);
		}
	}
	
	
	/**
	 * disminuye la cantidad de produccion a medida que aumenta el tiempo desde el mes del parto
	 */
	
	private void breastFeedingPeriod() {
		int i=0;
		double percent = 0.0002;
		while(i<=MyDate.passToDays(this.dateBirths)) {
			percent+=0.0002;
			if((i%30)==0) {
				percent*=2;
			}
			i++;
		}
		expectedMilkProduction -= (expectedMilkProduction*percent);
		System.out.println(percent);
	}
	
	private void cantDaysDryPeriod() {
		if(this.daysDryPeriod>60) {
			expectedMilkProduction -= (expectedMilkProduction*0.05);
		}
	}
	

	
	private void cowIsSick(){
		if(this.getHealthCondition().equals(HealthCondition.SICK)) {
			expectedMilkProduction -= (expectedMilkProduction*0.10);
		}
	}

	
	private void productionMilkAverage() {
		switch (this.getRace()) {
		case BLANCO_OREJINEGRO:
			expectedMilkProduction = 18;
			break;
		case BUFALA:
			expectedMilkProduction = 20;
			break;
		case NORMANDO:
			expectedMilkProduction = 14.2;
			break;
		case SIMMENTAL:
			expectedMilkProduction = 18;
			break;
		case JERSEY:
			expectedMilkProduction = 18;
			break;
		case HOLSTEIN:
			expectedMilkProduction = 25;
			break;
		case CEBU:
			expectedMilkProduction = 22;
			break;
		case CAQUETEÑO:
			expectedMilkProduction = 15;
			break;
		case CHINO_SANTANDEREANO:
			expectedMilkProduction = 12;
			break;
		case COSTEÑO_CON_CUERNOS:
			expectedMilkProduction = 17;
			break;
		case HARTON_DEL_VALLE:
			expectedMilkProduction = 20;
			break;
		case LUCERNA:
			expectedMilkProduction = 20;
			break;
		case SANMARTINERO:
			expectedMilkProduction = 15;
			break;
		case VELAZQUEZ:
			expectedMilkProduction = 7.5;
			break;
		case GYR:
			expectedMilkProduction = 32;
			break;
		default:
			expectedMilkProduction = 15;
			break;
		}
	}
	
	public String getMessageAnyDate(MyDate myDate) {
		return myDate.getDay() +"/" +myDate.getMonth() +"/" +myDate.getYear();
	}
	
	
	//Getters y Setters
	
	public double getCantMilkProduce() {
		productionMilkAverage();
		breastFeedingPeriod();
		cantProdAge();
		cowIsSick();
		cantDaysDryPeriod();
		return expectedMilkProduction;
	}
	
	public void setCantMilkProduce(double cantMilkProduce) {
		this.expectedMilkProduction = cantMilkProduce;
	}

	public MyDate getDatePart() {
		return dateBirths;
	}

	public void setDatePart(MyDate datePart) {
		this.dateBirths = datePart;
	}

	public short getDateDryPeriod() {
		return daysDryPeriod;
	}

	public void setDateDryPeriod(short daysDryPeriod) {
		this.daysDryPeriod = daysDryPeriod;
	}

	public int getNumParts() {
		return numberBirths;
	}

	public void setNumParts(int numParts) {
		this.numberBirths = numParts;
	}
}
