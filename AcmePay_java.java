/*

 Acme Parts runs a small factory and employs workers who are paid one of three hourly rates depending on their shift:

1	First shift, $17 per hour; 
2	Second shift, $18.50 per hour;
3	Third shift, $22 per hour.


Each factory worker might work any number of hours per week; any hours greater than 40 are paid at one and one-half times the usual rate.
In addition, second- and third-shift workers can elect to participate in the retirement plan for which 3% of the worker�s gross pay is deducted from the paychecks.

Write a program that prompts the user for hours worked, shift, and, if the shift is 2 or 3, whether the worker elects the retirement (1 for yes, 2 for no). Display:
1.	Hours worked
2.	Shift
3.	Hourly pay rate
4.	Regular pay
5.	Overtime pay
6.	Total of regular and overtime pay
7.	Retirement deduction, if any
8.	Net pay.

 */
import javax.swing.*;
public class AcmePay
{
   public static void main(String[] args) throws Exception
   {
      // Declare the variables
	   String entry, message;
      int shift;
      double hoursWorked;
      double regularPay, overtimePay, totalPay;
      double payRate;
      double retDeduction = 0;
      int retOption = 0;
      final double PAY1 = 17.00;
      final double PAY2 = 18.50;
      final double PAY3 = 22.00;
      final int FULLWEEK = 40;
      final double OT_RATE = 1.5;
      final double RET_RATE = 0.03;

      //Get input from the user and convert to integer and double
      entry = JOptionPane.showInputDialog(null,
         "Please enter shift - 1, 2, or 3");
      shift = Integer.parseInt(entry);
      entry = JOptionPane.showInputDialog(null,
         "Please enter hours worked");
      hoursWorked = Double.parseDouble(entry);
     //Use nested if else statement to determine net pay
      if(shift == 1)
         payRate = PAY1;
      else
         if(shift == 2)
            payRate = PAY2;
         else
            payRate = PAY3;
      if(hoursWorked > FULLWEEK)
      {
	  regularPay = FULLWEEK * payRate;
	  overtimePay = (hoursWorked - FULLWEEK) * OT_RATE * payRate;
      }
      else
      {
         regularPay = hoursWorked * payRate;
         overtimePay = 0.0;
      }
      totalPay = regularPay + overtimePay;

      // check the shift

      if(shift == 2 || shift == 3)
      {
         entry = JOptionPane.showInputDialog(null,
            "Do you want to participate in the retirement plan?\n" +
            "   Enter 1 for Yes and 2 for No.");
         retOption = Integer.parseInt(entry);
         if(retOption == 1)
             retDeduction = totalPay * RET_RATE;
      }
       // create a message to display to  the user
       message =
         "\nHours worked is    " + hoursWorked +
         "\nHourly pay rate is " + payRate +
	   "\nRegular pay is     " + regularPay +
	   "\nOvertime pay is    " + overtimePay +
         "\nRetirement deduction is " + retDeduction +
         "\nNet pay is...................." +
            (totalPay - retDeduction);
       // display the message in a dialog box
       JOptionPane.showMessageDialog(null, message);
   }
}
