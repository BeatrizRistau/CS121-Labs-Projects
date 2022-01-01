/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that prompts the user to enter five digits, and determines
 * whether it is a palindrome or not.
*/

import java.util.*;

public class Palindrome {
  static Scanner sc = new Scanner (System.in);
  public static void main (String [] args) {
    // user input
    System.out.print("Enter a five-digit integer: ");
    int number = sc.nextInt(); 
    
    // get digits
    int digit1 = number / 10000; 
    int digit2 = (number / 1000) % 10; 
    //int digit3 = (number / 100) % 10; 
    int digit4 = (number / 10) % 10; 
    int digit5 = number % 10; 
    
    // check if number is palindrome or not and display results
    if (digit1 == digit5 && digit2 == digit4)
      System.out.println(number + " is a palindrome ");
    else if (digit1 != digit5 && digit2 == digit4) {
      System.out.println(number + " is not a palindrome ");
      System.out.println("First and last digit do not match ");
    }
    else if (digit2 != digit4 && digit1 == digit5) {
      System.out.println(number + " is not a palindrome ");
      System.out.println("Second and second last digit do not match ");
    }  
    else {
      System.out.println(number + " is not a palindrome ");
      System.out.println("None of the digits match. "); 
    }
  }
}
  