/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> Write a program that shows the total miles that the
 * automobile can be driven without refueling and display results.
*/

import java.util.Scanner;

public class Mileage {
  public static void main (String [] args) {

    Scanner input = new Scanner (System.in); // create Scanner
    
    // ask user to enter the gallon capacity
    System.out.print("Enter the capacity in gallons: ");
    double capGal = input.nextDouble();

    // ask user to enter the miles per gallon 
    System.out.print("Enter the miles per gallon of the vehicle: ");
    double miGal = input.nextDouble();

    // calculate the total miles the vehicle can be driven without needing to refuel
    double total_miles = capGal * miGal;

    // display result
    System.out.println ("The total miles the vehicle can drive without refueling is " + total_miles);
    
    input.close(); // closing Scanner
  }
}