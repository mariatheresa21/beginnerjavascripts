/*
Write GUI program using the JOptionPane for Horizon Phones, a provider of cellular phone service. Prompt a user for maximum monthly values for talk minutes used, text messages sent, and gigabytes of data used, and then recommend the best plan for the customers needs.

The plans available at Horizon are listed below 
	Plan A ($49.00) : Less than 500 minutes of talk only (no text, no data)
	Plan B ($55.00) :  Less than 500 minutes of talk and Unlimited text messages (no data)
	Plan C ($61.00) : Unlimited Talk and up to 100 text messages (no data)
	Plan D ($70.00) : Unlimited Talk and Text messages (no data)
	Plan E ($79.00): Unlimited Talk and Text messages and up to 3 gigabytes of data
	Plan F ($87.00) : Unlimited Talk , Text Messages, Data .
Display information about the talk minutes, number of text messages sent, and gigabytes of data used, that the user entered, and then inform the user that based on that information you have selected a plan for the user and the cost of the plan you selected

*/


import javax.swing.*;
public class CellPhoneService
{
   public static void main (String args[])
   {
	   // declare variables  including constants
      int talk;
      int texts;
      int data;
      final int TALK_MIN = 500;
      final int TEXTS_MIN = 100;
      final int DATA_MIN = 2;
      final int PRICEA = 49;
      final int PRICEB = 55;
      final int PRICEC = 61;
      final int PRICED = 70;
      final int PRICEE = 79;
      final int PRICEF = 87;
      String entry, message;
      int price;
      String plan;

      //get input from  the user using  the input dialog
      //and convert the text to integer using the parse integer method
      entry = JOptionPane.showInputDialog(null,
         "Enter talk minutes needed");
      //convert text to integer
      talk = Integer.parseInt(entry);
      entry = JOptionPane.showInputDialog(null,
         "Enter text messages needed");
      texts = Integer.parseInt(entry);
      entry = JOptionPane.showInputDialog(null,
         "Enter gigabytes of data needed");
      data = Integer.parseInt(entry);
     // Using nested if else statement to decide on the best plan for the user

      if(data > 0)
         if(data <= DATA_MIN)
         {
            plan = "E";
            price = PRICEE;
         }
         else
         {
            plan = "F";
            price = PRICEF;
         }
      else
         if(talk < TALK_MIN)
            if(texts == 0 && data == 0)
            {
               plan = "A";
               price = PRICEA;
            }
            else
            {
               plan = "B";
               price = PRICEB;
            }
        else
            if(texts < TEXTS_MIN)
            {
                plan = "C";
                price = PRICEC;
            }
            else
            {
                plan = "D";
                price = PRICED ;
            }
      // create  message to display
      message = "Plan " + plan + "  $" + price + " per month";
      JOptionPane.showMessageDialog(null, message);
   }
}
