package model;

/** Clase Specie
*@author Santiago Angel
*Is used to create, set or get a specie and the characteristic of a specie in particular.
* */

public class Species{
	
	/**
	* An atribute called speciesType with type boolean is created to distinguish if the specie belong to flora or fauna.
	*/
	//private boolean speciesType;
	private String speciesType;
	
	/**
	* An atribute called name with type String is created to write the name of a specie in any wetland.
	*/
	private String name;		
	
	/**
	* An atribute called scientificName with type String is created to write the scientific name of a specie in any wetland.
	*/
	private String scientificName;
	
	/**
	* An atribute called isMigratory with type boolean is created to distinguish if the specie si migratory or not.
	*/
	//private boolean isMigratory;
	private String isMigratory;
	
	/**
	* An atribute called speciesType with type boolean is created to specify the type of specie in particular.
	*/
	private String envirometType;
	
	private int counterFlora;
	
	private int counterFauna;
	
	
	//Constructora
	
	/**
	* Descriptión: create new objects of type wetland.<br>
	* <b> pre:</b> All the attributes must be inizializted. <br>
	* <b> pos:</b> Save all the objects in the array Species[].
	*/
	public Species (String speType, String n, String scienName, String isMigra, String enviroType){
		
		this.speciesType = speType;
		
		this.name = n;
		
		this.scientificName = scienName;
		
		this.isMigratory = isMigra;
		
		this.envirometType = enviroType;
		
		
	}
	
	//Gets modificados int
	
	public String getSpecieType(){
		return speciesType;
	}
	
	public String getName(){
		return name;
	}
	
	public String getScientificName(){
		return scientificName;
	}
	
	public String getIsMigratory(){
		return isMigratory;
	}
	
	public String getEnviromentType(){
		return envirometType;
	}
	
	public int getCounterFlora(){
		return counterFlora;
	}
	
	public int getCounterFauna(){
		return counterFauna;
	}
	
	//Sets modificado int
	
	public void setSpecieType(String speType){
		speciesType = speType;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setScientificName(String scienName){
		scientificName = scienName;
	}
	
	public void setIsMigratory(String isMigra){
		isMigratory = isMigra;
	}
	
	public void setEnviromentType(String enviroType){
		envirometType = enviroType;
	}
	
	public void setCounterFlora(int counterFlora){
		this.counterFlora = counterFlora;
	}
	
	public void setCounterFauna(int counterFauna){
		this.counterFauna = counterFauna;
	}
	
	
	/*
	public String toString(){
		
		return speciesType + "/" + name + "/" + scientificName + "/" + isMigratory + "/" + envirometType;
	}
	*/
	
	
	public String toString() {

		return "**** Species information ****\n" + 
		"Species type: " + speciesType + "\n" +
		"Name: " + name + "\n" +
		"Scientific name: " + scientificName + "\n" +
		"Is migratory?: " + isMigratory + "\n" +
		"Enviroment type " + envirometType + "\n" ;	
	}
	
}