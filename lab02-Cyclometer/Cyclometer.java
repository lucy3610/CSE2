// Lucy Swett
// 2-5-2016
// Cyclometer
public class Cyclometer {
        // main method required for every Java program
       public static void main(String[] args) {
           // input data.
        int secsTrip1=480;  //  number of seconds for first trip
        int secsTrip2=3220;  // number of seconds for second trip
        int countsTrip1=1561;  // numner of counts (rotations) for first trip
        int countsTrip2=9037; // number of counts (rotations) for second trip
// intermediate variables and output data
double wheelDiameter=27.0,  // wheel diameter of the bicycle to calculate the distance travelled
      PI=3.14159, // necessary to calculate the distance
      feetPerMile=5280,  // conversion factor between feet to miles
      inchesPerFoot=12,   // conversion factor between inches to feet
      secondsPerMinute=60;  // converstion factor between seconds and minutes
    double distanceTrip1, distanceTrip2,totalDistance; 
    System.out.println("Trip 1 took "+
                (secsTrip1/secondsPerMinute)+" minutes and had "+
                 countsTrip1+" counts.");
           System.out.println("Trip 2 took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+
                 countsTrip2+" counts.");// prints out the value of how long trip 1 and 2 took
//run the calculations; store the values
//
//
    distanceTrip1=countsTrip1*wheelDiameter*PI;
// Above gives distance in inches
//(for each count, a rotation of the wheel travels
//the diameter in inches times PI)
    distanceTrip1=inchesPerFoot*feetPerMile; // Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
//Print out the output data.
           System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    }  //end of main method   
} //end of class