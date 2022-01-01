/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> Program that asks for user to input an integer between 0 and
 * 1000 and displays the sum of all the digits.
*/

import java.util.Scanner;

public class DigitSum {
  public static void main (String [] args) {
    
    Scanner input = new Scanner (System.in); // create Scanner

    // ask user to input a number between 0 and 1000
    System.out.print ("Enter an integer between 0 and 1000: ");
    int number = input.nextInt(); // store user's input

    // do the calculations
    int first_digit = number % 10;
    int remaining_digit = number / 10;
    int second_digit = remaining_digit % 10;
    remaining_digit = remaining_digit / 10;
    int third_digit = remaining_digit % 10;
  
    // sum of all digits
    int sum = first_digit + second_digit + third_digit;
    
    // display results
    System.out.print ("The sum of all digits is: "); 
    System.out.println (third_digit + " + " + second_digit + " + " + first_digit + " = " + sum);
    
    input.close(); // closing Scanner
  }
}
