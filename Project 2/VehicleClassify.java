/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> The program will take input from the user to classify a vehicle as one of the
 * following: bicycle, unicycle, motorcycle, car or a bus.
 * -> The program will take appropriate inputs for each question (Y/N or integer) and
 * classify the vehicle accordingly.
 */
import java.util.*;

public class VehicleClassify {
  public static void main (String [] args) {
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println ("Does the vehicle have an engine? ");
    char decision = sc.next().charAt(0);
    
    if (decision == 'n' || decision == 'N') {
      System.out.println ("How many wheels does the vehicle have? ");
      int wheels = sc.nextInt();
      if (wheels == 1)
        System.out.println ("This vehicle is a Unicycle");
        if (wheels == 2)
          System.out.println ("This vehicle is a Bicycle");
    }
    
    else if (decision == 'y' || decision == 'Y') {
      System.out.println ("How many wheels does the vehicle have? ");
      int wheels = sc.nextInt();
      if (wheels == 2)
        System.out.println ("This vehicle is a Motorcicle");
        if (wheels > 2) {
          System.out.println ("How many passengers can it fit? ");
          int passengers = sc.nextInt();
          if (passengers <= 5)
            System.out.println ("This vehicle is a Car");
            if (passengers > 5 && passengers <= 9)
              System.out.println ("This vehicle is a Van");
              if (passengers > 9)
                System.out.println ("This vehicle is a Bus");
        }
    }
    sc.close(); // closing scanner
  }
}