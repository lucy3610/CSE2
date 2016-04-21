//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Search Java Program
//
//  first compile the program
//      javac Search.java
//  run the program
//      java Search//
//

// Setup the import statement in your program. 
import java.util.Random;
//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class Search {

    //  add main method    
    public static void main(String[] args) {
        
        int[] array1 = new int [50];
        //int max = array1.length - 1;
        //int arrayMin;
        //int arrayMax;
        int max = 0;
        int min = 0;
        int comparison = 0;
        int compare = 100;
        int [] array2 = new int [array1.length - 1];
        //int arrayOld = 0;
        int a = 0;
        //
        int arrayNum = (int)(Math.random() * 100 + 1) ;
        for (int z = 0; z < array1.length - 1; z++) {
            
            array1[z] = arrayNum;
            if (array1[z] > comparison) {
                max = array1[z];
                comparison = array1[z];
            }
            if (array1[z] < compare) {
                min = array1[z];
                compare = array1[z];
            }
            else {
                
            }
            System.out.print(array1[z] + " ");
        }
    
        System.out.println("The maximum of array1 is: " + max);
        System.out.println("The minimum of array1 is: " + min);
        int max2 = 0;
        int min2 = 0;
        int array2Num = arrayNum + ((int)(Math.random() * 100 + 1));
        for (int m = 0; m < array1.length - 1; m++) {
            
            array1[z] = arrayNum;
            if (array1[z] > comparison) {
                max = array1[z];
                comparison = array1[z];
            }
            if (array1[z] < compare) {
                min = array1[z];
                compare = array1[z];
            }
            else {
                
            }
            System.out.print(array1[z] + " ");
        }
        /*
        while (arrayNum > arrayOld) {
            
            arrayOld = arrayNum;
        }
        int min = array1[0];
        for (int i = 0; i < max; i++ ) {
            if (min > array1[i]){
                min = array1[i];
            break;
            }
        }*/
        //for (int j = 0; j > max; j++ ) {
            //array1[j] = arrayMax;
            //break;
        //}
        //System.out.println(arrayNum);
        //System.out.println("The minimum of array1 is: " + arrayMin);
        //System.out.println("The maximum of array1 is: " + arrayMax);
    }
}