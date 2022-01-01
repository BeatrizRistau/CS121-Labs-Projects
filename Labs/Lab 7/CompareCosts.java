/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that compare an item's cost from 3 different stores, and
 * displays which store has the highest price.
*/

import java.util.Scanner;

public class CompareCosts {
  static Scanner sc = new Scanner (System.in);
  public static void main (String [] args) {
    // user input
    System.out.println("Enter weight (lb) and price ($) for shop 1: ");
    double weight1 = sc.nextDouble();
    double price1 = sc.nextDouble();
    System.out.println("Enter weight (lb) and price ($) for shop 2: ");
    double weight2 = sc.nextDouble();
    double price2 = sc.nextDouble();
    System.out.println("Enter weight (lb) and price ($) for shop1: ");
    double weight3 = sc.nextDouble();
    double price3 = sc.nextDouble();
    
    // get total price of item from each store
    double t1 = weight1 * price1; 
    double t2 = weight2 * price2; 
    double t3 = weight3 * price3; 
    
    // check which store has the highest price and display result
    if (t1 > t2 && t1 > t3)
      System.out.println("Shop1 has highest price.");
    else if (t1 < t2 && t1 < t3)
      System.out.println("Shop2 and Shop3 both have highest price");
    else if (t1 == t2 && t2 == t3)
      System.out.println("All shops have the same price");   
  }
}
  