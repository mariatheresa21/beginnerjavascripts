/*
1. Create a class named Student that has fields for an ID number, number of credit hours
earned, and number of points earned. (For example, many schools compute grade point averages based on a scale of 4, so a three-credit-hour class in which a student earns an A is worth 12 points.)
Include methods to assign values to all fields. A Student also has a field for grade point average.
Include a method to compute the grade point average field by dividing points by credit hours earned.
Write methods to display the values in each Student field.


2. Use class named ShowStudent that instantiates a Student object to test your class.
Compute the Student grade point average, and then display all the values associated with the Student.

3. Create a constructor for the Student class you created.
The constructor should initialize each Student’s ID number to 9999, his or her points earned to 12, and credit hours to
3 (resulting in a grade point average of 4.0).
Write a program that demonstrates that the constructor works by instantiating an object and displaying the initial values. */




//Part 1

class ShowStudent
{
   public static void main (String args[])
   {
      Student pupil = new Student();
      pupil.showIdNumber();
      pupil.showPoints();
      pupil.showHours();
      System.out.println("The grade point average is " +
         pupil.getGradePoint());
   }
}



//Part 2



class Student {
    // the private data members
    private int idNumber;
    private int hours;
    private int points;

    // Constructor added in part c
    Student() {
    	idNumber = 9999;
    	hours =3;
    	points =12;
    }
    // end of constructor added in part cStudent�s ID number to 9999,
    //his or her points earned to 12, and credit hours to 3
    //(resulting in a grade point average of 4.0).

    // the public get and set methods

    public void setIdNumber(int number) {
    	idNumber = number;
    }

    public int getIdNumber() {
    	return idNumber;
    }

    public void setHours(int number) {
    	hours = number;
    }

    public int getHours() {
    	return hours;
    }

    public void setPoints(int number) {
    	points = number;
    }

    public int getPoints() {
    	return points;
    }

    // methods to display the fields

    public void showIdNumber() {
    	System.out.println("The Student Number is  " + idNumber); //display ID

    }

    public void showHours() {
    	System.out.println("The Student hours are  " + hours); // display hours
    }

    public void showPoints() {
    	System.out.println("The Student Points are  " + points); // display points
    }

    public double getGradePoint() {
    	return (points/hours); // compute GPA
    }
}
