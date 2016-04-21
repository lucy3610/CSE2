//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
// 2-22-2016
//Decimal to Hexadecimal Converter Java Program
//
//  first compile the program
//      javac Hi.java
//  run the program
//      java ToHex//
import java.util.Random;
//create an import statement so the scanner class will work
import java.util.Scanner;
//  define a class
public class Eleven22{
    // main method required for every Java program
    public static void main(String[] args) { 

    Random randomGenerator = new Random();
        // Use the nextInt() method of Random() class to generate a random integer 
        int randomInt = randomGenerator.nextInt(12);
    switch (randomInt) {
                case 1:
                    // 1, 14, 27, 40
                    System.out.println("1");
                    break;
                   
                    default:
                    System.out.println("default");
                        break;
                        default:
                        System.out.println("default2");
                case 11:
                    // 11, 24, 37, 50
                    System.out.println("11");
                    break;
                case 4:
                    // 12, 25, 38, 51
                    System.out.println("4");
                    break;
                case 0:
                    // 13, 26, 39, 52
                    System.out.println("0");
                    break;
                
                
                    }
    
}
}