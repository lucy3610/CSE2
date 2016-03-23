//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Triangles Java Program
//
//  first compile the program
//      javac Triangles.java
//  run the program
//      java Triangles//
// This program is designed to create a twist like pattern with loops

//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class Triangles {

    //  add main method    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // 
        boolean acceptable = false; // check for integers between 5 and 30
        int n = 0; // initialize variable
        while (!acceptable) {
            System.out.print("Enter a number between 5 and 30: ");
            //check if it's an integer
            if (myScanner.hasNextInt()) {
                n = myScanner.nextInt(); // accept the input
                if (n > 4 && n < 31) { 
                    acceptable = true; // break out of the while loop
                }
                else {
                    System.out.println("Error: please type in an integer.");
                    acceptable = false; // keep asking for an acceptable integer
                }
            }
            else {
                System.out.println("Error: please type in an integer."); // if the input is not an integer this statement will print
                myScanner.next(); // keep asking for input
            }
        }
        System.out.println("FOR LOOP: ");
        int a = 1; // initialize variable
        for (int i = 0; i < n; i++) { // set conditions
            for (int j = 0; j < a; j++) {
                System.out.print(a);
            }
            System.out.println("");
            a++; // increment the number printed
        }
        int descend = 0; // initialize variables
        descend = n - 1;
        for (int i = 0; i < descend; i++) { // set conditions
            for (int j = 2; j < a; j++) {
                System.out.print(a - 2);
            }
            System.out.println("");
            a--; // decrement the number printed
        } 

        System.out.println("WHILE LOOP: ");
        int i = 0; // initalize variables
        int j = 0;
        int b = 1;
        while (i < n) { // set condition
            j = 0;
            while (j < b) {
                System.out.print(b);
                j++; // in the inner loop increment j
            }
            System.out.println("");
            b++; // increment the number printed
            i++; // in the outer loop increment i
        }
        i = 0; // initalize variable
        while (i < descend) { // set condition
            j = 2;
            while (j < b) {
                System.out.print(b - 2);
                j++; // in the inner loop increment j
            }
            System.out.println("");
            b--; // decrement the number printed
            i++; // in the outer loop increment i
        }

        System.out.println("DO-WHILE LOOP: ");
        i = 0; // initialize variables
        j = 0;
        b = 1;
        if (i < n) { // check condition
            do { // go through the code once
                j = 0;
                if (j < b) { // check condition
                    do { // go through the inner loop once
                        System.out.print(b);
                        j++; // in the inner loop increment j
                    } while (j < b); // set condition
                }
                System.out.println("");
                b++; // increment the number printed
                i++; // in the outer loop increment i
            } while (i < n); // continue like a normal while loop
        }

        i = 0;
        if (i < descend) { // check condition
            do { // go through the code once
                j = 2;
                if (j < b) { // check condition
                    do { // go through the inner loop once
                        System.out.print(b - 2);
                        j++; // in the inner loop increment j
                    } while (j < b); // set condition
                }
                System.out.println("");
                b--; // decrement the number printed
                i++; // in the outer loop increment i
            } while (i < descend); // continue like a normal while loop
        }
    }
}
