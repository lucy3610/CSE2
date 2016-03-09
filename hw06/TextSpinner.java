//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//Text Spinner Program
//
//  first compile the program
//      javac TextSpinner.java
//  run the program
//      java TextSpinner//
//  define a class
public class TextSpinner{
    
//  add main method    
public static void main(String[] args) {
    int n = 1; // initialize an arbitrary variable
    while ( n > 0 ){ // make the condition always true
        // print the spinner and backspace statements
        System.out.print("/");
        System.out.print("\b");
        System.out.print("-");
        System.out.print("\b");
        System.out.print("\\");
        System.out.print("\b");
        System.out.print("|");
        System.out.print("\b");
    }
    
}
}