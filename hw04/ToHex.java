//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
// 2-22-2016
//Decimal to Hexadecimal Converter Java Program
//
//  first compile the program
//      javac ToHex.java
//  run the program
//      java ToHex//

//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class ToHex{
    // main method required for every Java program
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in ); // creates a place for the user to add input
    System.out.print("Please enter three numbers representing RGB values: "); 
    int value1 = -1; // initialize value1
    int value2 = -1; // initialize value2
    int value3 = -1; // initialize value3
    if (myScanner.hasNextInt()) { // determine if the input is an integer
        value1 = myScanner.nextInt(); // this statement accepts the user's input
    }
    else {
        System.out.println("Sorry, your input must consist of integers."); // if the input is not an integer this statement will print and the program will end
        return;
    }
    if (myScanner.hasNextInt()) { // determine if the input is an integer
        value2 = myScanner.nextInt(); // this statement accepts the user's input
    }
    else {
        System.out.println("Sorry, your input must consist of integers."); // if the input is not an integer this statement will print and the program will end
        return;
    }
    if (myScanner.hasNextInt()) { // determine if the input is an integer
        value3 = myScanner.nextInt(); // this statement accepts the user's input
    }
    else {
        System.out.println("Sorry, your input must consist of integers."); // if the input is not an integer this statement will print and the program will end
        return;
    }
    // for each value, make sure the values are between 0-255
if ( value1 < 0 || value1 > 255 ){
    System.out.println("Sorry, you must enter values between 0-255.");
    return;
}
if ( value2 < 0 || value2 > 255 ){
    System.out.println("Sorry, you must enter values between 0-255.");
    return;
}
if ( value3 < 0 || value3 > 255 ){
    System.out.println("Sorry, you must enter values between 0-255.");
    return;
}
// print the general statement
System.out.println("The decimal numbers R:"+ value1 +", G:"+ value2 +", B:"+ value3 +", is represented in hexadecimal as: ");     
// for each value, the first number in the hexidecimal is the value divided by 16
// if the whole number of the answer is from 0-9, then that digit for the hexadecimal is that number
if ( value1 / 16 < 10 ){
    System.out.print( value1 / 16 );
}
// if the whole number of the answer is from 10-15, then it should print out the cooresponding letter
else {
    switch ( value1 / 16 ){
    case 10:
    System.out.print("A");
    break;
    case 11:
    System.out.print("B");
    break;
    case 12:
    System.out.print("C");
    break;
    case 13:
    System.out.print("D");
    break;
    case 14:
    System.out.print("E");
    break;
    case 15:
    System.out.print("F");
    }   
}
// for each value, the second number in the hexidecimal is the value modulo of 16
// if the whole number of the answer is from 0-9, then that digit for the hexadecimal is that number
if ( value1 % 16 < 10 ){
    System.out.print( value1 % 16 );
}
// if the whole number of the answer is from 10-15, then it should print out the cooresponding letter
else {
    switch ( value1 % 16 ){
    case 10:
    System.out.print("A");
    break;
    case 11:
    System.out.print("B");
    break;
    case 12:
    System.out.print("C");
    break;
    case 13:
    System.out.print("D");
    break;
    case 14:
    System.out.print("E");
    break;
    case 15:
    System.out.print("F");
    }
}    
if (value2 / 16 < 10){
    System.out.print( value2 / 16 );
}
else {
    switch ( value2 / 16 ){
    case 10:
    System.out.print("A");
    break;
    case 11:
    System.out.print("B");
    break;
    case 12:
    System.out.print("C");
    break;
    case 13:
    System.out.print("D");
    break;
    case 14:
    System.out.print("E");
    break;
    case 15:
    System.out.print("F");
    }   
}
if ( value2 % 16 < 10){
    System.out.print( value2 % 16 );
}
else {
 switch ( value2 % 16 ){
    case 10:
    System.out.print("A");
    break;
    case 11:
    System.out.print("B");
    break;
    case 12:
    System.out.print("C");
    break;
    case 13:
    System.out.print("D");
    break;
    case 14:
    System.out.print("E");
    break;
    case 15:
    System.out.print("F");
    }
}
if (value3 / 16 < 10){
    System.out.print( value3 / 16 );
    }
else {
    switch ( value3 / 16 ){
    case 10:
    System.out.print("A");
    break;
    case 11:
    System.out.print("B");
    break;
    case 12:
    System.out.print("C");
    break;
    case 13:
    System.out.print("D");
    break;
    case 14:
    System.out.print("E");
    break;
    case 15:
    System.out.print("F");
    }   
}
if ( value3 % 16 < 10){
    System.out.print( value3 % 16 );
}
else {
    switch ( value3 % 16 ){
    case 10:
    System.out.println("A");
    break;
    case 11:
    System.out.println("B");
    break;
    case 12:
    System.out.println("C");
    break;
    case 13:
    System.out.println("D");
    break;
    case 14:
    System.out.println("E");
    break;
    case 15:
    System.out.println("F");
    }
} 
System.out.print("\n"); // tells the program to go to the next line at the end of the code
}
}