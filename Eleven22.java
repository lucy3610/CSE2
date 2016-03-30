//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
// 2-22-2016
//Decimal to Hexadecimal Converter Java Program
//
//  first compile the program
//      javac Hi.java
//  run the program
//      java ToHex//

//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class Eleven22{
    // main method required for every Java program
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in ); // creates a place for the user to add input
    System.out.print("Please enter three numbers representing the first two Fibonacci numbers and the number of Fibonacci numbers to be printed: "); 
    int a1 = -1; // initialize value1
    int a2 = -1; // initialize value2
    int n = -1; // initialize value3
    if (myScanner.hasNextInt()) { // determine if the input is an integer
        a1 = myScanner.nextInt(); // this statement accepts the user's input
        }
    else {
        System.out.println("Sorry, your input must consist of integers."); // if the input is not an integer this statement will print and the program will end
        myScanner.next();
       
    }
    if (myScanner.hasNextInt()) { // determine if the input is an integer
        a2 = myScanner.nextInt(); // this statement accepts the user's input
    }
    else {
        System.out.println("Sorry, your input must consist of integers."); // if the input is not an integer this statement will print and the program will end
        myScanner.next();
       
    }
    if (myScanner.hasNextInt()) { // determine if the input is an integer
        n = myScanner.nextInt(); // this statement accepts the user's input
    }
    else {
        System.out.println("Sorry, your input must consist of integers."); // if the input is not an integer this statement will print and the program will end
        myScanner.next();
       
    }
    if ( a1 < 0 ){
    System.out.println("Sorry, you must enter values greater than 0.");
    return;
}
if ( a2 < 0 ){
    System.out.println("Sorry, you must enter values greater than 0.");
    return;
}
if ( n < 0 ){
    System.out.println("Sorry, you must enter values greater than 0.");
    return;
}
    System.out.print(a1);
        System.out.print( ", " + a2);
       for (int i=0; i < (n-2); i++ )  {
        System.out.print(", " + (a1 + a2) );
        int b = a1 + a2;
        a1 = a2;
        a2 = b;
       }
       System.out.println(".");
    }
    Random randomGenerator = new Random();
                        // Use the nextInt() method of Random() class to generate a random integer 
                        int randomInt = randomGenerator.nextInt(2);
                        System.out.println(randomInt);
}