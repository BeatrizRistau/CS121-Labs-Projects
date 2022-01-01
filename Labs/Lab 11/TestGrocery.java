/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
*/

public class TestGrocery {
  public static void main (String [] args) {
    // create an object named tomato using constructor with arguments and set name to Tomato and price to 2.0
    Grocery tomato = new Grocery("Tomato",2.0);
    
    // create an object named potato_1 using no-arg constructor
    Grocery potato_1 = new Grocery();
    
    // and set name of potato_1 to Red Potato 
    potato_1.setName("Red Potato");
    
    // set price of potato_1 to 4.0
    potato_1.setPrice(4);
    
    // Day1
    System.out.println("Day1");
    // print the total number of grocery using static method getCount
    System.out.println("Total number of grocery: " + Grocery.getCount());
    
    // print tomato information
    System.out.println(tomato);
    
    // print potato_1 information
    System.out.println(potato_1);
    
    // Day2
    System.out.println("Day2");
    
    // create a new object name potato_2 and set name to Idaho Potato and price to 3.0
    Grocery potato_2 = new Grocery("Idaho Potato", 3.0);
    
    // print the total number of grocery using static method getCount
    System.out.println("Total number of grocery: " + Grocery.getCount());
    
    // increase the price of tomato by 10 percent
    tomato.increasePrice(10);
    
    // decrease the price of potato_1 by 15 percent
    potato_1.decreasePrice(15);
    
    // print the information of tomato, potato_1 and potato_2
    System.out.println(tomato);
    System.out.println(potato_1);
    System.out.println(potato_2); 
  }
}