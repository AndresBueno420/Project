package ui;

import java.util.Scanner;
import model.Controller;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main{

	private Scanner reader;
	private Controller controller;

	public Main() {

		reader = new Scanner(System.in);
		controller = new Controller();
	}

	public static void main(String[] args) {

		Main exe = new Main();

		int option = 0;

		do{
			exe.menu();
			option = exe.validateIntegerInput();
			exe.executeOption(option);


		}while(option != 4);
		System.out.println("Thanks for ussing the programm.")


	}

	// Incomplete
	public void menu() {
		System.out.println("1. Create a new project: ");
		System.out.println("2. Search a project before a date.")
		System.out.println("3. Search project after date.");
		System.out.println("4. Exit ")

	}

	//Incomplete
	public void RegisterProject() {
		String projectName;
		String clientName;
		String beginDate;
		String endDate;
		double budget;

		System.out.println("Type the name of the project:");
		projectName = reader.next();
		System.out.println("Type the name of the client:");
		clientName = reader.next();
		System.out.println("Type the date of start:");
		beginDate = reader.next();
		System.out.println("Type the date of ending : ");
		endDate = reader.next();
		System.out.println("Type the budget of the project: ");
		budget = reader.nextBoolean();

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		Calendar initialDate = Calendar.getInstance();
		initialDate.setTime(format.parse(initialDate));
		Calendar initialDate = Calendar.getInstance();
		endDate.setTime(format.parse(endDate);)







	}

	//Incomplete
	public void searchProjectsAfterDate() {

	}
	
	//Incomplete
	public void searchProjectsBeforeDate() {

	}
	public int validateIntegerInput(){
        int option = 0; 
        if(reader.hasNextInt()){
            option = reader.nextInt(); 
        }
        else{
            reader.nextLine();// limpiar el scanner 
            option = -1; 
            System.out.println("Type an option: "); 
        }
        return option; 
    }

	public void executeOption(int option){
        switch (option) {
            case 1:
               
                break;

            case 2:
                
                break;

            case 3: 
                
                break;

            case 4:
                System.out.println("Exit."); 
                break; 

            case -1: 
                System.out.println("Invalid Option!!"); 
                break; 
        }
    }
	
}
