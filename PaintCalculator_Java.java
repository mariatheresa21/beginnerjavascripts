/*John’s Home Improvement business estimates that a gallon of paint covers about 350 square feet of wall space.
The company wants an application that can compute the quantity of paint required for a room and the cost of paint. The first programmer hired to write the application, only completed the method subs below.
Complete the code block in the in the main() method to perform the following

• Pompt the user for the length, width, and height of a rectangular room.
• Pass these three values to a computeArea()method that does the following:
• Calculates the wall area for a room
• Passes the calculated wall area to another method computeGallons()that calculates and returns the number of gallons of paint needed
• Displays the number of gallons needed
• Computes the cost based on a paint price of $32 per gallon, assuming that the painter can buy any fraction of a gallon of paint at the same price as a whole gallon
• Returns the cost to the main() method

The main() method displays the final cost */



import java.util.Scanner;
public class PaintCalculator {
    public static void main (String args[]) {
        // Write your code here
    	double width, length, height, cost;

    	Scanner input = new Scanner(System.in);
        System.out.print("Enter room width >> ");
        width = input.nextDouble();
        System.out.print("Enter room height >> ");
        height = input.nextDouble();
        System.out.print("Enter room lenght >> ");
        length = input.nextDouble();

        cost = computeArea(length, width, height);
        System.out.println("The estimated cost of the paint job is $" + cost);

    }

    public static double computeArea(double length, double width, double height) {
        // Write your code here
    	double area =0;
    	area = length * width * height;
    	double gallons;
    	gallons = computeGallons(area);
    	System.out.println("You need " + gallons + " gallons of paints");
    	return (gallons * 32);
    }
    public static double computeGallons(double area) {
        // Write your code here
    	double gal =0; // declare return value
    	gal = area/350; //compute gallons
    	gal = Math.round(gal*100); // multiply by 100 and round up to display only 2 decimal point
    	gal = gal/100; // Divide by 100 to get actual number


    	return gal;
    }
}
