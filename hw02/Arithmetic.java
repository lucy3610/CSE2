//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lucy Swett
//2-9-16
//Arithmetic Program
//

//  define a class
public class Arithmetic{
    
//  add main method    
public static void main(String[] args) {
// Input variables
//Number of pairs of pants
int numPants = 3;
//Cost per pair of pants
double pantPrice = 34.98;

//Number of sweatshirts
int numShirts = 2;
//Cost per shirt
double shirtPrice = 24.99;

//Number of belts
int numBelts = 1;
//cost per box of envelopes
double beltPrice = 33.99;

//the tax rate
double paSalesTax = 0.06;

//intermediate variables
double pantsTotal, shirtsTotal, beltsTotal, subtotal, salesTax;

//run the calculations
pantsTotal=numPants*pantPrice;
shirtsTotal=numShirts*shirtPrice;
beltsTotal=numBelts*beltPrice;
subtotal=(pantsTotal)+(shirtsTotal)+(beltsTotal);
salesTax=(pantsTotal*paSalesTax)+(shirtsTotal*paSalesTax)+(beltsTotal*paSalesTax);

//print the calculations
//System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("The total cost of pants was $"+(double) ((int) (pantsTotal*100))/100);
System.out.println("The total cost of shirts was $"+(double) ((int) (shirtsTotal*100))/100);
System.out.println("The total cost of belts was $"+(double) ((int) (beltsTotal*100))/100);
System.out.println("The sales tax for pants was $"+(double) ((int) (pantsTotal*paSalesTax*100))/100);
System.out.println("The sales tax for shirts was $"+(double) ((int) (shirtsTotal*paSalesTax*100))/100);
System.out.println("The sales tax for belts was $"+(double) ((int) (beltsTotal*paSalesTax*100))/100);
System.out.println("Subtotal= $"+(double) ((int) (subtotal*100))/100);
System.out.println("Sales Tax= $"+(double) ((int) (salesTax*100))/100);
System.out.println("Total= $"+(double) ((int) ((subtotal+salesTax)*100))/100);
}
}