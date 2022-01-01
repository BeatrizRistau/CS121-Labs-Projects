/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that prompts the user to enter a string and then it displays
 * the number of vowels contained in the string entered.
*/

import java.util.*;

public class Vowel {
  static Scanner console = new Scanner(System.in);
  public static void main (String[] args) {
    // declare & initialize variables
    String inputLine;
    int count = 0;
    // get user input
    System.out.print("Enter a String: ");
    inputLine = console.nextLine();
    String st1 = inputLine.toLowerCase();
    
    // count the number of vowels presented in the string entered
    for (int i = 0; i < st1.length(); i++) {
      if (isVowel(st1.charAt(i))) {
        count++;
      }
    }
    System.out.println(); // new line
    System.out.println("There are " + count + " vowel in the input line");
  }
  
  // method that checks if char is a vowel
  public static boolean isVowel (char x) {
    boolean result;
    // if char is vowel then return true
    if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') 
      result = true;
    else // otherwise, return false
      result = false;
    return result; // return true or false
  }
}