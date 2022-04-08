package model;


/** Clase Wetland
*@author Santiago Angel
*Is used to created, set or get a a wetland and its characteristics
*
* */

public class Wetland{
	
	private static final int MAX_SPECIES =  100;
	
	private static final int MAX_EVENTS =  50;
	
	/**
	* An atribute called name with type String is created to refer us to the name of any wetland.
	*/
	private String name;
	
	/**
	* An atribute called locationType with type boolean is created to refer us if the location is urban or rural in any wetland.
	*/
	//private boolean locationType;
	private String locationType;
	
	/**
	* An atribute called stateType with type boolean is created to distinguish if the wetland is in a public or private place.
	*/
	//private boolean stateType;
	private String stateType;
	
	/**
	* An atribute called size with type double is created to know the size of the wetland.
	*/
	private double size;
	
	/**
	* An atribute called urlPhoto with type String is created to know the url of the wetland photo.
	*/
	private String urlPhoto;
	
	/**
	* An atribute called isProtected with type boolean is created to distinguish if the wetland is protected or not.
	*/
	//private boolean isProtected;
	private String isProtected;
	
	
	/**
	* An atribute called locationName with type String is created to write the name of the neighborhood or township.
	*/
	private String locationName;
	
	//Asociations
	
	/**
	* An asociation is created to get an object of the array of species.
	*/
	
	
	private int counterFlora;
	
	private int counterFauna;
	
	
	private Species[] species;
	
	
	private Event[] events;
	
	
	
	//Costructora
	//, Species spe, Event eve
	
	/**
	* Descriptión: create new objects of type Wetland.<br>
	* <b> pre:</b> All the attributes must be inizializted. <br>
	* <b> pos:</b> Save all the objects in the array Wetland[].
	*/
	public Wetland(String n, String locatype, String staType, double siz, String urPho, String isProtec, String locaName){
		
		this.name = n;
		
		this.locationType = locatype;
		
		this.stateType = staType;
		
		this.size = siz;
		
		this.urlPhoto = urPho;
		
		this.isProtected = isProtec;
		
		this.locationName = locaName;
		
		counterFlora = 0;
		
		counterFauna = 1;
		
		species = new Species[MAX_SPECIES];
		
		//species[0] =  spe;
		
		//events = new Event[MAX_EVENTS];
		
		//events[0] =  eve;
		
	}
	
	
	public int firstNullSpecies(){
		
		
		boolean emptyposition = false;
		int index = -1;
		for (int i=0; i<MAX_SPECIES && !emptyposition; i++){
			
			if (species[i] == null){
				emptyposition = true;
				index = i;
				
			}
		}
		return index;
	}
	
	
	public int firstNullEvents(){
		
		int index = -1;
		for (int i=0; i<MAX_EVENTS && index==-1; i++){
			
			if (events[i] == null){
				index = i;
				
			}
		}
		return index;
	}
	
	
	
	public void addSpecieW (Species spe){
		int pos = firstNullSpecies();
		species[pos] = spe;
	}
	
	
	
	
	public void addEventW (Event eve){
		int pos = firstNullEvents();
		events[pos] = eve;
	}
	
	
	/*
	public void addAuthorGenre(String id, Genre gen){
		
		boolean is found = false;
		for(int i=0; i > MAX_AUTHOR && !isFound; i++){
			
			if(authors[i] != null && authors[i].getId().equals(idAuthor)){
				siFound = true;
				authors[i].addGenre(gen);
			}
		}
	}
	*/
	
	
	//Gets modificados a int
	
	public String getName(){
		return name;
	}
	
	public String getLocationType(){
		return locationType;
	}
	
	public String getStateType(){
		return stateType;
	}
	
	public double getSize(){
		return size;
	}
	
	public String getUrlPhoto(){
		return urlPhoto;
	}
	
	public String getIsProtected(){
		return isProtected;
	}
	
	public String getLocationName(){
		return locationName;
	}
	
	
	//Gets modificados a int
	
	public void setName(String n){
		name =  n;
	}
	
	public void setLocationType(String locatype){
		locationType = locatype;
	}
	
	public void setStateType(String staType){
		stateType = staType;
	}
	
	public void setSize(double siz){
		size = siz;
	}
	
	public void setUrlPhoto(String urPho){
		urlPhoto =urPho;
	}
	
	public void setIsProtected(String isProtec){
		isProtected = isProtec;
	}
	
	public void setLocationName(String locaName){
		locationName = locaName;
	}
	
	
	
	public String toString() {

		return "**** Wetlands information ****\n" + 
		"name of wetland: " + name + "\n" +
		"The location type: " + locationType + "\n" +
		"The state type: " + stateType + "\n" +
		"Size of wetland: " + size + "\n" +
		"UrlPhoto: " + urlPhoto + "\n" +
		"Is protected: " + isProtected + "\n" +
		"Location name " + locationName + "\n" +	
		"Location name " + locationName + "\n" ;
	}
	
}