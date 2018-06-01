package com.uptc.livestock.model.entity;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate{
	private short year;
	private short month;
	private short day;
	private static Calendar toDate = new GregorianCalendar();
	
	
	public MyDate(short day, short month, short year){
		this.day = day;                               
		this.month = month;                           
		this.year = year;                             
	}
		
	public short getYear() {
		return year;
	}
	
	public void setYear(short year) {
		this.year =  year;
	}
	
	public short getMonth() {
		return month;
	}
	
	public void setMonth(short month) {
		this.month = month;
	}
	
	public short getDay() {
		return day;
	}
	
	public void setDay(short day) {
		this.day = day;
	}	
	
	public static int getCurrentDay(){
		return toDate.get(Calendar.DAY_OF_MONTH);
	}
	
	public static int getCurrentMonth(){
		return toDate.get(Calendar.MONTH)+1;
	}
	
	public static int getCurrentYear(){
		return toDate.get(Calendar.YEAR);
	}
		
	public static int passToDays(MyDate myDate) {
		return ((getCurrentYear() - myDate.year)*365) + ((getCurrentMonth()-myDate.month)*30) +(getCurrentDay()-myDate.day);
	}
	
}