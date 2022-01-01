/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
*/

public class SalaryEquation {
  public static void main (String [] args) {
    // declare variables
    double rate, hoursWorked, wages;
    String name;

    // store and assign variables
    rate = 12.5;
    hoursWorked = 45.5;
    name = "Jenkins";

    // calculate wage
    wages = rate * hoursWorked;

    // display results
    System.out.println ("Name: " + name
                      + "\nPay Rate: $" + rate
                      + "\nHours Worked: " + hoursWorked
                      + "\nSalary: $" + wages);
  }
}