/**
 * Name: Beatriz Ritau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> The program helps a user to compute the final bill in a restaurant.
 * -> The program reads the subtotal and the tip rate from the user, then
 * computes the tip amount and the total.
 *
 * Input: user will input total amount and tip rate.
 * Output: print the total tip amount and total bill amount.
 */
import java.util.Scanner;

public class BillCalculator {
  public static void main(String[] args) {
    
  Scanner input = new Scanner(System.in);
    
  double subtotal, tipsRate, tipAmount, total;
  
  System.out.print("Enter subtotal: ");
  subtotal = input.nextDouble();
  
  System.out.print("Enter tips rate: ");
  tipsRate = input.nextDouble();
  
  input.close(); // closing scanner 

  tipAmount = subtotal * (tipsRate/100.0);
  total = subtotal + tipAmount;
  
  System.out.println ("The gratuity is $" + tipAmount + " & total is $" + total);
  }
}