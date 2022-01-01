/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that asks the user to enter three integers and 
 * display the integers in non-decreasing order.
*/

import java.util.Scanner;

public class SortNumbers {
  public static void main (String [] args) {

    Scanner input = new Scanner (System.in); // create Scanner
    
    int num1, num2, num3, temp; // declare variables
    
    // get user input
    System.out.print("Enter first integer: ");
    num1 = input.nextInt();
    System.out.print("Enter second integer: ");
    num2 = input.nextInt();
    System.out.print("Enter third integer: ");
    num3 = input.nextInt();
    
    // sort numbers in ascending order
    if (num1 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num2 > num3) {
      temp = num2;
      num2 = num3;
      num3 = temp;
    }
    if (num1 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }
    
    // display result
    System.out.println ("The sorted numbers are " + num1 + " " + num2 + " " + num3);
    
    input.close(); // closing Scanner
  }
}