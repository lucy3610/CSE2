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
public class CardGenerator {
    // Create a random number generator for choosing a random number that coresponds to a card in a card deck

    //  add main method    
    public static void main(String[] args) {
        int card = (int)(Math.random() * 53) + 1;
        String suit = " ";
        if (card >= 1 && card <= 13) {
            suit = "Diamonds";
        }
        else if (card >= 14 && card <= 26) {
            suit = "Clubs";
            card -= 13;
        }
        else if (card >= 27 && card <= 39) {
            suit = "Hearts";
            card -= 26;
        }
        else if (card >= 40 && card <= 52) {
            suit = "Spades";
            card -= 39;
        }
        // if (card > 1 && card < 11 || card > 14 && card < 24 || card > 27 && card < 37 || card > 40 && card < 50) {
           //  System.out.println("You picked the " + card + " of " + suit);
        }
        else {
            switch (card % 13) {
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
                    break;
            }
            
        }
        System.out.println("You picked the " + card + " of " + suit);
    }
}