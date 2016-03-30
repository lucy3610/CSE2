//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Game Java Program
//
//  first compile the program
//      javac Games.java
//  run the program
//      java Games//
//
// Setup the import statement in your program. 
import java.util.Random;
//create an import statement so the scanner class will work
import java.util.Scanner;
// define a class
public class Games {
    //  add main method    
    public static void main(String[] args) {
            System.out.println("Welcome to Lucy's Game Center");
            System.out.println("Please enter one of the following games to play, Guess the Box, Spin the Wheel, or Scrambler: ");
            Scanner myScanner = new Scanner(System.in); // create a scanner
            String game = myScanner.nextLine(); // accept the input
            // if the user does not input the names of the games, ask the user again
            while (!game.toLowerCase().equals("guess the box") && !game.toLowerCase().equals("spin the wheel") && !game.toLowerCase().equals("scrambler")) { // determine if the input is an integer
                System.out.print("Sorry, please enter one of the following games to play, Guess the Box, Spin the Wheel, or Scambler: ");
                game = myScanner.nextLine(); // accept acceptable input
            }
            if (game.toLowerCase().equals("guess the box") ) { // if the user inputs guess the box, run guess the box method
                guessTheBox(); // call the method
            }
            if (game.toLowerCase().equals("spin the wheel") ) { // if the user inputs spin the wheel, run spin the wheel method
                spinTheWheel(); // call the method
            }
            if (game.toLowerCase().equals("scrambler") ) { // if the user inputs scrambler, run scrambler method
                scrambler(); // call the method
             }
            
    }

            public static void guessTheBox() { // create a method for guess the box
                // Create the Random generator
                Random randomGenerator = new Random();
                // Use the nextInt() method of Random() class to generate a random integer 
                int randomInt = randomGenerator.nextInt(4);
                // (This statement generates random integers less than 4)
                System.out.println("Please input a number from 1-3 to choose a box: ");
                Scanner boxNumber = new Scanner(System.in); // create a scanner
                int number = boxNumber.nextInt(); // accept the input
                while (number < 1 || number > 3) { // if the input is not in the bounds, ask the user again
                    System.out.print("Sorry, please enter a number between 1 and 3: ");
                    boxNumber.nextInt(); // continue asking until there is acceptable input
                }
                
                if (number == randomInt) { // if the user input the same number as the random generator, tell them they won!
                    System.out.println("Congratulations, you win a A+ in CSE 2!");
                }
            }

            public static void spinTheWheel() { // create a method for spin the wheel
                    System.out.println("Please enter either black or red and an integer from 1-5 to guess the section of the wheel that the spinner lands on: ");
                    Scanner myScanner = new Scanner(System.in); // create a scanner
                    String spin = myScanner.nextLine(); // accept the input
                    // if the user does not input the right input, ask the user again
                    while (!spin.toLowerCase().equals("red 1") && !spin.toLowerCase().equals("red 2") && !spin.toLowerCase().equals("red 3") && !spin.toLowerCase().equals("red 4") && !spin.toLowerCase().equals("red 5") && !spin.toLowerCase().equals("black 1") && !spin.toLowerCase().equals("black 2") && !spin.toLowerCase().equals("black 3") && !spin.toLowerCase().equals("black 4") && !spin.toLowerCase().equals("black 5") ) {
                        System.out.println("Sorry, please enter either black or red and an integer from 1-5 to guess the section of the wheel that the spinner lands on: ");
                        myScanner.nextLine(); // accept acceptable input
                    }
                        // Create the Random generator
                        String randomNumber = " "; // initialize string
                        // create a random generator
                        Random randomGenerator = new Random();
                        // Use the nextInt() method of Random() class to generate a random integer 
                        int randomInt = randomGenerator.nextInt(11);
                        // (This statement generates random integers less than 11)
                        switch (randomInt) { // create a switch statement for the different sections of the spinner
                            case 1:
                                randomNumber= "Red 1";
                                break;
                            case 2:
                                randomNumber= "Red 2";
                                break;
                            case 3:
                                randomNumber= "Red 3";
                                break;
                            case 4:
                                randomNumber= "Red 4";
                                break;
                            case 5:
                                randomNumber= "Red 5";
                                break;
                            case 6:
                                randomNumber= "Black 1";
                                break;
                            case 7:
                                randomNumber= "Black 2";
                                break;
                            case 8:
                                randomNumber= "Black 3";
                                break;
                            case 9:
                                randomNumber= "Black 4";
                                break;
                            case 10:
                                randomNumber= "Black 5";
                                break;
                        }
                        System.out.println("The wheel landed on " + randomNumber);
                        if (randomNumber.equalsIgnoreCase(spin)) { // if the user inputs the same as the random number, print out the following statement
                            System.out.println("Congratulations, you guessed correctly!");
                        }
                    
            }
            
                public static void scrambler() { // create a method for scrambler
                    System.out.println("This is where the code is supposed to work!");
                    /*String word = " ";
        String[] word = words.trim().split(" ");
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }*/
    }

   
}