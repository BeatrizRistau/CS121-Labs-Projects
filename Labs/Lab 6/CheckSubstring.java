/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> Program that prompts the user to enter two strings, and
 * report whether one of the string is the substring of the other or not.
*/

import java.util.*;

public class CheckSubstring {
  static Scanner sc = new Scanner (System.in);
  public static void main (String [] args) {
    System.out.print ("Enter string s1: "); // input first string
    String st1 = sc.nextLine(); // read and store the first string
    System.out.print ("Enter string s2: "); // input second string
    String st2 = sc.nextLine(); // read and store th second string
    
    String st3 = st1.toUpperCase(); // all letters upper case in first string 
    String st4 = st2.toUpperCase(); // all letters upper case in second string
    
    if (st3.contains(st4)) // if "String 1" contains substring "String 2"
      System.out.printf("%s is a substring of %s\n", st2,st1); // print if it's true
    else
      System.out.println("There is no substring of each other."); // print if it's false
  } 
}
