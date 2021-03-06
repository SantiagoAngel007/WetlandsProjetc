package model;


/** Clase Dagma 
*@author Santiago Angel
*Is used to contain the arrays of wetlands, species and event.
* */

public class Dagma{
	
	private static final int MAX_WETLANDS =  80;
	
	private static final int MAX_SPECIES =  100;
	
	private static final int MAX_EVENTS =  50;
	
	private String nit;
	
	/**
	* It is an attribute which contains wetlands.
	*/
	private Wetland [] wetlandArray;
	
	/**
	* It is an attribute which contains species.
	*/
	private Species [] speciesArray;
	
	/**
	* It is an attribute which contains events.
	*/
	private Event [] eventArray;
	
	
	//Controladora
	public Dagma(String nit) {
		
		this.nit = nit;
		
		wetlandArray = new Wetland [MAX_WETLANDS];
		
		speciesArray = new Species [MAX_SPECIES];
		
		eventArray = new Event [MAX_EVENTS];
		
	}
	
	
//|-------------------------------------------------------------------------------------------------------------------------|


	/**
	*@return a boolean true if there is space in a posiiton the array of wetlands.
	* find the position in the array that has space.
	* */
	public boolean hasSpace(){

		boolean emptyPosition= false;
		for (int i=0; i<MAX_WETLANDS && !emptyPosition; i++){

			if(wetlandArray[i] ==null){
				emptyPosition= true;
			}

		}
		return emptyPosition;
	}
	
	/**
	*@return a boolean true if there is space in a posiiton the array of events.
	* find the position in the array that has space.
	* */
	public boolean hasSpaceSpecie(){

		boolean emptyPosition= false;
		for (int i=0; i<MAX_SPECIES && !emptyPosition; i++){

			if(speciesArray[i] ==null){
				emptyPosition= true;
			}

		}
		return emptyPosition;
	}
	
	/**
	*@return a boolean true if there is space in a posiiton the array of species.
	* find the position in the array that has space.
	* */
	public boolean hasSpaceEvent(){

		boolean emptyPosition= false;
		for (int i=0; i<MAX_EVENTS && !emptyPosition; i++){

			if(eventArray[i] ==null){
				emptyPosition= true;
			}

		}
		return emptyPosition;
	}
	
	
//|-------------------------------------------------------------------------------------------------------------------------|	
	
	/**
	*@return the first position of the array wetlands that have space.
	* find the position in the array that has space.
	* */
	public int firstNullSpace(){
		
		boolean emptyposition1 = false;
		int position = -1;
		for (int i=0; i<MAX_WETLANDS && !emptyposition1; i++){
			
			if (wetlandArray[i] == null){
				emptyposition1 = true;
				position = i;
				
			}
		}
		return position;
	}
	
	
	/**
	*@return the first position of the array species that have space.
	* find the position in the array that has space.
	* */
	public int firstNullSpaceSpecie(){
		
		boolean emptyposition1 = false;
		int position = -1;
		for (int i=0; i<MAX_SPECIES && !emptyposition1; i++){
			
			if (speciesArray[i] == null){
				emptyposition1 = true;
				position = i;
				
			}
		}
		return position;
	}
	
	
	/**
	*@return the first position of the array event that have space.
	* find the position in the array that has space.
	* */
	public int firstNullSpaceEvent(){
		
		boolean emptyposition1 = false;
		int position = -1;
		for (int i=0; i<MAX_EVENTS && !emptyposition1; i++){
			
			if (eventArray[i] == null){
				emptyposition1 = true;
				position = i;
				
			}
		}
		return position;
	}
	
	
	
//|-------------------------------------------------------------------------------------------------------------------------|

	
	/**
	*Description: find and print all the objects of the wetland array.
	* */
	public void findWetlandObjetct(){
		
		for (int i = 0; i<MAX_WETLANDS; i++){
			
			if (wetlandArray[i]!=null){
				System.out.println(wetlandArray[i]);
			}
			
			
		}
		
	}
	
	
	/**
	*Description: find and print all the objects of the species array.
	* */
	public void findSpecieObjetct(){
		
		for (int i = 0; i<MAX_SPECIES; i++){
			
			if (speciesArray[i]!=null){
				System.out.println(speciesArray[i]);
			}
			
			
		}
		
	}
	
	
	/**
	*Description: find and print all the objects of the wetland array.
	* */
	public void findEventObjetct(){
		
		for (int i = 0; i<MAX_EVENTS; i++){
			
			if (eventArray[i]!=null){
				System.out.println(eventArray[i]);
			}
			
			
		}
		
	}
//|-------------------------------------------------------------------------------------------------------------------------|	
	
	
	/**
	*@return the object wetland of the array that is the same as the parameter.
	* */
	public Wetland findWetland(String name){
		
		Wetland wetlandFound = null;
		
		for (int i = 0; i<MAX_WETLANDS && wetlandFound == null; i++){
			
			if (wetlandArray[i]!= null){
				if(name.equals(wetlandArray[i].getName())){
					wetlandFound = wetlandArray[i];
				}
			}
		}
		
		return wetlandFound;
		
	}
	
	
	/**
	*@return the object species of the array that is the same as the parameter.
	* */
	public Species findSpecie(String name){
		
		Species speciesFound = null;
		
		for (int i = 0; i<MAX_SPECIES && speciesFound == null; i++){
			
			if (speciesArray[i]!= null){
				if(name.equals(speciesArray[i].getName())){
					speciesFound = speciesArray[i];
				}
			}
		}
		
		return speciesFound;
		
	}
	
	
	/**
	*@return the object event of the array that is the same as the parameter.
	
	* */
	public Event findEvent(String ownerName){
		
		Event eventFound = null;
		
		for (int i = 0; i<MAX_EVENTS && eventFound == null; i++){
			
			if (eventArray[i]!= null){
				if(ownerName.equals(eventArray[i].getEventOrganizer())){
					eventFound = eventArray[i];
				}
			}
		}
		
		return eventFound;
		
	}
	
	
//|-------------------------------------------------------------------------------------------------------------------------|	
	
