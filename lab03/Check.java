//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Check Java Program
//
//  first compile the program
//      javac Check.java
//  run the program
//      java Check//
// create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class Check{
// main method required for every Java program
public static void main(String[] args) {
Scanner myScanner = new Scanner( System.in ); // creates a place for the user to add input
System.out.print("Enter the original cost of the check  in the form xx.xx: "); // prints out the statement after the user has inputed the original cost
double checkCost = myScanner.nextDouble(); // this statement accepts the user's input
System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): " ); // user inputs how much they want to tip
double tipPercent = myScanner.nextDouble(); // this statement accepts the user's input
tipPercent = 100; //We want to convert the percentage into a decimal value
System.out.print("Enter the number of people who want to split the check: "); // user inputs how many people want to split the check
int numPeople = myScanner.nextInt(); // this statement accept's the users input (it can be a integer because the amount of people is a whole number)
double totalCost; // assign variable names
double costPerPerson; // assign variable names
int dollars,   //whole dollar amount of cost 
      dimes, pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost
totalCost = checkCost * (1 + tipPercent);
costPerPerson = totalCost / numPeople;
//get the whole amount, dropping decimal fraction
dollars=(int)costPerPerson;
//get dimes amount, e.g., 
// (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
//  where the % (mod) operator returns the remainder
//  after the division:   583%100 -> 83, 27%5 -> 2 
dimes=(int)(costPerPerson * 10) % 10;
pennies=(int)(costPerPerson * 100) % 10;
System.out.println("Each person in the group owes $" + dollars + "."+ dimes + pennies);
}  //end of main method   
      } //end of class