/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
*/

public class MathExpressions  {
  public static void main (String [] args)  {
    // declare variables
    int num1, num2, sum, diff, prod, quot;

    // initialize variables
    num1 = 125;
    num2 = 25;

    // do the calculations
    sum = num1 + num2;
    diff = num1 - num2;
    prod = num1 * num2;
    quot = num1 / num2;

    // display results
    System.out.println ("The value of num1 is " + num1);
    System.out.println ("The value of num2 is " + num2);
    System.out.println ("The sum of " + num1 + " and " + num2 + " is " + sum);
    System.out.println ("The difference of " + num1 + " and " + num2 + " is " + diff);
    System.out.println ("The product of " + num1 + " and " + num2 + " is " + prod);
    System.out.println ("The quotient of " + num1 + " and " + num2 + " is " + quot);
  }
}
