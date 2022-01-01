/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
*/

public class Grocery {
  
  public String name; // A public string variable to store name
  private double price; // A private double variable to store price per pound
  static int count = 0; // A static integer variable to count the number of grocery created
  
  //define no-arg constructor
  Grocery() {
    name = " ";
    price = 0;
    count++;
  } 
  
  // define constructor with arguments
  Grocery(String nm, double p) {
    name = nm;
    price = p;
    count++;
  }
  
  // set price
  public void setPrice(double p){
    price = p;
  }
  
  // set name
  public void setName(String nm){
    name = nm;
  }
  
  // increase price
  public void increasePrice(double pct){
    price = price + price * (pct / 100);
  }
  
  // decrease price
  public void decreasePrice(double pct){
     price = price - price * (pct / 100);
  }
  
  // This is a static method.
  // It will return the static integer variable for count of the groceries. 
  public static int getCount() {
    return count;
  }
  
  // override toString method
  // We will set it to return a string such as: � Cost of tomato is $1.20 per pound�,
  // where tomato is the name of the variable and 1.20 is the price.
  public String toString() {
    String str = "Cost of " + name + " is: $" + price + " per pound";
    return str;
  }
}