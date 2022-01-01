/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that prompts the user to enter 3 integer values 
 * and display the result based on the discriminant.
*/

import java.util.Scanner;

public class QuadEquation {
  public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in); // create Scanner
    
    // user input
    System.out.println ("Enter the coeficients of a quadratic equation (enter only integer values) a, b, c: ");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    
    // solving the quadratic equation
    double discriminant = Math.pow(-b,2) - 4 * a * c;
    
    // finding how many roots the result has
    if (discriminant < 0) {
      System.out.println ("The equation has no real roots");
    }
    else if (discriminant == 0) {
      double root1 = (-b + Math.pow(discriminant,0.5)) / (2 * a);
      System.out.println ("The equation has one root " + root1);
    } 
    else {
      double root1 = (-b + Math.pow(discriminant,0.5)) / (2 * a);
      double root2 = (-b - Math.pow(discriminant,0.5)) / (2 * a);
      System.out.println ("The equation has two roots " + root1 + " and " + root2);
    }
    
    input.close(); // closing Scanner
  }
}    