//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Twisty Java Program
//
//  first compile the program
//      javac Twisty.java
//  run the program
//      java Twisty//
// This program is designed to create a twist like pattern with loops

//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class Twisty {

    //  add main method    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //
        boolean acceptable = false; // check for acceptable input
        int length = 0; // initialize variable

        //check length
        while (!acceptable) {
            System.out.print("Enter the length: ");
            //check if it's an integer
            if (myScanner.hasNextInt()) {
                length = myScanner.nextInt();
                if (length > 0 && length < 80) { // set conditions
                    acceptable = true; // if it is acceptable, break out of the while loop
                }
                else {
                    System.out.println("Error: not in range 0 - 80");
                    acceptable = false; // keep asking for acceptable input
                }
            }
            else {
                System.out.println("Error: please type in an integer."); // if the input is not an integer this statement will print
                myScanner.next(); // keep asking for input
            }
        }
        acceptable = false; // check for acceptable input
        int width = 0; // initialize variable
        //check the width
        while (!acceptable) {
            System.out.print("Enter the width: ");
            //check if it's an integer
            if (myScanner.hasNextInt()) {
                width = myScanner.nextInt();
                if (width > 0 && length > width) { // set conditions
                    acceptable = true; // if it is acceptable, break out of the while loop
                }
                else {
                    System.out.println("Error: Please input an integer smaller than the length.");
                    acceptable = false; // keep asking for acceptable input
                }
            }
            else {
                System.out.println("Error: please type in an integer."); // if the input is not an integer this statement will print
                myScanner.next(); // keep asking for input
            }
        }

        //print out the Twistys
        for (int a = 0; a < width; a++) { // loop the width
            for (int b = 0; b < length; b++) { // loop the columns
                if ((b / width) % 2 == 0) { // determine where the # goes in each column
                    if (b % width == a) {
                        System.out.print("#");
                    }
                    else if ((width - 1 - b % width) == a) { // determine where the / goes in each line
                        System.out.print("/");
                    }
                    else { // if neither, print a space
                        System.out.print(" "); 
                    }
                }
                else { // determine where each \ goes in each column
                    if (b % width == a) {
                        System.out.print("\\");
                    }
                    else if ((width - 1 - b % width) == a) { // determine where the # goes in each line
                        System.out.print("#");
                    }
                    else { // if neither, print a space
                        System.out.print(" ");
                    }
                }
            }

            System.out.println(""); // make the code end on another line

        }
    }
}