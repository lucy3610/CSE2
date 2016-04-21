//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Remove Elements Java Program
//
//  first compile the program
//      javac RemoveElements.java
//  run the program
//      java RemoveELements
//
// Setup the import statement in your program. 
import java.util.Random;
//create an import statement so the scanner class will work
import java.util.Scanner;
// define a class
public class RemoveElements {
    public static int[] randomInput() {
        int randomInputArray[] = new int[10];  // declare the length of the array
        for (int a = 0; a < 10; a++) { 
            int input = (int)(Math.random() * 10);  // create a random generator
            randomInputArray[a] = input; 
        }
        return randomInputArray; // return the array
    }
    public static int[] delete(int list[], int pos) {
        if (pos < 0 || pos > 10) { // make sure the input is valid
            System.out.println("This index is not valid.");
        }
        int newList[] = new int[list.length - 1]; // declare the length of the array
        int counter = 0; // initialize variable
        for (int i = 0; i < list.length - 1; i++) {
            if (i == pos) { // if i is equal to the position you are looking for, "take it out" and put the next value in its place
                newList[i] = list[i + 1];
                counter = 1;
            }
            else if (counter == 0) {  // keep the member of the array where it is
                newList[i] = list[i];
            }
            else if (counter == 1) { // "delete" this member of the array
                newList[i] = list[i + 1];
            }
        }
        return newList; // return the array
    }
    public static int[] remove(int num[], int target) { 
        int i = 0; // initialize variable
        for (int a = 0; a < num.length; a++) { // count how many times the target number is found
            if (num[a] == target) {
                i++; 
            }
        }
        if (i == 0) {  // if the target number is not found
            System.out.println("Element " + target + " was not found.");
            return num; // print out the original array
        }
        else {
            System.out.println("Element " + target + " has been found.");
        }
        int removeList = num.length - i; //length of new array
        int array[] = new int[removeList]; 
        int p = 0; // initialize variable
        for (int a = 0; a < num.length; a++) {
            if (num[a] == target) {  // don't print anything out
                
            }
            else { // "remove" the member of the array and put the next array in its place
                array[p] = num[a];
                p++; 
            }
        }
        return array; // return the array
    }
    // main method
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int list[] = new int[10];
        int num[] = new int[10];
        int newArray1[];
        int newArray2[];
        int index, target;
        String answer = "";
        do {
            System.out.print("Random input 10 ints [0-9]");
            num = randomInput();
            String out = "The original array is:";
            out += listArray(num);
            System.out.println(out);

            System.out.print("Enter the index ");
            index = scan.nextInt();
            newArray1 = delete(num, index);
            String out1 = "The output array is ";
            out1 += listArray(newArray1); //return a string of the form "{2, 3, -9}"  
            System.out.println(out1);

            System.out.print("Enter the target value ");
            target = scan.nextInt();
            newArray2 = remove(num, target);
            String out2 = "The output array is ";
            out2 += listArray(newArray2); //return a string of the form "{2, 3, -9}"  
            System.out.println(out2);

            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]) {
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }

}