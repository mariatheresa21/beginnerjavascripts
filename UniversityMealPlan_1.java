import java.util.Scanner;

import javax.swing.JOptionPane;
public class Assignment2A {
	//The Food Services Office at UALR is looking for a simple application that will list the 3 meal plans available to students and give students the option to select a meal plan The meal plans at UALR are listed below

//1. Block 175 meals with $600 Flex Dollars $1,440 per semester 2. Block 75 meals with $600 Flex Dollars $1,240 per semester 3. Block 40 meals with $700 Flex Dollars $925 per semester 
//Using the steps below write a console program using the Scanner object that enables a student to select a meal plan
//A. Welcome Message and ask user to select a meal plan option
//a. display a welcome message for the student b. Ask user to select a meal plan option

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//display options to  user
		System.out.println("Welcome to the UALR Meal Plan Options : Select One Option");
	    System.out.println("1. Block 175 meals with $600 Flex Dollars $1,440 per semester");
	    System.out.println("2. Block 75 meals with $600 Flex Dollars $1,240 per semester");
	    System.out.println("3. Block 40 meals with $700 Flex Dollars $925 per semester");
	    System.out.println("");

	    // get the input using a scanner object
	    System.out.println("Enter your selection (1, 2, or 3) >>>>: ");
	   Scanner input = new Scanner(System.in);
	  String mealplan = input.nextLine();
	  System.out.println("Enter your Last Name >>>>: ");
	  String lname = input.nextLine();
	  System.out.println("Enter your T Number >>>>: ");
	  String tid = input.nextLine();

	  // display info on the console
	  System.out.println( "Your meal plan is Option " + mealplan);
	  System.out.println( "Last Name: " + lname);
	  System.out.println( "T Number: " + tid);


	}

}
