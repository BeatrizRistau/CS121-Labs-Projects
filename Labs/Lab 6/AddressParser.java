/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that ask the user to input a home address, and 
 * the program will split main street, city, state, and zipcode.
*/

import java.util.*;

public class AddressParser {
  static Scanner sc = new Scanner (System.in);
  public static void main (String [] args) {
    // get user input
    System.out.print("Enter address in the following form: ");
    System.out.println("123 Main Street, City, State, Zipcode ");
    String address = sc.nextLine(); // input and store the address
    
    int ind1 = address.indexOf(","); // take first index till the first comma
    String mainstreet = address.substring(0,ind1); 
    int ind2 = address.indexOf(",", ind1+1); // take second index - first comma till the second comma
    String city = address.substring(ind1+1,ind2);
    int ind3 = address.indexOf(",",ind2+1); // take third index - second comma till the third comma
    String state = address.substring(ind2+1,ind3);
    
    String zipcode = address.substring(ind3+1); // take everything after the third (last) comma
    
    // display results
    System.out.printf("Main Street: %s\n", mainstreet);
    System.out.printf("City: %s\n", city);
    System.out.printf("State: %s\n", state);
    System.out.printf("Zipcode: %s\n", zipcode);
  }
}
    