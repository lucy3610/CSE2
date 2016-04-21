//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Array Java Program
//
//  first compile the program
//      javac Arrays.java
//  run the program
//      java Arrays//
// This program is designed to create a twist like pattern with loops

// Setup the import statement in your program. 
import java.util.Random;
//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class Arrays {

    //  add main method    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //
        // Create the Random generator
        // Random randomGenerator = new Random();
        // Use the nextInt() method of Random() class to generate a random integer 
        // int randomInt = randomGenerator.nextInt(11);
        // (This statement generates random integers less than 11)
        int numStudents = (int)(Math.random() * 6) + 5;
        //System.out.print(numStudents);
        int i = 0;
        int midtermGrade = (int)(Math.random() * 100 + 1);
        int[] midterm;
        String [] students = new int[numStudents];
        while (numStudents > 4 && numStudents < 11) {
            System.out.println("Please enter a student's name");
                String studentName = myScanner.nextLine(); // accept the input
                
                
                //String []students = new String[10];
                for (i = 0; i < numStudents; i++) {
                    students[i] = myScanner.nextLine();
                    
                }
                numStudents--;
                
        }
        for (i = 0; i < numStudents; i++) {
        System.out.println(students[i] + ": " + midtermGrade);
        }
            System.out.print(numStudents);
        
        //String [] students;

    }
}