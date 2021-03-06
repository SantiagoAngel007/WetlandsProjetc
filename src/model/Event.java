package model;

/** Clase Event 
*@author Santiago Angel
*Is used to create, set, or get the an event and the characteristics of an event in a wetland.
* */

public class Event{
	
	/**
	* An atribute called eventType with type String is created to refer us to the name of any event.
	*/
	private String eventType;
	
	/**
	* An atribute called eventOrganizer with type String is created to refer us to the name of any organizer that want to make an event.
	*/
	private String eventOrganizer;
	
	/**
	* An atribute called cost with type double is created to refer us to the cost of any event.
	*/
	private double cost;
	
	/**
	* An atribute called description with type String is created to refer us to the description of any event.
	*/
	private String description;
	
	
	//Asiociations
	
	/**
	* An asociation used to get ojects type Date to create the date of an event.
	*/
	//private Date date;
	private int date;
	
	/**
	* An asociation used to get an object in the array of wetlands.
	*/
	private Wetland[] wetland;
	
	
	//Constructora
	
	/**
	* Descriptión: create new objects of type Event.<br>
	* <b> pre:</b> All the attributes must be inizializted. <br>
	* <b> pos:</b> Save all the objects in the array Event[].
	*/
	public Event(String eveType, int dat, String eveOrg, double cot, String descrip){
		
		this.eventType = eveType;
		
		this.date = dat;
		
		this.eventOrganizer = eveOrg;
		
		this.cost = cot;
		
		this.description = descrip;
			
	}
	
	//Gets modificado int
	
	public String getEventType(){
		return eventType;
	}
	
	public int getDate(){
		return date;
	}
	
	public String getEventOrganizer(){
		return eventOrganizer;
	}
	
	public double getCost(){
		return cost;
	}
	
	public String getDescription(){
		return description;
	}
	
	
	//Sets
	
	public void setEventType(String eveType){
		eventType = eveType;
	}
	
	public void setDate(int dat){
		date = dat;
	}
	
	public void setEventOrganizer(String eveOrg){
		eventOrganizer = eveOrg;
	}
	
	public void setCost(double cot){
		cost = cot;
	}
	
	public void setDescription(String descrip){
		description = descrip;
	}
	
	/*
	public String toString(){
		
		return eventType + "/" + date + "/" + eventOrganizer + "/" + cost + "/" + description;
	}
	*/
	
	public String toString() {

		return "**** Event information ****\n" + 
		"Event type: " + eventType + "\n" +
		"The date: " + date + "\n" +
		"Event organizer: " + eventOrganizer + "\n" +
		"Cost: " + cost + "\n" +
		"Description " + description + "\n" ;	
	}
	

}