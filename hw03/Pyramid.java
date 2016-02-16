//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
// 2-15-2016
//Pyramid Java Program
//
//  first compile the program
//      javac Pyramid.java
//  run the program
//      java Pyramid//

//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class Pyramid{
    // main method required for every Java program
public static void main(String[] args) {
Scanner myScanner = new Scanner( System.in ); // creates a place for the user to add input
System.out.print("The square side of the pyramid is (input length): "); // prints out the statement after the user has inputted the length
double length = myScanner.nextDouble(); // this statement accepts the user's input
System.out.print("The height of the pyramid is (input height): "); // prints out the statement after the user has inputted the height
double height = myScanner.nextDouble(); // this statement accepts the user's input
double pyramidVolume; // assign variable name
pyramidVolume = (length * length * height)/ 3; // calculate the volume of the pyramid
System.out.println("The volume inside the pyramid is: " + pyramidVolume); // print out the statement that determines the volume of the pyramid
} // end of main method
    } // end of class