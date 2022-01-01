/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program ask user to enter an integer and convert the number into binary.
*/

import java.util.*;

public class Binary {
  static Scanner sc = new Scanner (System.in);
  public static void main (String [] args) {
    // declare variables
    int num, remainder;
    
    // keep executing until user enters a number greater than zero
    do {
    System.out.print("Enter a number: ");
    num = sc.nextInt();
    }while(num < 0);
    
    // convert number entered into binary and display results
    do {
    remainder = num % 2;
    num = num / 2;
    System.out.println(remainder);
    }while (num != 0);
  }
}