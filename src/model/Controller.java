package model;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Controller {
	private final static int SIZE = 10;
	private Project[] projects;
	private String[] projectsAfter;
	private String[] projectsBefore;

	public Controller() {
		projects = new Project[SIZE];
		projectsAfter = new String[SIZE];
		projectsBefore = new String[SIZE];
	
	}
	
	//Incomplete
	public boolean RegisterProject(String name, String clientName, Calendar initialDate, Calendar finalDate, double budget) {
		
			Project project = new Project(name,clientName, initialDate, initialDate, budget);
			int pos = getFirstValidPosition();
			if(pos != -1){
				projects[pos]= project;
				
				return true;
			}
			else{
				System.out.println("The project has not been registered. ");
				return false;
			}
	}

	//Incomplete
	// Date class also has their own before() and after() method
	public String searchProjectsAfterDate(Calendar date) {
		String msg = " ";
		for(int i = 0; i < SIZE; i++){
			if(projects[i] != null){
				if(projects[i].getInitialDate().after(date)){
					int pos = validPositionAfter();
					if(pos != -1){
						projectsAfter[pos]=projects[i].getName();
					}
				}
			}
		}
		for(int c = 0; c < 10; c++){

            if(projectsAfter[c] != null){
                msg += projectsAfter[c];
                if(c < 10 ){
                    msg += ", ";
                }
            }
        }
		
		return msg;

	}
	
	//Incomplete
	// Date class also has their own before() and after() method
	public String searchProjectsBeforeDate(Calendar dates) {

		String msg = "";
		for(int i = 0; i < SIZE; i++){
			if(projects[i] != null){
				if(projects[i].getInitialDate().before(dates)){
					int pos = validPositionBefore();
					if(pos != -1){
						projectsAfter[pos]=projects[i].getName();
					}
				}
			}
		}
		for(int c = 0; c < 10; c++){

            if(projectsBefore[c] != null){
                msg += projectsBefore[c];
                if(c < 10 - 1){
                    msg += ", ";
                }
            }
        }
		
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
	public int validPositionAfter(){
		int pos = -1; 
		boolean isFound = false; 
		for(int i = 0; i < 10 && !isFound; i++){
			if(projectsAfter[i] == null){
				pos = i; 
				isFound = true;
			}
		}
		return pos; 
	}
	public int validPositionBefore(){
		int pos = -1; 
		boolean isFound = false; 
		for(int i = 0; i < 10 && !isFound; i++){
			if(projectsBefore[i] == null){
				pos = i; 
				isFound = true;
			}
		}
		return pos; 
	}
	


}
