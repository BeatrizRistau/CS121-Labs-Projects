/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that prompts the user to enter if the user is either single or
 * married and also asks for the taxable income. The program then displays the
 * total amount of tax the user should pay.
*/

import java.util.*;

public class Taxes {
  static Scanner sc = new Scanner (System.in);
  public static void main (String [] args) {
    int status;
    double income, amount;
    // user input
    System.out.print("Enter the status Single (0) or Married (1): ");
    status = sc.nextInt();
    
    // if user is single, check how much tax the user should pay depending on the income
    if (status == 0) {
      System.out.print("Enter the income: ");
      income = sc.nextDouble();
      
      if (income > 0 && income < 8000) {
        amount = 0.1 * income;
        System.out.println("The amount owed in taxes is " + amount);
      }
      else if (income > 8000 && income < 32000) {
        amount = 800 + 0.15 * (income - 8000);
        System.out.println("The amount owed in taxes is " + amount);
      }
      else if (income > 32000) {
        amount = 4400 + 0.25 * (income - 32000);
        System.out.println("The amount owed in taxes is " + amount);
      }  
    }
    // if user is married, check how much tax the user should pay depending on the income
    else if (status == 1) {
      System.out.print("Enter the income: ");
      income = sc.nextDouble();
      
      if (income > 0 && income < 16000) {
        amount = 0.1 * income;
        System.out.println("The amount owed in taxes is " + amount);
      }
      else if (income > 16000 && income < 64000) {
        amount = 16000 + 0.15 * (income - 16000);
        System.out.println("The amount owed in taxes is " + amount);
      }
      else if (income > 64000) {
        amount = 8800 + 0.25 * (income - 64000);
        System.out.println("The amount owed in taxes is " + amount);
      }
    }
    // if user enters invalid number
    else {
      System.out.print("Enter the income: ");
      income = sc.nextDouble();
      System.out.println("Invalid status. Please input correct status");
      System.out.println("The amount owed in taxes is 0.0");
    }
  }
}     