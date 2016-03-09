//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Homework 6 Factorials
//
//  first compile the program
//      javac RunFactorial.java
//  run the program
//      java RunFactorial//

//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class RunFactorial{
    
//  add main method    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in ); // create a scanner
        System.out.println("Please enter a number between 9 and 16: ");
        int factorial = 1, n = 1; // initialize the varibales
        while (true){
          if (myScanner.hasNextInt() ){ // make sure the input is an integer
             n = myScanner.nextInt(); // this statement accepts the user's input
             if ( !(n > 9 && n < 16) ){ // if the integer is outside the correct bounds, ask for new input
               System.out.println("Sorry, please enter a number between 9 and 16: ");
               myScanner.nextLine(); // accepts new input
              }
             else {
                 break; // if it is an integer in the correct bounds, then move on
             }
          }
          else{ // if it is not an integer ask for new input
            System.out.println("Sorry, please enter a number between 9 and 16: ");
            myScanner.nextLine(); // accepts new input
          }
        }    
        int answer = n; // prints out the input
        while ( n > 1 ){ // calculates the factorial
            factorial *= n;
            n--;
        }
        System.out.println(answer + "! = " + factorial); // prints out the factorial
    }
}