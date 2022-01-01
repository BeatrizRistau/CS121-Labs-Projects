/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> Program that creates a nicely formatted receipt. User will input the amount
 * of each item, and then program will calculate and print cost per item
 * subtotal, tax(%7), and total.
*/

import java.util.*;

public class Receipt {
  static Scanner sc = new Scanner (System.in);
  public static void main (String [] args) {
    // declare and initialize variables
    double orange = 1.59; // price of an orange per lb
    double apple = 1.99; // price of an apple per lb
    double onion = 0.50; // price of an onion per lb
    
    // get user input
    System.out.print ("Enter the amount of oranges: "); 
    double amountOranges = sc.nextDouble();
    System.out.print ("Enter the amount of apples: ");
    double amountApples = sc.nextDouble();
    System.out.print ("Enter the amount of onions: ");
    double amountOnions = sc.nextDouble();
    
    // calculate the total price of each item
    double totalOranges = orange * amountOranges;
    double totalApples = apple * amountApples;
    double totalOnions = onion * amountOnions; 
    
    // calculate subtotal, tax, total
    double subtotal = totalOranges + totalApples + totalOnions; 
    double tax = subtotal * 0.07; 
    double total = subtotal + tax; // total is equivalent to the sum of the 3 itens plus the tax
    
    // display results
    System.out.println("\nItem      Price/lb     Weight        Price");
    System.out.printf("Orange  : $%3.2f/lb   %8.2f lb   $%,9.2f\n", orange, amountOranges, totalOranges);
    System.out.printf("Apple   : $%3.2f/lb   %8.2f lb   $%,9.2f\n", apple, amountApples, totalApples);
    System.out.printf("Onions  : $%3.2f/lb   %8.2f lb   $%,9.2f\n\n", onion, amountOnions, totalOnions);
    System.out.printf ("Subtotal:\t\t\t    $%,9.2f  \n", subtotal);
    System.out.printf ("Tax     :\t\t\t    $%,9.2f \n", tax);
    System.out.printf ("Total   :\t\t\t    $%,9.2f \n",total);
  }
} 