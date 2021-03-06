//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Twist Generator Java Program
//
//  first compile the program
//      javac TwistGenerator.java
//  run the program
//      java TwistGenerator//
// This program is designed to create a twist like pattern with loops

//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class TwistGenerator {

    //  add main method    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //
        boolean acceptable = false; // check for acceptable input
        int length = 0; // initialize variable
        while (!acceptable) {
            System.out.print("Please enter a postive integer for the length of the twist: ");
            //check if it's an integer
            if (myScanner.hasNextInt()) {
                length = myScanner.nextInt();
                if (length > 0) { // set conditions
                    acceptable = true; // if it is acceptable, break out of the while loop
                }
                else {
                    System.out.println("Please enter a positive integer for the length of the twist: ");
                    acceptable = false; // keep asking for acceptable input
                }
            }
            else {
                System.out.println("Error: please type in an integer."); // if the input is not an integer this statement will print
                myScanner.next(); // keep asking for input
            }
        }
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++) {
                if (i == j || j == length-j-1) {
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
        /*for (int a = 0; a < 3; a++) { // loop the width
            for (int b = 0; b < length; b++) { // loop the columns
                if ((b / 3) % 2 == 0) { // determine where the # goes in each column
                    if (b % 3 == (1)) {
                        if (a % 3 == 1) {
                            System.out.print("A");
                        }
                        else {
                            System.out.print("B");
                        }
                    }
                    else if (b % 3 == (a + 2)) {
                        System.out.print("C");
                    }
                    else if (b % 3 == a) {
                        System.out.print("D");
                    }
                    else if ((2 - b % 3) == a) { // determine where the / goes in each line
                        System.out.print("E");
                    }
                    else { // if neither, print a space
                        System.out.print("F");
                    }
                }
            */
              /*  else { // determine where each \ goes in each column
                    if (b % 3 == (1)) {
                        if (a % 3 == 1) {
                            System.out.print("X");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    else if (b % 3 == (a + 2)) {
                        System.out.print("/");
                    }
                    else if (b % 3 == a) {
                        System.out.print("\\");
                    }
                    else if ((2 - b % 3) == a) { // determine where the / goes in each line
                        System.out.print("/");
                    }
                    else { // if neither, print a space
                        System.out.print(" ");
                    }*/ 
                    /*
                    if (b % 3 == a) {
                        System.out.print("G");
                    }
                    else if ((2 - b % 3) == a) { // determine where the # goes in each line
                        System.out.print("H");
                    }
                    else { // if neither, print a space
                        System.out.print("I");
                    }

                } 
            }
        }
        System.out.println(""); // make the code end on another line

*/
        /*
        for (int a = 0; a < 3; a++) { // loop the width
            for (int b = 0; b < length; b++) { // loop the columns
            if ( a  % 2 == 1 ){
                if ( (b + 1) % 2 == 1){
                        System.out.print(" X");
                }
            }
                else ((b / 3) % 2 == 0) { // determine where the # goes in each column
                    if (b % 3 == a) {
                        System.out.print("\\");
                    }
                    else if ((2 - b % 3) == a) { // determine where the / goes in each line
                        System.out.print("/");
                    }
                    else { // if neither, print a space
                        System.out.print(" ");
                    }
                }*/
        /* else { // determine where each \ goes in each column
                    if (b % 3 == a) {
                        System.out.print("3");
                    }
                    else if ((2 - b % 3) == a) { // determine where the # goes in each line
                        System.out.print("3");
                    }
                    else { // if neither, print a space
                        System.out.print(" ");
                    }
                } 
            }

            System.out.println(""); // make the code end on another line
        }*/
    }
}