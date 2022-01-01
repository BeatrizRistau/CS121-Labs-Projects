/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that prompt user to enter a month in numbers (1 through 12, 1 for January 12 for December),
 * then enter the year. The program then prints out the year, month number and number of days at that month.
*/


import java.util.Scanner;

public class DayInMonths {
  static Scanner sc = new Scanner (System.in);
  public static void main (String [] args) {
    // delcare & initialize variable
    int days = 0;
    
    // get user input
    System.out.print("Please enter the Month in numbers: ");
    int month = sc.nextInt();
    System.out.print("Please enter the Year: ");
    int year = sc.nextInt();
    
    // get the number of days for the month entered by the user
    switch (month) {
      case 1:
      case 3:
      case 5: 
      case 7: 
      case 8:
      case 10:
      case 12:
        days = 31; 
        break;
      case 2:
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) 
          days = 29;
        else 
          days = 28;
        break;    
      case 4:
      case 6: 
      case 9: 
      case 11:  
        days = 30;
        break;
      default:
        System.out.println("Invalid Month.");
    }
    // display results
    System.out.println("Number of Days in year " + year + " and" + " month " + month + " is " + days);
  }
}