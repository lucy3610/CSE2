//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
// 2-15-2016
//Converter Java Program
//
//  first compile the program
//      javac Convert.java
//  run the program
//      java Convert//

//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class Convert{
    // main method required for every Java program
public static void main(String[] args) {
Scanner myScanner = new Scanner( System.in ); // creates a place for the user to add input
System.out.print("Enter the distance in meters: "); // prints out the statement after the user has inputted the distance
double meters = myScanner.nextDouble(); // this statement accepts the user's input
double inches, converter; // assign variable names
converter = 39.3701; // 39.3701 is the unit converter from meters to inches
inches = meters * converter; // calculate how many inches are in the amount of meters that was inputted
System.out.println(meters + " meters is " + inches + " inches."); // print out the converter statement
} // end of main method
    } // end of class