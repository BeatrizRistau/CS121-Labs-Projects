/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that prompts the user to enter the population and grow rate of
 * each town. The program ouputs after how many years the population of town A 
 * will be greater than or equal to the population of town B and the populations 
 * of both the towns at the same time.
*/

import java.util.*;

public class Population {
  static Scanner sc = new Scanner (System.in);
  public static void main (String [] args) {
    // get population and grow rate of each town
    System.out.print("Enter the current population of town A: ");
    int populationTownA = sc.nextInt(); 
    System.out.print("Enter the current population of town B: ");
    int populationTownB = sc.nextInt();
    System.out.print("Enter the growth rate of town A: ");
    int growthRateTownA = sc.nextInt();  
    System.out.print("Enter the growth rate of town B : ");
    int growthRateTownB = sc.nextInt();
    
    int year = 0;
    
    // calculate how many years pop. A will be greater or equal than pop. B
    while (populationTownA < populationTownB) {  
      populationTownA  = (int)(populationTownA * (100.0 + growthRateTownA)/ 100);
      populationTownB  = (int)(populationTownB * (100.0 + growthRateTownB)/ 100); 
      year++;  // increment year until while is false
    }
   
    // display results
    System.out.println("after " + year + " year(s) the population of town A will be greater or equal to" 
                        + " the population of town B.");
    System.out.println("after " + year + " population of town A is " + populationTownA);
    System.out.println("after " + year + " population of town B is " + populationTownB); 
  }
}