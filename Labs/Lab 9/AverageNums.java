/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
*/

public class AverageNums {
  public static void main(String[] args) {
    int avg1 = average(2, 8); // Average from the first average method
    System.out.println(avg1);
    double avg2 = average(5,13); // Average from the second average method
    System.out.println(avg2);
    double avg3 = average(4, 1, 7); // Average from the third average method
    System.out.println(avg3); 
  }

  public static int average (int a, int b) {
    return (a + b)/2; // return int value
  }
  
  public static double average (double x, double y) {
    return (x + y)/2; // return double value
  }
  
  public static double average (double num1, double num2, double num3) {
    return (num1+num2+num3)/3; // return double value
  }
}
