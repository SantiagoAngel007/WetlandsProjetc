package ui;

import java.util.Scanner;
import model.Dagma;

public class WetlandMain{
	
	private Dagma administrator;
	
	private Scanner sc;
	
	
	public WetlandMain() {
		sc= new Scanner(System.in);
	}
	
	public static void main (String[] a){
	
	WetlandMain ppal= new WetlandMain();
	
	ppal.initAdministrator();
	
	
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Seleccione una opcion para empezar\n" +
				"(1) To create a wetland\n" +
				"(2) To create a specie\n"+
				"(3) To create an event  \n"+
				"(4) To save an specie in a wetland  \n"+
				"(5) To search a specie in wetlands  \n"+
				"(6) To show the wetland with the highest amount of fauna \n and the wetland with the lowest amount of flora\n"+
				"(7) To show information of wetlands\n" +  
				"(8) To show information\n" + 
				"(0) To quit"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			registerWetland();
			break;
		case 2:
			registerSpecie();
			break;
		case 3:
			registerEvent();
			break;
		case 4:
			addSpeciesInWetlandsMain();
			break;
		case 5:
			searchSpecieByWetland();
			break;
		case 6:
			administrator.maximumFaunaWetland();
			administrator.minimumFloraWetland();
			System.out.println("");
			break;
		case 7:
			System.out.println("The information of the wetlands is:");
			System.out.println(administrator.toString());
			administrator.findWetlandObjetct();
			System.out.println("The amount of species of fauna are");
			administrator.countSpeciesFaunaInWetland();
			System.out.println("The amount of species of flora are");
			administrator.countSpeciesFloraInWetland();
			break;

		case 8:
			System.out.println("La informacion de la tienda es la siguiente:");
			System.out.println(administrator.toString());
			administrator.findWetlandObjetct();
			administrator.findSpecieObjetct();
			administrator.findEventObjetct();
			System.out.println("The amount of species of fauna are");
			administrator.countSpeciesFaunaInWetland();
			System.out.println("The amount of species of flora are");
			administrator.countSpeciesFloraInWetland();
			
			break;
		
		default:
			System.out.println("Error, opci??n no v??lida");
		
		}
	}
	
	public void registerWetland(){
		
		if(administrator.hasSpace()){
			
			//pedir entradas
			
			String nameW;
			int locaType;
			int stateType;
			double siz;
			String urPho;
			int isProtec;
			String locaName;
			
		System.out.println("Please insert the name");
		nameW= sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Please insert if the wetland is in a urban(0) or an rural(1) ubication");
		locaType= sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("Please insert the wetland is private(0) or public(1)");
		stateType= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please insert the size");
		siz= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Please insert the url photo");
		urPho= sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Please insert if the wetland is protected(0) or not(1)");
		isProtec= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please insert the name of the location");
		locaName= sc.nextLine();
		//sc.nextLine();
		
		administrator.addWetland(nameW, locaType, stateType, siz, urPho, isProtec, locaName);
		
			
		}else{
			
			System.out.println("There is not more space to put a wetland");
			
		}

	}
	
	
	public void registerSpecie(){
		
		if(administrator.hasSpaceSpecie()){
			
			//pedir entradas
			
			int speType; 
			String n;
			String scienName;
			int isMigra;
			String enviroType;
			
			
		System.out.println("Type 0 if the specie is flora or 1 if the specie is fauna");
		speType= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please insert the name of the specie");
		n= sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Please insert the scientific name of the specie");
		scienName= sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Type 0 if the specie is migratory or 1 if the specie is not migratory");
		isMigra= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please insert the enviroment type");
		enviroType= sc.nextLine();
		//sc.nextLine();
		
		
		administrator.addSpecie(speType, n, scienName, isMigra, enviroType);
		
			
		}else{
			
			System.out.println("There is not more space to put a specie");
			
		}

	}
	
	
	
	public void registerEvent(){
		
		if(administrator.hasSpaceEvent()){
			
			//pedir entradas
			
			String eveType; 
			int dat; 
			String eveOrg;
			double cot;
			String descrip;
			String wetlandName;
			
			
		System.out.println("Please insert the event type MAINTENANCE, SCHOOL VISITS , IMPROVEMENT ACTIVITIES, CELEBRATIONS");
		eveType= sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Please insert the date of the event");
		dat= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please insert the  name of the owner");
		eveOrg= sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Please insert the cost of the event");
		cot= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Please insert the description of the event");
		descrip= sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Please insert the name of the wetland where you are going to put the event");
		wetlandName= sc.nextLine();
		
		
		administrator.addEvent(eveType, dat, eveOrg, cot, descrip, wetlandName);
		
			
		}else{
			
			System.out.println("There is not more space to put an event");
			
		}

	}
	
	
	
	public void addSpeciesInWetlandsMain(){
		
		String wetName; 
		String speName; 
		
		System.out.println("Insert the name of the wetland");
		wetName= sc.nextLine();
		
		System.out.println("Insert the name of the specie");
		speName= sc.nextLine();
		
		administrator.addSpecieToWetland(wetName, speName);
		
	}
	
	
	public void getWhatIWant2(){
		
		String nameOfSpecie;
		System.out.println("Insert the name of the specie");
		nameOfSpecie= sc.nextLine();
		
		administrator.getWhatIwant(nameOfSpecie);
		
	
	}
	
	public void searchSpecieByWetland(){
		
		String speName;
		System.out.println("Insert the name of the specie");
		speName= sc.nextLine();
		
		administrator.searchSpecie(speName);
	}
	
	
	
	
	public void initAdministrator() {
		System.out.println("Ingrese el nombre dagma");
		String nit= sc.nextLine();
		administrator = new Dagma(nit);
	}
}