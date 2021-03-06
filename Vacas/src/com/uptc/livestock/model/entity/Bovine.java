package com.uptc.livestock.model.entity;


/**
 * Clase Bovine
 * 
 * @since 1.8
 * @author Andres Chaparro, Fabian Cristancho, David Malaver, Kevin Suerez
 *         Fecha: 30/05/2018
 *
 */

public class Bovine {

	private short id;
	private String name;
	private MyDate birthDate;
	protected boolean isCow;
	private Race race;
	private double weight;
	private String vaccine;
	private HealthCondition healthCondition;

	public Bovine(short id, String name, MyDate birthDate, Race race, double weight, String vaccine,
			HealthCondition healthCondition) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.race = race;
		this.weight = weight;
		this.vaccine = vaccine;
		this.healthCondition = healthCondition;
	}
	
	public double productionMeat() {
		double meatProduce = 0;
		switch (getRace().getCharact()) {
		case Constant.BOVINE_AGILE:
			meatProduce = this.weight*0.525;
			break;
		case Constant.BOVINE_NORMAL:
			meatProduce = this.weight*0.45;
			break;
		default:
			break;
		}
		return meatProduce;
	}
	
	
	public short getAge() {
		return (short) (MyDate.getCurrentYear() - this.birthDate.getYear());
	}
	
	/**
	 * Obtiene la identificacion del bovino
	 * 
	 * @return Identificacion del bovino
	 */

	public short getId() {
		return id;
	}

	/**
	 * Le asigna una identificacion al bovino
	 * 
	 * @param id
	 *            Identificacion
	 */

	public void setId(short id) {
		this.id = id;
	}

	/**
	 * Obtiene el nombre del bovino
	 * 
	 * @return Nombre de bovino
	 */

	public String getName() {
		return name;
	}

	/**
	 * Le asigna un nombre a un bovino
	 * 
	 * @param name
	 *            Nombre de bovino
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Obtiene la fecha de nacimiento del bovino
	 * 
	 * @return Feha de nacimiento
	 */

	public MyDate getBirthDate() {
		return birthDate;
	}

	/**
	 * Le asigna una fecha de nacimiento al bovino
	 * 
	 * @param birthDate
	 *            Fecha de nacimiento
	 */

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Obtiene la raza del bovino
	 * 
	 * @return Raza de bovino
	 */

	public Race getRace() {
		return race;
	}

	/**
	 * Le asigna una raza al bovino
	 * 
	 * @param race
	 *            Raza de bovino
	 */

	public void setRace(Race race) {
		this.race = race;
	}

	/**
	 * Obtiene el peso del bovino
	 * 
	 * @return Peso del bovino
	 */

	public double getWeight() {
		return weight;
	}

	/**
	 * Le asigna un peso al bovino
	 * 
	 * @param weight
	 *            Peso a bovino
	 */

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Obtiene las vacunas suministradas al bovino
	 * 
	 * @return Vacunas
	 */

	public String getVaccine() {
		return vaccine;
	}

	/**
	 * Suministra vacunas al bovino
	 * 
	 * @param vaccine
	 *            Vacunas
	 */

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	/**
	 * Obtiene la condicion de salud de un bovino
	 * 
	 * @return Estado de salud
	 */

	public HealthCondition getHealthCondition() {
		return healthCondition;
	}

	/**
	 * Asigna un estado de salud al bovino
	 * 
	 * @param healthCondition
	 *            Estado de salud
	 */

	public void setHealthCondition(HealthCondition healthCondition) {
		this.healthCondition = healthCondition;
	}

}
