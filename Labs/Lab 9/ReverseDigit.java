/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that takes an integer as input and display its digits reversed.
*/

import java.util.Scanner;

public class ReverseDigit {
  static Scanner sc = new Scanner (System.in);
  public static void main(String[] args) {
    // user input
    System.out.print("Enter a digit: ");
    int digit = sc.nextInt();
    
    // display final result
    System.out.println("The reverse of " + digit + " is " + reverseDigit(digit)); // output
  }
  
  // method to reverse the number entered by the user
  public static int reverseDigit (int value) {
    int revNum;
    
    revNum = value % 10; // get the last digit of the number
    revNum = revNum * 10 + (value/10) % 10; // get the second digit of the number
    revNum = revNum * 10 + ((value/10)/10) % 10; // get the first digit of the number
    
    return revNum; //return integer value reversed
  } 
}
