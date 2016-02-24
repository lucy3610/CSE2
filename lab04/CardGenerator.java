//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//2-19-16
//Card Generator Program
//
//  first compile the program
//      javac CardGenerator.java
//  run the program
//      java CardGenerator//
//  define a class
public class CardGenerator{
    // Create a random number generator for choosing a random number that coresponds to a card in a card deck
    
//  add main method    
public static void main(String[] args) {
    int card = (int)(Math.random()*(52+1))+baseNum;
    int card = (int)(Math.random()*13)+2;
    if (card >= 1 && card <= 13){
        System.out.print("Diamonds");
    }
    else if (card >= 14 && card <= 26){
        System.out.print("Clubs");
    }
    else if (card >= 27 && card <= 39){
        System.out.print("Hearts");
    }
        else if (card >= 40 && card <= 52){
        System.out.print("Spades");
    }
    switch( card % 13 ){
    case 1:
     // 1, 14, 27, 40
    System.out.print("Ace");
    break;
    case 2:
    // 11, 24, 37, 50)
    System.out.print("Jack");
    break;
    case 3:
    // 12, 25, 38, 51)
    System.out.print("Queen");
    break;
    case 4:
    // 13, 26, 39, 52)
    System.out.print("King");
        }
        System.out.println("You picked the " + card + "of Diamonds");
        System.out.println("You picked the " + card + "of Clubs");
        System.out.println("You picked the " + card + "of Hearts");
        System.out.println("You picked the " + card + "of Spades");
    }
}