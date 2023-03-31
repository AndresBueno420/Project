package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Controller {

	private Project[] projects;

	public Controller() {

		projects = new Project[10];
	
	}
	
	//Incomplete
	public boolean RegisterProject(String name, String clientName, Calendar initialDate, Calendar finalDate, double budget) {
		if()
			Project project = new Project(String name, String clientName, Calendar initialDate, Calendar finalDate, double budget);
			int pos = getFirstValidPosition;
			if(pos != -1){
				projects[pos]= project;
				System.out.println("The project has been registered. ");
				return true;
			}
			else{
				System.out.println("The project has not been registered. ");
				return false;
			}
	}

	//Incomplete
	// Date class also has their own before() and after() method
	public String searchProjectsAfterDate() {

		String msg = "";

		return msg;

	}
	
	//Incomplete
	// Date class also has their own before() and after() method
	public String searchProjectsBeforeDate() {

		String msg = "";

		return msg;

	}
	public int getFirstValidPosition(){
		int pos = -1; 
		boolean isFound = false; 
		for(int i = 0; i < 10 && !isFound; i++){
			if(projects[i] == null){
				pos = i; 
				isFound = true;
			}
		}
		return pos; 
	}
}
