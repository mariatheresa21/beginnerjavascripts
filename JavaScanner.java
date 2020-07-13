import java.util.Scanner;

public class Assignment1Q2 {


	public static void main(String[] args)
	{

		// Declare variables
		String major, department, name;

		//Create a scanner object and prompt user for information
		Scanner input = new Scanner(System.in);
        System.out.print("Enter Your name >> ");
        name = input.nextLine();
        System.out.print("Enter your major >> ");
        major = input.nextLine();
        System.out.print("Enter your department >> ");
        department = input.nextLine();
        input.close();


		// Print user information to the console
	    System.out.println("Your name is  " + name + "\n Your Department is  " + department
			+ "\n Your Major is " + major);

	}

}
