//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
// CSE2
// 5/2/16
//Homework 13 Holoportation
//
//  first compile the program
//      javac Holoportation.java
//  run the program
//      java Holoportation//
// This program is designed to manipulate multidimensional ragged arrays and work with methods that have array parameters
//
// Setup the import statement
import java.util.Random;
//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class Holoportation {

    public static String[][][] soRandom() {

        Random random = new Random();
        // create a 3D array with random length
        String[][][] arrayMain = new String[random.nextInt(10)][][];
        for (int i = 0; i < arrayMain.length; i++) {
            arrayMain[i] = new String[random.nextInt(10)][];
        }
        for (int j = 0; j < arrayMain.length; j++) {
            for (int k = 0; k < arrayMain[j].length; k++) {
                arrayMain[j][k] = new String[random.nextInt(10)];
            }
        }
        return arrayMain; // return the array
    }
    public static String coder() {
        // get two random letters
        int count = 2;
        String code = "";
        while (count > 0) {
            int alphabet = (int)(Math.random() * 26); // create a random generator
            String letter = "";
            switch (alphabet) {
                case 0:
                    letter = "A";
                    break;
                case 1:
                    letter = "B";
                    break;
                case 2:
                    letter = "C";
                    break;
                case 3:
                    letter = "D";
                    break;
                case 4:
                    letter = "E";
                    break;
                case 5:
                    letter = "F";
                    break;
                case 6:
                    letter = "G";
                    break;
                case 7:
                    letter = "H";
                    break;
                case 8:
                    letter = "I";
                    break;
                case 9:
                    letter = "J";
                    break;
                case 10:
                    letter = "K";
                    break;
                case 11:
                    letter = "L";
                    break;
                case 12:
                    letter = "M";
                    break;
                case 13:
                    letter = "N";
                    break;
                case 14:
                    letter = "O";
                    break;
                case 15:
                    letter = "P";
                    break;
                case 16:
                    letter = "Q";
                    break;
                case 17:
                    letter = "R";
                    break;
                case 18:
                    letter = "S";
                    break;
                case 19:
                    letter = "T";
                    break;
                case 20:
                    letter = "U";
                    break;
                case 21:
                    letter = "V";
                    break;
                case 22:
                    letter = "W";
                    break;
                case 23:
                    letter = "X";
                    break;
                case 24:
                    letter = "Y";
                    break;
                case 25:
                    letter = "Z";
                    break;
            }
            count--;
            code = code + letter; // put letters together
        }
        // get four random numbers
        int counter = 4;
        while (counter > 0) {
            int number = (int)(Math.random() * 10); // create a random generator
            counter--;
            code = code + number; // put whole code together
        }

        return code; // return the code
    }
    public static void print(String[][][] formattedArray) {
        for (int i = 0; i < formattedArray.length; i++) { // first dimension of the 3D array
            for (int j = 0; j < formattedArray[i].length; j++) { // second dimension of the 3D array
                System.out.print("[");
                for (int k = 0; k < formattedArray[i][j].length; k++) { // third dimension of the 3D array
                    System.out.print(formattedArray[i][j][k]);
                    if (k != formattedArray[i][j].length - 1) { // only print out commas for each of the codes except the last one in the row
                        System.out.print(", ");
                    }
                }
                System.out.print("]");
                if (j != formattedArray[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            if (i != formattedArray.length - 1) {
                System.out.print("---");
            }
            //System.out.print("]");
            //System.out.print("|");

            //System.out.print(code);
        }
        System.out.println("");
        //
    }
    public static void holoport(String[][][] array1, String[][][] array2) {
        //print(array2);
        //int randomLength = (int)(Math.random() * 26); // create a random generator
        for (int i = 0; i < array2.length; i++) {
            if (i < array1.length) { // if the second array is smaller than the first array, truncate the array
                for (int j = 0; j < array2[i].length; j++) {
                    if (j < array1[i].length) { // if the second dimension of the second array is smaller than the second dimensions of the first array, truncate the array
                        for (int k = 0; k < array2[i][j].length; k++) {
                            if (k < array1[i][j].length) { // if the third dimension of the second array is smaller than the third dimension of the first array, truncate the array
                                array2[i][j][k] = array1[i][j][k];

                            }
                            else { // if array2 is longer, replace the code with dollar signs
                                array2[i][j][k] = "$$$$$$";
                            }
                        }
                    }
                    else { // if array2 is longer, replace the code with dollar signs
                        for (int k = 0; k < array2[i][j].length; k++) {
                            array2[i][j][k] = "$$$$$$";
                        }
                    }
                }
            }
            else { // if array2 is longer, replace the code with dollar signs
                for (int j = 0; j < array2[i].length; j++) {
                    for (int k = 0; k < array2[i][j].length; k++) {
                        array2[i][j][k] = "$$$$$$";
                    }
                }
            }
        }

    }
    public static void sampling(String[][][] samplingArray, String specialcode) {
        boolean foundIt = false;
        int d = 0;
        // if the user inputs a code that is in the array print out where it is
        for (int i = 0; i < samplingArray.length; i++) {
            for (int j = 0; j < samplingArray[i].length; j++) {
                for (int k = 0; k < samplingArray[i][j].length; k++) {
                    if (samplingArray[i][j][k].equals(specialcode) && d == 0) {
                        System.out.println("(" + i + ", " + j + ", " + k + ")");
                        foundIt = true;
                        d = 1;

                    }
                }
            }
        }
        if (foundIt == false) { // if the user does not input a code that is in the array

            System.out.println("Code not found.");
        }

    }
    public static double percentage(String[][][] firstArray, String[][][] secondArray) {
        double firstCounter = 0;
        double secondCounter = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                for (int k = 0; k < firstArray[i][j].length; k++) {
                    firstCounter++; // count how many codes there are in the first array
                }
            }
        }
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                for (int k = 0; k < secondArray[i][j].length; k++) {
                    secondCounter++; // count how many codes are in the second array
                }
            }
        }
        //  find the percent of array2 that was preserved from array1
        double percentageNumber = (((firstCounter - secondCounter) / firstCounter) * 100);
        return percentageNumber;
    }

    public static void frankenstein(String[][][] arrayMain) {
        // sort the array
        for (int k = 0; k < arrayMain.length; k++) { // look at each row
            for (int i = 0; i < arrayMain[k].length; i++) {
                //for (int c = 0; c < arrayMain[k][i].length; c++) {
                int smallest = i;

                for (int j = i; j < arrayMain[k].length; j++) { // start at the next member of the array
                    //for (c = 0; c < arrayMain[k][j].length; c++) {
                    //if (arrayMain[k][j] < arrayMain[k][i]) { // change to > if we want largest to smallest
                        smallest = j;
                        String temp[] = arrayMain[k][i];
                        arrayMain[k][i] = arrayMain[k][smallest];
                        arrayMain[k][smallest] = temp;
                    }
                }
            }
        //}
        // print out the sorted array
        System.out.println("\nSORTED: [");
        for (int a = 0; a < arrayMain.length; a++) {
            for (int b = 0; b < arrayMain[a].length; b++) {
                for (int c = 0; c < arrayMain[a][b].length; c++) {
                    System.out.print(arrayMain[a][b] + ", ");
                }
                System.out.println();
            }
            System.out.print("]\n");
            for (int n = 0; n < arrayMain.length; n++) {}
            
            // create the triangle shape
            int comparison = arrayMain[0].length;
            for (int s = 0; s < arrayMain.length; s++) {
                for (int r = arrayMain.length - 1; r >= 0; r--) { // amount of for loops for dimension of array
                    for (int p = r; p >= 0; p--) {
                        int largest = r;
                        if (arrayMain[s][r].length < arrayMain[s][p].length) {
                            largest = p;
                            String temp[] = arrayMain[s][r];
                            arrayMain[s][r] = arrayMain[s][largest];
                            arrayMain[s][largest] = temp;
                        }
                    }
                }
            }
        }
        // print out the triangle shape
        System.out.println("\nREARRANGED: [");
        for (int h = 0; h < arrayMain.length; h++) {
            for (int w = 0; w < arrayMain[h].length; w++) {
                System.out.print(arrayMain[h][w] + ", ");
            }
            System.out.println();
        }
    }

    //  add main method    
    public static void main(String[] args) {
        String[][][] formattedArray = soRandom(); // call soRandom()
        String[][][] newArray = soRandom(); // call soRandom() again
        for (int i = 0; i < formattedArray.length; i++) {
            for (int j = 0; j < formattedArray[i].length; j++) {
                for (int k = 0; k < formattedArray[i][j].length; k++) {
                    formattedArray[i][j][k] = coder(); // call coder()
                }
            }
        }
        print(formattedArray); // call print()
        holoport(formattedArray, newArray); // call holoport()
        print(newArray); // call print()
        Scanner myScanner = new Scanner(System.in);

        String specialcode = "";
        // make sure the user inputs a code that is in the right format
        while (true) {
            //if (myScanner.hasNextLine()){
            System.out.println("Please enter a code that is in the format XXYYYY: ");
            specialcode = myScanner.nextLine();
            //See if the character is a letter or not.
            if (Character.isLetter(specialcode.charAt(0)) == true) {
                if (Character.isLetter(specialcode.charAt(1)) == true) {
                    if (Character.isDigit(specialcode.charAt(2)) == true) {
                        if (Character.isDigit(specialcode.charAt(3)) == true) {
                            if (Character.isDigit(specialcode.charAt(4)) == true) {
                                if (Character.isDigit(specialcode.charAt(5)) == true) {
                                    break;

                                }
                                else {
                                    System.out.println("Please enter a code that is in the format XXYYYY: ");
                                    myScanner.nextLine();
                                }
                                //}
                            }
                            else {
                                System.out.println("Please enter a code that is in the format XXYYYY: ");
                                myScanner.nextLine();
                            }
                        }
                        else {
                            System.out.println("Please enter a code that is in the format XXYYYY: ");
                            myScanner.nextLine();
                        }

                    }
                    else {
                        System.out.println("Please enter a code that is in the format XXYYYY: ");
                        myScanner.nextLine();
                    }
                }
                else {
                    System.out.println("Please enter a code that is in the format XXYYYY: ");
                    myScanner.nextLine();
                }
            }
            else {
                System.out.println("Please enter a code that is in the format XXYYYY: ");
                myScanner.nextLine();
            }
        }

        sampling(formattedArray, specialcode); // call sampling()
        // print out the percent of the new array that was kept from the original array
        double percentageNumber = percentage(formattedArray, newArray);
        System.out.println(Math.floor(percentageNumber) + "% of the original array was preserved.");
        frankenstein(formattedArray); // call frankenstein
    }
}