	public int findSpecieInt(String name){
		
		int eventFound = -1;
		
		for (int i = 0; i<MAX_SPECIES && eventFound == -1; i++){
			
			if (speciesArray[i]!= null){
				if(name.equals(speciesArray[i].getName())){
					eventFound = i;
				}
			}
		}
		
		return eventFound;
		
	}
	
	
//|-------------------------------------------------------------------------------------------------------------------------|	
	
	/**
	*Description: Used to create an object of type wetland.
	* */
	public void addWetland (String n, int locaType, int staType, double siz, String urPhoto, int isProtec, String locaName){
		
		String out = "";
		
		int emptypos = firstNullSpace(); //Busco la primera posicion vacia
		
		if (emptypos == -1){
			
			// no se puede agregar
			out = "The array is full";
			
		}else{
			
			String loca = "";
			if(locaType==0){
				loca = "Urbano";
			}
			else if(locaType==1){
				loca = "Rural";
			}
			
			String sta = "";
			if(staType==0){
				sta = "Private";
			}
			else if(staType==1){
				sta = "Public";
			}
			
			String pro = "";
			if(isProtec==0){
				pro = "PROTECTED";
			}
			else if(isProtec==1){
				pro = "NO PROTECTED";
			}
			
			wetlandArray[emptypos] = new Wetland(n, loca, sta, siz, urPhoto, pro, locaName);
			out = "Se agrego un wetland con nombre " + n;
			
		}
		
		
	}


	/**
	*Description: Used to create an object of type specie.
	* */
	public void addSpecie (int speType, String n, String scienName, int isMigra, String enviroType){
		
		String out = "";
		
		int emptypos = firstNullSpaceSpecie(); //Busco la primera posicion vacia
		
		if (emptypos == -1){
			
			// no se puede agregar
			out = "The array is full";
			
		}else{
			
			String spe = "";
			if(speType==0){
				spe = "Flora";
			}
			else if(speType==1){
				spe = "Fauna";
			}
			
			String migra = "";
			if(isMigra==0){
				migra = "Is Migratory";
			}
			else if(isMigra==1){
				migra = "Not Migratory";
			}
			
			
			speciesArray[emptypos] = new Species(spe, n, scienName, migra, enviroType);
			out = "Se agrego un wetland con nombre " + n;
			
		}
		
		
	}
	
	
		/**
	*Description: Used to create an object of type event and is also used to add this event to a wetland..
	* */
	public void addEvent (String eveType, int dat, String eveOrg, double cot, String descrip, String wetlandName){
		
		String out = "";
		
		int emptypos = firstNullSpaceEvent(); //Busco la primera posicion vacia
		
		if (emptypos == -1){
			
			// no se puede agregar
			out = "The array is full";
			
		}else{
			
			
			eventArray[emptypos] = new Event(eveType, dat, eveOrg, cot, descrip);
			out = "Se agrego un Evento con nombre " + eveType;
			
			findWetland(wetlandName).addEventW(eventArray[emptypos]);
	
		}
		
		
	}


//|-------------------------------------------------------------------------------------------------------------------------|


