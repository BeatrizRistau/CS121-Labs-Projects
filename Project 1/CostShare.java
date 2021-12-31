/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> You and your friends are sharing a car to commute to the university. Assume that
 * the total amount of cost per month is $250.00 and it is constant. To fairly share
 * the cost, you decided to split the montly cost proportional to the total distance
 * from university to each student's house.
 * -> The program will ask each student the distance in miles from university to their
 * house and output how much each person owes.
 * 
 * Input: user will input each student's distance from house.
 * Output: create a bill for all three students.
 */
import java.util.Scanner;

public class CostShare {
  public static void main (String [] args) {
    
    Scanner input = new Scanner (System.in);
    
    double TOTAL_COST = 250;
    
    System.out.println("Hello!");
    
    System.out.println ("Enter how far is Adam's house from University?");
    int distanceA = input.nextInt();
    
    System.out.println ("Enter how far is John's house from University?");
    int distanceJ = input.nextInt();
    
    System.out.println ("Enter how far is Michael's house from University?");
    int distanceM = input.nextInt();

    input.close(); // closing Scanner
    
    int totalDistance = (distanceA + distanceJ + distanceM);
    double amountA = (distanceA * TOTAL_COST) / totalDistance;
    double amountJ = (distanceJ * TOTAL_COST) / totalDistance;
    double amountM = (distanceM * TOTAL_COST) / totalDistance;
    
    System.out.println ("\nTotal cost is        : $" + TOTAL_COST);
    System.out.println ("-------------------------------------");
    System.out.println ("Adam       owes      : $" + (int)(amountA * 100) / 100.0);
    System.out.println ("John       owes      : $" + (int)(amountJ * 100) / 100.0);
    System.out.println ("Michael    owes      : $" + (int)(amountM * 100) / 100.0);
    System.out.println ("-------------------------------------");
    
  }
}
