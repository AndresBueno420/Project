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

	public static void main(String[] args) throws Exception{

		Main exe = new Main();

		int option = 0;

		do{
			exe.menu();
			option = exe.validateIntegerInput();
			exe.executeOption(option);


		}while(option != 4);
		
		System.out.println("Thanks for ussing the programm.");


	}

	// Incomplete
	public void menu() {
		System.out.println("1. Create a new project: ");
		System.out.println("2. Search a project before a date.");
		System.out.println("3. Search project after date.");
		System.out.println("4. Exit ");

	}
	public void executeOption(int option)throws Exception{
        switch (option) {
            case 1:
				RegisterProject();
                break;

            case 2:
                searchProjectsBeforeDate();
                break;

            case 3: 
				searchProjectsAfterDate();
                break;

            case 4:
                System.out.println("Exit."); 
                break; 

            case -1: 
                System.out.println("Invalid Option!!"); 
                break; 
        }
    }

	//Incomplete
	public void RegisterProject() throws Exception{
		String projectName;
		String clientName;
		String beginDates;
		String endDates;
		double budget;

		System.out.println("Type the name of the project:");
		projectName = reader.next();
		System.out.println("Type the name of the client:");
		clientName = reader.next();
		System.out.println("Type the date of start: (Day/Month/year)");
		beginDates = reader.next();
		System.out.println("Type the date of ending : (Day/Month/Year) ");
		endDates = reader.next();
		System.out.println("Type the budget of the project: ");
		budget = reader.nextDouble();

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Calendar initialDate = Calendar.getInstance();
		initialDate.setTime(format.parse(beginDates));
		Calendar endDate = Calendar.getInstance();
		endDate.setTime(format.parse(endDates));

		boolean  verifier = controller.RegisterProject(projectName, clientName, initialDate, initialDate, budget);
		if(verifier == true){
			System.out.println("The project has been registered.");
		}
		else{
			System.out.println("The project has not been registered.");
		}
	}

	//Incomplete
	public void searchProjectsAfterDate() throws Exception{
		 String dateCompare;

		 System.out.println("Type the date to compare.");
		 dateCompare = reader.next();

		 SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		 Calendar dateToCompare = Calendar.getInstance();
		 dateToCompare.setTime(format.parse(dateCompare));

		 System.out.println("The projects after the date are/is:  " + controller.searchProjectsAfterDate(dateToCompare));

	}
	
	//Incomplete
	public void searchProjectsBeforeDate() throws Exception{
		String dateCompares;
		
		System.out.println("Type the date to compare.");
		dateCompares= reader.next();

		 SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		 Calendar dateToCompare = Calendar.getInstance();
		 dateToCompare.setTime(format.parse(dateCompares));

		 System.out.println("The projects after the date are/is " + controller.searchProjectsAfterDate(dateToCompare));

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
}
