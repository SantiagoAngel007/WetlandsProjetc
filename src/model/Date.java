package model;

/** Clase Date 
*@author Santiago Angel
*Is used to created, set or get a date used in an event.
* */

public class Date{

	/**
	* An atribute called day with type int is created to select the day in a month.
	*/
	private int day;
	
	/**
	* An atribute called month with type int is created to select the month in a year.
	*/
	private int month;
	
	/**
	* An atribute called year with type int is created to select the year.
	*/
	private int year;
	
	
	
	/**
	* Descriptión: create new objects of type Date.<br>
	* <b> pre:</b> All the attributes must be inizializted. <br>
	*/
	public Date(int d, int m, int y ){
		
		day = d;
		month=m;
		year=y;
		
	}
	
	//Gets
	
	public int getDay(){
		return day;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getYear(){
		return year;
	}
	
	
	//Sets
	
	public void setDay(int d){
		day = d;
	}
	
	public void set(int m){
		month = m;
	}
	
	public void setYear(int y){
		year = y;
	}
	
	public String toString(){
		
		return day + "/" + month + "/" + year;
	}

}