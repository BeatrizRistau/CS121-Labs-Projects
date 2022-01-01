/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> Class that computes the sum along colums of a 2D array, and
 * returns a 1D array of the column sums
*/

import java.util.*;

public class SumColumn {
  public static void main(String[] args) {
    // Define Scanner object to get inputs from the user
    java.util.Scanner sc = new Scanner (System.in);
       
    // Ask user for number of rows and assign to a variable
    System.out.print("Enter number of rows: ");
    int row = sc.nextInt();             
    
    // Ask user for number of columns and assign to a variable
    System.out.print("Enter number of columns: ");
    int col = sc.nextInt();
    
    // Ask user to enter the matrix contents
    System.out.println("Enter a "+ row +" by "+ col +" matrix row by row: ");
    
    // define a two dimensional matrix of given row and column size
    int matrix[][] = new int [row][col];
    
    // get the inputs using two for loops and store in the two dimensional array
    for (row = 0; row < matrix.length; row++) {
      for (col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = sc.nextInt(); 
      }
    }
    // create a new single dimensional array and assign the result of sumColumn method
    double[] result = sumColumn(matrix);
    
    // Print the single dimensional array of results using Arrays.toString method
    System.out.println(Arrays.toString(result));
  }
  
  /**
   * method to add the contents of a two dimensional matrix along column
   * and return the single dimensional sum array
  */
  public static double[] sumColumn(int dArray[][]) {
    // create a new single dimensional array and assign the result of sumColumn method
    double[] colSum = new double[dArray[0].length];
    
    // add the contents along the column and assign to the array
    // the first index of the single dimensional array contains the sum of contents in first column and so on
    for (int i = 0; i < dArray.length; i++) {   
      for (int j = 0; j < dArray[i].length; j++) {                
        colSum[j] += dArray[i][j];
      }  
    }
    // return the single dimensional array
    return colSum;
  }  
}