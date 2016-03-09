//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Homework 6 Fibonacci Numbers
//
//  first compile the program
//      javac Fibonacci.java
//  run the program
//      java Fibonacci//

//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class Fibonacci{
    
//  add main method    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in ); // create a scanner
        // ask the user for the first input
        System.out.print("Please enter the first Fibonacci number: ");
        int a1 = -1, a2 = -1, n = -1; // initialize the variables
        while (!myScanner.hasNextInt() ){ // determine if the input is an integer
          System.out.print("Sorry, please enter a positive integer: ");
          myScanner.next(); // accept new input
        }
        // if it is an integer, define it as a1
        a1 = myScanner.nextInt();
        while (a1 <= 0){ // determine if a1 is positive
            System.out.print("That's not positive. Enter again: ");
             while (!myScanner.hasNextInt() ){ // if it is not positive, ask again
            System.out.print("Sorry, please enter a positive integer: ");
            myScanner.next();
            }
            a1 = myScanner.nextInt(); // accept the appropriate input
        }
        // ask for the next input
        System.out.print("Please enter the second Fibonacci number: ");
        while (!myScanner.hasNextInt() ){ // make sure it is a positive integer
          System.out.print("Sorry, please enter a positive integer: ");
          myScanner.next(); // accept new input
        }
        // if it is an integer, assign it to a2
        a2 = myScanner.nextInt();
        while (a2 <= 0){ // deterine if a2 is positive
            System.out.print("That's not positive. Enter again: ");
             while (!myScanner.hasNextInt() ){ // make sure it is a positive integer
            System.out.print("Sorry, please enter a positive integer: ");
            myScanner.next(); // accept new input
            }
            a2 = myScanner.nextInt(); // accept the appropriate input
        }
        // ask for the next input
        System.out.print("Please enter the number of Fibonacci numbers to be printed: ");
        while (!myScanner.hasNextInt() ){ // make sure it is a positive integer
          System.out.print("Sorry, please enter a positive integer: ");
          myScanner.next(); // accept new input
        }
        // if it is an integer, assign it to n
        n = myScanner.nextInt();
        while (n <= 0){ // determine if n is positive
            System.out.print("That's not positive. Enter again: ");
             while (!myScanner.hasNextInt() ){ // make sure it is a positive integer
            System.out.print("Sorry, please enter a positive integer: ");
            myScanner.next(); // accept new input
            }
            n = myScanner.nextInt(); // accept the appropriate input
        }
        System.out.print(a1); // print the first number in the series
        System.out.print( ", " + a2); // print the second number in the series
      for (int i=0; i < (n-2); i++ )  { // print the next numbers in the series
        System.out.print(", " + (a1 + a2) );
        int b = a1 + a2;
        a1 = a2;
        a2 = b;
      }
      System.out.println(".");
    }
}