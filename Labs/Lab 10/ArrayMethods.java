/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that creates various methods for a class using arrays.
*/

public class ArrayMethods {
  static java.util.Scanner sc = new java.util.Scanner (System.in);
  public static void main (String [] args) {
    // Enter and store the size of the Array
    System.out.print("Enter the size of the array: ");
    int arraySize = sc.nextInt();
    double[] arr = new double [arraySize]; // create a double array
    fillArray(arr); 
    printArray(arr);

    // Enter and store number to multiply the array
    System.out.print("Enter the integer to multiply with: ");
    int num = sc.nextInt();
    multiplyArray(arr,num); 

    // display results by calling methods
    System.out.println("Largest is " + largest(arr)); 
    System.out.println("Smallest is " + smallest(arr)); 
    System.out.println("Sum is " + sumArray(arr)); 
    System.out.println("Average is " + avgArray(arr));
  }
  
  // method to fill array with numbers
  public static void fillArray(double[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      // enter double array values
      System.out.print("Enter a double for entry " + (i+1) + ": ");
      numbers[i] = sc.nextDouble(); // Store elements in the array (double and negative numbers)
    }
  } 
  
  // method to print all elements in the array
  public static void printArray(double[] numbers) {
    for (int i = 0; i < numbers.length; i++) 
      // Print all the items in the array
      System.out.print(numbers[i] + " ");
    System.out.println();
  }

  // method that multiplies all the array elements by a number entered by the user
  public static double multiplyArray(double [] a, int value) {
    double mult = 0;
    for (int i = 0; i < a.length; i++) {
      mult = a[i] * value;
      System.out.print(mult + " "); // output
    }
    System.out.println();
    return mult;
  } 
  
  // method to find the largest number in array
  public static double largest(double [] numbers) {
    double max = numbers[0]; 
    // to find the largest number
    for (int i = 0; i < numbers.length; i++) {
      if (max < numbers[i])
        max = numbers[i];
    }
    return max; // return largest number
  }
  
  // method to find the smallest number in array
  public static double smallest(double [] numbers) {
    double min = numbers[0];
    // to find the smallest number
    for (int i = 0; i < numbers.length; i++) {
      if (min > numbers[i])
        min = numbers[i];
    }
    return min; // return the smallest number
  }
  
  // method to sum all elements in array
  public static double sumArray(double[] numbers) {
    double sum = 0;
    // Sum all the elements in the array
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum; // Return the sum
  }
  
  // method to calculate the average of all elements in the array
  public static double avgArray(double[] numbers) {
    double average = sumArray(numbers) / numbers.length; // average = sum / length of the array
    return average; // Return average
  }
}  