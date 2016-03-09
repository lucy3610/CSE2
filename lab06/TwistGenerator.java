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
public class TwistGenerator{
    
//  add main method    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in ); //
        System.out.print("Please enter a postive integer for the lengh of the twist: ");
        int length = myScanner.nextInt(); //
        if (myScanner.hasNextInt()) { // determine if the input is an integer
        length = myScanner.nextInt(); // this statement accepts the user's input
    }
    else {
        System.out.println("Sorry, your input must consist of integers."); // if the input is not an integer this statement will print and the program will end
        return;
    }
        if ( length > 0 ){
        switch (length % 3){
        case 1:
        System.out.println("\\");
        System.out.println(" ");
        System.out.println("/");
        break;
        case 2:
        System.out.println(" ");
        System.out.println("X");
        System.out.println(" ");
        break;
        case 3:
        System.out.print("\\");
        System.out.println(" ");
        System.out.println("/");
        break;
        }
        }
    }
}