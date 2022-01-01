/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that randomly generates an integer between 1 and 12 
 * and displays the English month names. 
*/

import java.util.Scanner;

public class RandomMonths {
  public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in); // create Scanner
    
    // declare and initialize variables
    int max = 12;
    int min = 1;
    int range = (max - min) + 1; 
    int randMonths = (int)(Math.random() * range) + min; 
    
    System.out.println(randMonths); // display random number
    
    // check which month the random number belongs to and display month
    if (randMonths == 1) 
      System.out.println ("The month is January.");
    else if (randMonths == 2) 
      System.out.println ("The month is February.");
    else if (randMonths == 3) 
      System.out.println ("The month is March.");
    else if (randMonths == 4) 
      System.out.println ("The month is April.");
    else if (randMonths == 5) 
      System.out.println ("The month is May."); 
    else if (randMonths == 6) 
      System.out.println ("The month is June.");
    else if (randMonths == 7) 
      System.out.println ("The month is July.");
    else if (randMonths == 8) 
      System.out.println ("The month is August.");
    else if (randMonths == 9) 
      System.out.println ("The month is September.");
    else if (randMonths == 10) 
      System.out.println ("The month is October.");
    else if (randMonths == 11) 
      System.out.println ("The month is November.");
    else 
      System.out.println ("The month is December.");
    
    input.close(); // closing Scanner  
  }
}