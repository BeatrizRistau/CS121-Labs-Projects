/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that prompt user to enter a month in numbers 
 * (1 through 12, 1 for January, 12 for December). The 
 * program then prints out the season. 
*/

import java.util.Scanner;

public class Seasons {
  static Scanner sc = new Scanner (System.in);
  public static void main (String [] args) {
    // get user input
    System.out.print("Please enter the Month in numbers: " );
    int month = sc.nextInt();
    
    // assign value to corresponding season
    switch (month) {
      case 1: 
      case 2: 
      case 12: System.out.println("Season is Winter"); break;
      case 3: 
      case 4: 
      case 5: System.out.println("Season is Spring"); break;
      case 6: 
      case 7: 
      case 8: System.out.println("Season is Summer"); break;
      case 9: 
      case 10: 
      case 11: System.out.println("Season is Fall"); break;
      default: System.out.println("Invalid Month");
    }
  }
}
  