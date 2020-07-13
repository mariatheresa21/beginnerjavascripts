/*Herbert’s Home Repair estimates each job cost as the cost of materials plus $35 per hour while on the job, plus $12 per hour for travel time to the job site.
The main() method prompts the user for the name of a job (for example, Smith bathroom remodel), the cost of materials, the number of hours of work required, and the number of hours travel time.
The main method is complete and it calls the computePrice(), write the code for the computePrice() method so that when the method is called from the main method, it executes as intended
Pass the numeric data to a method computePrice() that computes an estimate for the job and returns the computed value to the main() method which displays the job name and estimated price. */




import java.util.Scanner;
class JobPricing {
    public static void main(String[] args)

    	  {
    		  // declare variables
    	     String description;
    	     double materials;
    	     double hoursOnJob;
    	     double hoursTraveling;
    	     double price;

    	     // declare scanner object
    	     Scanner input = new Scanner(System.in);

    	     //get input from teh user
    	     System.out.print("Enter job descriptpon >> ");
    	     description = input.nextLine();
    	     System.out.print("Enter cost of materials >> ");
    	     materials = input.nextDouble();
    	     System.out.print("Enter hours on the job work >> ");
    	     hoursOnJob = input.nextDouble();
    	     System.out.print("Enter hours traveling >> ");
    	     hoursTraveling = input.nextDouble();
    	  //call the computeprice() method and pass the input collected from the user
    	     price = computePrice(materials, hoursOnJob, hoursTraveling);
    	     System.out.println("The price for " + description +  " is $" + price);
    	  } // end of main method

// ComputePrice Method
    	  public static double computePrice(double materials, double hours, double travel)
    	  {
    	     double price;
    	     final double RATE = 35;
    	     final double TRAVEL_RATE = 12;
    	     price = materials + hours * RATE + travel * TRAVEL_RATE;
    	     return price;
    	  } // end of method
    } // end of class
