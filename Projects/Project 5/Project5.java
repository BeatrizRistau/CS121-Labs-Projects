/*
 * Name: Beatriz Ristau 
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> This program test our understanding on arrays.
 */

import java.util.*;

public class Project5 {
  public static void main (String [] args) {
    // create a 1D array variable and invoke read1DArray method
    int[] A = read1Array(); 
    System.out.println("The given array is: ");
    System.out.println(Arrays.toString(A));
    System.out.println("The number of elements greater than the average" 
                         + " in the given array is " + analyzeNumbers(A) + ".");
    System.out.println("The array with distinct elements is");
    System.out.println(Arrays.toString(selectDistinct(A)));
    System.out.println("Converting the original array to  2D with 3 columns");
    print2DArray(convertDimension(A));
  }
  
  // method to read 1D arrays in form of strings
  public static int [] read1Array() {
    Scanner sc = new Scanner (System.in); // create Scanner
    String input = sc.nextLine(); // read & store user input
    String []temp = input.split(","); // method to split the string based on ',' and save it as arrays
    // check if the number of elements is actually a multiple of 3, if not exit the program
    if((temp.length % 3) != 0) {
      System.out.println("Number of inputs must be a multiple of 3.");
      System.exit(0);
    }
    int [] intArray = new int[temp.length];
    // convert string to arr
    for (int i = 0; i < temp.length;i++) 
      intArray[i] = Integer.parseInt(temp[i]);
    sc.close(); // closing Scanner
    return intArray; // return this array
  } 

  // method to calculate average 
  public static int analyzeNumbers(int [] array) {
    // declare variables
    int sum = 0;
    int average;
    int count = 0; // to count how many numbers are above average

    // Sum all the numbers in the array
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    // calculate the average
    average = sum / array.length;
    
    // to find how many numbers are above average
    for (int i = 0; i < array.length; i++) {
      if (array[i] > average)
        count++;
    }
    return count; // return the total numbers above average
  }
  
  // method to will return an array that removes all duplicated numbers
  public static int [] selectDistinct(int[] array) {
    int num = 0;
    int[] temp = new int[array.length]; // creates a temporary array
    // checks if there's duplicate numbers in the array
    // i is the originial array
    // j is the temp array
    for (int i = 0; i < array.length; i++) {
      boolean check = true;
      for(int j = 0; j < array.length; j++) {
        if(temp[j] == array[i])
          check = false;
      }
      if(check == true) {
        temp[num] = array[i];
        num++;
      }
    }
    int[] newArray = new int[num];
    // to remove the duplicate numbers and output the unique numbers
    for (int i = 0; i < newArray.length; i++)
      newArray[i] = temp[i];
    return newArray;
  }
  
  // method to convert 1D array to 2D array
  public static int [][] convertDimension(int[] array) {
    int num = 0;
    // determine how many rows it will output
    int rows = array.length / 3;
    int[][] array2D = new int[rows][3]; // create a 2D array
    // creates the rows and columns
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < 3; j++) {
        array2D[i][j] = array[num];
        num++;
      }
    }
    return array2D; // return 2D array
  }
  
  // method witll output the 2D array
  public static void print2DArray(int[][] array) {
    // i prints the rows
    for(int i = 0; i < array.length; i++) {
      // j prints the columns
      for(int j = 0; j < array[0].length; j++) {
        System.out.print(array[i][j] + "\t"); 
      }
      System.out.println();
    }  
  }              
} // class