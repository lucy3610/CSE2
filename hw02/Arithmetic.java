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
pantsTotal=numPants*pantPrice; //the total cost of pants is the number of pants times the price of one pair of pants
shirtsTotal=numShirts*shirtPrice; //the total cost of shirts is the number of shirts times the price of one shirt
beltsTotal=numBelts*beltPrice; //the total cost of belts is the number of belts times the price of one belt
subtotal=(pantsTotal)+(shirtsTotal)+(beltsTotal); //the subtotal is the sum of the total of each item
salesTax=(pantsTotal*paSalesTax)+(shirtsTotal*paSalesTax)+(beltsTotal*paSalesTax); //the (total) sales tax is the sum of the total cost of each item times sales tax 

//print the calculations; don't forget to explicitly cast the calculations so that there are only two digits after the decimal point
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