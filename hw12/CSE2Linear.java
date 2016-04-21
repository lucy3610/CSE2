//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Linear Search Java Program
//
//  first compile the program
//      javac CSE2Linear.java
//  run the program
//      java CSE2Linear
//
//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class CSE2Linear {
    public static void binarySearch(int[] grades, int searched) {
        // initialize variables
        boolean foundIt = false;
        int low = 0;
        int numIterations = 0;
        int high = grades.length - 1;
        while (high >= low) { // continue to make the bounds of the binary search smaller
            int mid = (low + high) / 2; // find the middle
            if (searched < grades[mid]) { // search in the numbers smaller than the "mid"
                high = mid - 1;
                numIterations++; // count the interations
            }
            else if (searched == grades[mid]) { // found it!
                foundIt = true;
                break;
            }
            else { // search in the numbers larger than the "mid"
                low = mid + 1;
                numIterations++; // count the iterations
            }
        }
        if (foundIt == true) {
            System.out.println(searched + " was found after " + (numIterations) + " interation(s).");
        }
        else {
            System.out.println(searched + " was not found with " + (numIterations) + " interation(s).");
        }
    }

    //  add main method    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // create a scanner
        int grades[] = new int[15]; // determine the length of the array
        int i = 0; // initialize variable
        System.out.println("Please enter 15 integers, which symbolize students' final grades in CSE2: ");
        int comparison = 0; // initialize variable
        while (i < 15) {
            if (myScanner.hasNextInt()) { // make sure it's an integer
                grades[i] = myScanner.nextInt(); // accept input
                if (grades[i] >= 0 && grades[i] <= 100) { // make sure the range is between 0-100
                    if (grades[i] >= comparison) { // make sure each number is less than the one after it
                        comparison = grades[i];
                    }
                    else {
                        System.out.println("Error, one of the numbers is less than the number before it.");
                        return;
                    }
                }
                else {
                    System.out.println("Error, the integer(s) you entered are not between the range of 0-100.");
                    myScanner.next();
                    return;
                }
            }
            else {
                System.out.println("Error, the value(s) you entered are not integers");
                myScanner.next();
                return;
            }
            i++; // increase i
        }
        // call the binary search method
        System.out.println("Please enter a a grade that you want to search for: ");
        int searched = myScanner.nextInt(); // accept input for the number the user wants to look for
        binarySearch(grades, searched);
        
        // scramble the array
        System.out.println("Scrambled:");
        for (int m = 0; m < 15; m++) {
            //swap with a random member of the array
            int swap = (int)(15 * Math.random());
            int a = grades[swap];
            grades[swap] = grades[m];
            grades[m] = a;
        }
        // print out the swapped array
        for (int x = 0; x < grades.length; x++) {
            System.out.print(grades[x] + " ");
        }
        System.out.println("");
        // linear search
        System.out.println("Please enter a a grade that you want to search for: ");
        int searchAgain = myScanner.nextInt(); // search the array for a number the user wants to find
        int v = 0; // initialize variable
        for (int z = 0; z < 15; z++) {
            if (grades[z] == searchAgain) {
                System.out.println("Found it with " + (v + 1) + " interation(s)!"); // I wasn't sure if it should be k + 1 or k because the sample looks like I should have k + 1, but the definition of an iteration would make it seem like you should only have k
            }
            else {
                v++; // increase v
            }
        }
    }
}