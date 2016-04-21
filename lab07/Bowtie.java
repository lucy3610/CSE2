//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Lab 7 Bowtie
//
//  first compile the program
//      javac Bowtie.java
//  run the program
//      java Bowtie//

//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class Bowtie{
    
//  add main method    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //
        boolean acceptable = false; // check for integers between 5 and 30
        int nStars = 0; // initialize variable
        int n = 0;
        while (!acceptable) {
            System.out.print("Enter an odd number between 3 and 33: ");
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
        System.out.println("Please enter: ");
        nStars = 1;
        int a = 1;
        nStars = myScanner.nextInt(); // accept the input
        String space = "* ";
        for ( int i = 0; i < nStars; i++ ){
            for (int j = 0; j < a; j++){
            // space = space;
            System.out.print(space);
        }
        System.out.println("");
        a++;
        }
        int opposite = 1;
        opposite = nStars - 1;
        for ( int i = 0; i < opposite; i++ ){
            for (int j = 2; j < a; j++){
            // space = space;
            System.out.print(space);
        }
        System.out.println("");
        a--;
        }
        // System.out.println(" ");
        //     // 
        //     for ( int i = 0; i < (nStars - 1); i++ ){
        //         space = space;
        //         System.out.print(space);
        //     }
           
            // for ( int j = 0; j < 3; j++ ){
            //     for ( i = 0; i < j; i++ ){
            //         space = space;
            //         System.out.print(space);
            //     }
            // }
        
        System.out.println(" ");
        
    }
}