	public void addSpecieToWetland(String wetlandName, String specieName){
		
		
		findWetland(wetlandName).addSpecieW(findSpecie(specieName));
	
		
	}
	

	
//|-------------------------------------------------------------------------------------------------------------------------|	
	public void searchSpecie(String specieName){
		
		
		String msg = "";
		for (int i = 0; i<MAX_WETLANDS; i++){
			
			if (wetlandArray[i]!=null){
				for (int j = 0; j<MAX_SPECIES; j++){
					if(specieName.equals(speciesArray[j].getName())){
						msg += wetlandArray[i].toString() + "\n";
						System.out.println(msg);
					}
				}
				
			}
			
			
		}
	
		
	}



//|-------------------------------------------------------------------------------------------------------------------------|


	public void countSpeciesFaunaInWetland(){
		
		int counterFA=0;
		
		for (int i = 0; i<MAX_WETLANDS; i++){
			
			if (wetlandArray[i]!= null){
				for(int j = 0; j<MAX_SPECIES; j++){
					if (speciesArray[j]!= null){
						if(speciesArray[j].getSpecieType().equals("Fauna")){
					
							counterFA++;
						}
					}
				}
			}
		}
		System.out.println(counterFA);
	}
	
	
	
	public void countSpeciesFloraInWetland(){
		
		int counterFL=0;
		
		for (int i = 0; i<MAX_WETLANDS; i++){
			if (wetlandArray[i]!= null){
				for(int j = 0; j<MAX_SPECIES; j++){
					if (speciesArray[j]!= null){
						if(speciesArray[j].getSpecieType().equals("Flora")){
					
							counterFL++;
						}
					}
				}
			}
		}
		System.out.println(counterFL);
	}
	
	
	
//|-------------------------------------------------------------------------------------------------------------------------|	

	



//|-------------------------------------------------------------------------------------------------------------------------|
	
	
	public void getWhatIwant(String specieName){
		
		System.out.println(findSpecie(specieName).getSpecieType());
		
	}
//|-------------------------------------------------------------------------------------------------------------------------|


	public void minimumFloraWetland(){
		
		int position = 0;
		int counterFlora=0;
		int counterMin=0;
		Wetland temporal = wetlandArray[0];
		
		for (int i = 0; i<MAX_WETLANDS; i++){
			if (wetlandArray[i]!= null){
				for(int j = 0; j<MAX_SPECIES; j++){
					if (speciesArray[j]!= null){
						if(speciesArray[j].getSpecieType().equals("Flora")){
					
						counterFlora++;
					
					}
					if(counterMin<counterFlora){
						counterMin = counterFlora;
						temporal = wetlandArray[i];
						}
					}
				}
			}
		}
		System.out.println("The minimun of flora is\n " +temporal);
	}

	

	public void maximumFaunaWetland(){
		int position = 0;
		int counterFauna=0;
		int counterMax=0;
		Wetland temporal = wetlandArray[0];
		
		for (int i = 0; i<MAX_WETLANDS; i++){
			if (wetlandArray[i]!= null){
				for(int j = 0; j<MAX_SPECIES; j++){
					if (speciesArray[j]!= null){
						if(speciesArray[j].getSpecieType().equals("Fauna")){
					
							counterFauna++;
					
					}
					if(counterMax>counterFauna){
						counterMax = counterFauna;
						temporal = wetlandArray[i];
						}
					}
				}
			}
		}
		System.out.println("The maximum of fauna is\n " +temporal);
	}



//|-------------------------------------------------------------------------------------------------------------------------|


	public String addSpecieToString(){
			
			String msg = "";
			for (int i = 0; i<MAX_WETLANDS; i++){
				if (wetlandArray[i]!= null){
					for(int j = 0; j<MAX_SPECIES; j++){
						if (speciesArray[i]!=null){
							msg += speciesArray[i].toString() + "\n";
						}
				
					}
				}
			}
			return msg;
	}
	
	
	


//|-------------------------------------------------------------------------------------------------------------------------|











	public Wetland[] getWetlandArray(){
		return wetlandArray;
	}

	public Species[] getSpeciesArray(){
		return speciesArray;	
	}
	
	public Event[] getEventArray(){
		return eventArray;
	}
	
	
//|-------------------------------------------------------------------------------------------------------------------------|		
	
	
	
	public String toString() {

		return "**** Event information ****\n" + 
		"Description " + nit + "\n" ;	
	}
	
	
	
	
}