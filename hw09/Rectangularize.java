//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Rectangularize Java Program
//
//  first compile the program
//      javac Rectangularize.java
//  run the program
//      java Rectangularize//
//
//create an import statement so the scanner class will work
import java.util.Scanner;
// define a class
public class Rectangularize {
    //  add main method    
    public static void main(String[] args) {
        System.out.println("Please enter an input: ");
        Scanner myScanner = new Scanner(System.in); // create a scanner
        int input = 1; // initialize the variables
        String input2 = " ";
        if (myScanner.hasNextInt()) { // if the user inputs a integer, run the integer rectangle method
            input = myScanner.nextInt(); // accept the input
            rectangle(input); // call the method
        }
        else { // if the user inputs a string, run the string rectangle method
            input2 = myScanner.next(); // accept the input
            rectangle(input2); // call the method
        }
    }
    public static void rectangle(int percent) { // create a method for integers
        for (int a = 0; a < percent; a++) { // loop how many rows
            for (int b = 0; b < percent; b++) { // loop what occurs in the row
                System.out.print("%");

            }
            System.out.println(""); // make a new line

        }
    }
    public static void rectangle(String character) { // create a method for strings
        int length = character.length(); // determine how many characters the string is
        for (int a = 0; a < length; a++) { // loop how many rows are printed
            System.out.println(character);

        }
        
    }

}