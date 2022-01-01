/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
*/

public class NestedLoops {
  public static void main (String [] args) {
    
   for(int i = 5; i >= 1; i--) { // decrement the numbers in the rows
    for(int j = 1; j <= i; j++) { // makes the rows
        System.out.print(j);
      }
    System.out.println(); // print new line for the next row
    }
  }
}