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
        Scanner myScanner = new Scanner( System.in ); //
        // this is from online
        /*int a1 = 1, a2 = 1, n = 1;
        boolean isCorrectNumber = false;
        System.out.print("Please enter a postive integer for the first Fibonacci number: ");
        while (!isCorrectNumber){
            if ( myScanner.hasNextInt() ){
                a1 = myScanner.nextInt();
                if (a1 > 0){
                    isCorrectNumber = true;
                    continue;
                }
                System.out.println("Please enter a positive integer: ");
                a1 = myScanner.nextInt();
            }
        }
        */
        int a1 = -1, a2 = -1, n = -1;
        boolean boo = false;
        while (!boo){
            if ( myScanner.hasNextInt() ){
            a1 = myScanner.nextInt(); // this statement accepts the user's input
                if ( a1 > 0 ){
               boo = true;
                }
                else{
                  System.out.print("Please enter a postive integer for the first Fibonacci number: ");
                }
            }
            else{
                System.out.print("Sorry, invalid number, please enter a positve interger for the first Fibonacci number: ");
                myScanner.next();
            }
        }
        /*
        Scanner Scanner2 = new Scanner( System.in ); //
        System.out.print("Please enter a postive integer for the second Fibonacci number: ");
        int a2 = -1;
        while (!boo){
            if ( Scanner2.hasNextInt() ){
            a2 = Scanner2.nextInt(); // this statement accepts the user's input
                if ( a2 > 0 ){
               boo = true;
                }
                else{
                  System.out.print("Please enter a postive integer for the second Fibonacci number: ");
                }
            }
            else{
                System.out.print("Sorry, invalid number, please enter a positve interger for the second Fibonacci number: ");
                Scanner2.next();
            }
        }
        Scanner Scanner3 = new Scanner( System.in ); //
        System.out.print("Please enter a postive integer for the number of Fibonacci numbers to be printed: ");
        int n = -1;
        while (!boo){
            if ( Scanner3.hasNextInt() ){
            n = Scanner3.nextInt(); // this statement accepts the user's input
                if ( n > 0 ){
               boo = true;
                }
                else{
                  System.out.print("Please enter a postive integer for the number of Fibonacci numbers to be printed: ");
                }
            }
            else{
                System.out.print("Sorry, invalid number, please enter a positve interger for the number of Fibonacci numbers to be printed: ");
                Scanner3.next();
            }
        }
      /*  System.out.print("Please enter a postive integer: ");
        int a2 = myScanner.nextInt();
        while ( a2 < 0 ){
            System.out.print("Sorry, invalid number, please enter a positve interger");
            System.out.print("Please enter a postive integer for the second Fibonacci number: ");
            a2 = myScanner.nextInt(); // this statement accepts the user's input
        }
        System.out.print("Please enter a postive integer: ");
        int n = myScanner.nextInt();
        while ( n < 0 ){
            System.out.print("Sorry, invalid number, please enter a positve interger");
            System.out.print("Please enter a postive integer for the number of Fibonacci numbers to be printed: ");
            n = myScanner.nextInt(); // this statement accepts the user's input
        }
        }       */
        System.out.print(a1);
        System.out.print( ", " + a2);
       for (int i=0; i < (n-2); i++ )  {
        System.out.print(", " + (a1 + a2) );
        int b = a1 + a2;
        a1 = a2;
        a2 = b;
       }
       System.out.print(".");
    }
}