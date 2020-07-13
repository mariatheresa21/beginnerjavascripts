import java.util.Scanner;

import javax.swing.JOptionPane;
public class Assignment2A {


/* The Food Services Office at UALR is looking for a simple application that will list the 3 meal plans available to students and give students the option to select a meal plan The meal plans at UALR are listed below

1. Block 175 meals with $600 Flex Dollars $1,440 per semester
2. Block 75 meals with $600 Flex Dollars $1,240 per semester
3. Block 40 meals with $700 Flex Dollars $925 per semester

Using the steps below write a console program using the Scanner object that enables a student to select a meal plan

A. Welcome Message and ask user to select a meal plan option
	a. display a welcome message for the student b. Ask user to select a meal plan option

B. Then prompt the student to enter the following information
	a. last name b. student T Number

C. Display information
	a. Display Student Last name and T Number b. Display the meal plan selected by the student

Question 2
Write the same program in Question 1 using a graphical user interface, the JOptionPane class to enable a student to select a meal plan. Below are examples of the program. In this program, import only the javax.swing.* .

Question 3
The University has implemented a new X3 Points Rewards Program to encourage students to use meal plans and spend flex dollars on Campus. As part of the X3 Points Rewards Program, students will earn 3 points on every meal they purchase and earn 3 points for every dollar they spend from their flex dollars. Students can redeem points as follows:
100 points = 1 meal or $5.00
Ron Cengage, a freshman in the BINS program is very excited about the new X3 Rewards program, but he is confused on how much points he has accumulated and how much the points are worth when he redeems them.
Create a Graphical User Interface Java application, using JOptionPane that will prompt Ron to enter the amount of dollars he has spent from his flex dollars and the number of meals he has used and then compute and display the points he has earned and display how many meals or dollars he can redeem those points for. This application will help Ron keep up with his meal plans and his rewards points
*/

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


//Question 2 Below


import javax.swing.JOptionPane;
public class Assignment2B {


	public static void main(String[] args)
	{
		//display options in GUI to the user
	  String mplan;
		mplan = JOptionPane.showInputDialog(null,
				"Welcome to the UALR Meal Plan Options : Select One Option \n"
				+ "1. Block 175 meals with $600 Flex Dollars $1,440 per semester\n"
				+ "2. Block 75 meals with $600 Flex Dollars $1,240 per semester \n"
				+ "3. Block 40 meals with $700 Flex Dollars $925 per semester \n"
				+ "\n"
				+ "Enter your selection (1, 2, or 3) >>>>: ");

	  //Get input from user using a GUI

		String ln;
		ln = JOptionPane.showInputDialog(null, "Enter Last Name");
		String tn;
		tn = JOptionPane.showInputDialog(null, "Enter T Number ");

		// Display user information as a confirmation in a GUI
		JOptionPane.showMessageDialog(null,
				"Your meal plan is Option " + mplan
				+ "\n Last Name:  " + " " + ln
				+ "\n T Number:  " + " " + tn);


	}

}




//Question 3 Below

import javax.swing.JOptionPane;
public class Assignment2C {
//Kumi
// Solutions to Assignment 2 Q3
	public static void main(String[] args)
	{
	   // Declare variables
	    final int POINTS = 3;
		String mealsUsed; // variable for meal used
		String flexUsed; // variable for flex $ used
		double bonusPoints;

		// Get input from user get meal used and flex $ used
		mealsUsed = JOptionPane.showInputDialog(null, "Enter the number of meals used >>");
		flexUsed = JOptionPane.showInputDialog(null, "Enter amount of flex dollars used >>> ");

		//compute bonus points, each meal and a dollar gives you  3 point .. add and multiple by 3
	    bonusPoints = (Double.parseDouble(mealsUsed)  + Double.parseDouble(flexUsed)) * POINTS ;

	//Display points to the user

		JOptionPane.showMessageDialog(null,
				"You have used " + mealsUsed + " meals"
				+ "\nAnd $ " +  flexUsed + " Flex dollars  "
				+ "\nYour points earned is:  " + bonusPoints
				+ "\nYou can redeem your points for :"
				+ "\n$ " + (bonusPoints/100) * 5
				+ "\n Or " + bonusPoints/100 + " meals ");


	}

}
