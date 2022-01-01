/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
*/

import java.util.*;

public class Method {
  static Scanner sc = new Scanner (System.in);
  public static void main(String[] args) {
    // get input
    int num = sc.nextInt();
    double dec = sc.nextDouble();
    
    System.out.println("The result is: " + two(num,dec));
  }
  
  public static int one(int x , int y) {
    
    if (x > y) 
      return x + y;
    else
      return x-(2*y);   
  }

  public static double two(int x, double a) {
    double z = sc.nextDouble();

    z += a;
    int first = (one(6,8));
    first += x;

    if (z > 2*first)
      return z;
    else
      return 2*first-z;
  }
} 
