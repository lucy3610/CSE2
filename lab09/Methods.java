//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Method Java Program
//
//  first compile the program
//      javac Methods.java
//  run the program
//      java Methods//
//

//create an import statement so the scanner class will work
import java.util.Scanner;
// Setup the import statement in your program. 
import java.util.Random;
//
//  define a class
public class Methods {
    //  add main method    
    public static void main(String[] args) {
        String again = "yes";
        Scanner myScanner = new Scanner(System.in); // creates a place for the user to add input
        while (again.toLowerCase().equals("yes")) {
            System.out.println("The " + adjective() + " " + subject() + " " + verb() + " the " + object() + ".");
            System.out.print("Do you want to make a new sentence? ");
            again = myScanner.next();
        }


    }




    /* Scanner myScanner = new Scanner(System.in); //
        boolean acceptable = false; // check for acceptable input
        // int answer = 0; // initialize variable
        String answer = "yes";
    // while (randomInt < 10)
    //check length
        while (!acceptable) {
        System.out.println("The " + adjective() + " " + subject() + " " + verb() + " the " + object() + ".");
    
            System.out.print("Do you want to make another sentence? ");
            //check if it's an integer
            if (myScanner.hasNextString() = yes) {
                    acceptable = true; // if it is acceptable, break out of the while loop
            }
            else {
                break;
            }
        } */



    public static String adjective() {
        // Create the Random() object 
        Random randomGenerator = new Random();
        // Use the nextInt() method of Random() class to generate a random integer 
        int randomInt = randomGenerator.nextInt(10);
        String adjective = " ";
        // (This statement generates random integers less than 10)
        switch (randomInt) {
            case 0:
                adjective = "colorful";
                break;
            case 1:
                adjective = "pretty";
                break;
            case 2:
                adjective = "nasty";
                break;
            case 3:
                adjective = "wonderful";
                break;
            case 4:
                adjective = "smart";
                break;
            case 5:
                adjective = "arrogant";
                break;
            case 6:
                adjective = "green";
                break;
            case 7:
                adjective = "happy";
                break;
            case 8:
                adjective = "silly";
                break;
            case 9:
                adjective = "funny";
                break;
        }
        return adjective;
    }
    public static String subject() {
        // Create the Random() object 
        Random randomGenerator = new Random();
        // Use the nextInt() method of Random() class to generate a random integer 
        int randomInt = randomGenerator.nextInt(10);
        // (This statement generates random integers less than 10)
        String subject = " ";
        switch (randomInt) {
            case 0:
                subject = "dog";
                break;
            case 1:
                subject = "fox";
                break;
            case 2:
                subject = "boy";
                break;
            case 3:
                subject = "grandmother";
                break;
            case 4:
                subject = "child";
                break;
            case 5:
                subject = "man";
                break;
            case 6:
                subject = "actress";
                break;
            case 7:
                subject = "girl";
                break;
            case 8:
                subject = "fish";
                break;
            case 9:
                subject = "singer";
                break;
        }
        return subject;
    }
    public static String verb() {
        // Create the Random() object 
        Random randomGenerator = new Random();
        // Use the nextInt() method of Random() class to generate a random integer 
        int randomInt = randomGenerator.nextInt(10);
        // (This statement generates random integers less than 10)
        String verb = " ";
        switch (randomInt) {
            case 0:
                verb = "ran to";
                break;
            case 1:
                verb = "looked at";
                break;
            case 2:
                verb = "saw";
                break;
            case 3:
                verb = "played";
                break;
            case 4:
                verb = "ate";
                break;
            case 5:
                verb = "fell on";
                break;
            case 6:
                verb = "sat on";
                break;
            case 7:
                verb = "swam to";
                break;
            case 8:
                verb = "sang";
                break;
            case 9:
                verb = "broke";
                break;
        }
        return verb;
    }

    public static String object() {

        // Create the Random() object 
        Random randomGenerator = new Random();
        // Use the nextInt() method of Random() class to generate a random integer 
        int randomInt = randomGenerator.nextInt(10);
        // (This statement generates random integers less than 10)
        String object = " ";
        switch (randomInt) {
            case 0:
                object = "bird";
                break;
            case 1:
                object = "cloud";
                break;
            case 2:
                object = "door";
                break;
            case 3:
                object = "book";
                break;
            case 4:
                object = "jacket";
                break;
            case 5:
                object = "key";
                break;
            case 6:
                object = "song";
                break;
            case 7:
                object = "computer";
                break;
            case 8:
                object = "wall";
                break;
            case 9:
                object = "bus";
                break;
        }
        return object;


    }
}
