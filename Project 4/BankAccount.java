/*
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> The program acts as a bank account ATM machine that displays a menu
 * with options for the user to select.
*/

import java.util.*;

public class BankAccount {
  static Scanner sc = new Scanner (System.in); 
  static double balance = 0; 
  static String password = "default";
  public static void main (String [] args) {
    // display welcome message
    System.out.println("Welcome to the Bank of CS121!\n");
    menu(); // invoke method menu
  }
  
  // function to display menu for user to select an option
  public static void menu() {
    // display menu
    System.out.println("Enter one of the options (1-5)\n"
                        + "1. Show Balance\n"
                        + "2. Deposit\n"
                        + "3. Withdraw\n"
                        + "4. Update Password\n"
                        + "5. Exit");
    System.out.println("------------------------------");
    System.out.print(":> ");
    
    userInput(); // invoke method userInput
  }
  
  // function to read & store user input and invoke appropriate method
  public static void userInput() { 
    int input = sc.nextInt(); // read & store user input
    
    switch(input) {
      case 1:
        showBalance(); // method that displays the current balance to the user
        break;
      case 2: 
        deposit(); // method that deposits money into the user's account
        break;
      case 3:
        withdraw(); // method that withdraw money from the user's account
        break;
      case 4:
        updatePassword(); // method that allows the user to change the password of the account
        break;
      case 5:
        // display message and end program
        System.out.println("Goodbye! Please come again!");
        break;
      default: 
        // if the user doesn't input the right number it will appear a error message 
        // and it will ask the user to entry another number
        System.out.println("Wrong entry.");
        menu();
        input = sc.nextInt();
        break;
    }
  }
  
  // method that displays the current balance
  public static void showBalance() {
    System.out.printf("Your current balance is: $%-,10.2f\n\n", balance);
    menu(); // call menu
  }
  
  // method that allows the user to deposit money into their account
  public static void deposit() {
    // enter amount the user wants to deposit
    System.out.print("\nEnter amount (>0) you want to deposit: $"); 
    double depositAmount = sc.nextInt();
    
    // it will keep asking the user until the user inputs a positive value
    while (depositAmount < 0) {
      System.out.println("Please enter a positive amount to deposit.\n");
      System.out.print("Enter amount (>0) you want to deposit: $");
      depositAmount = sc.nextDouble();
    }
    // keep updating the user's account balance everytime money is deposited into the account
    balance = balance + depositAmount; 
    showBalance(); // display current balance
  }
  
  // method to withdraw money from account
  public static void withdraw() {
    double withdrawAmount; // declare variable
    do {
      // it will keep asking to input an amaount until the user inputs a value greater than 0
      System.out.print("Enter amount (>0) you want to withdraw: $");
      withdrawAmount = sc.nextDouble();
    } while (withdrawAmount < 0);
    
    while(withdrawAmount>balance) {
      // if the user inputs a value to withdraw that is greater than what the user have
      // it will keep asking the user to input a value until is less than the balance of the user's account
      System.out.print("The remaining amount is less than 0. please enter diferent amount: $");
      withdrawAmount = sc.nextDouble();
    }
    // it will subtract from the balance everytime the user wants to take money from the account 
    balance = balance - withdrawAmount; 
    showBalance(); // display current balance
  }
  
  // method that allow user to change password
  public static void updatePassword() {
    /* Password must:
     * Have at least 8 characters
     * Contain only letters and digits
     * contain at least 2 digits
   */
    String newPassword;
    System.out.print("\nEnter Your Current Password: "); // input current password
    String currentPassword = sc.next();
    
    if(currentPassword.equals(password)) { 
      // if the user inputs the correct password it will keeping asking the user to enter a new password
      // until the new one matches all the requirements for a new password
      boolean valid1 = true;
      boolean valid2 = true;
      do {
        System.out.print("Enter new password: ");
        newPassword = sc.next(); // read & store new password
        // will check if new password pass all the requirements
        if(newPassword.length() >= 8)
          valid1 = false;
        else
        {
          System.out.println("Password must be at least 8 characters long.\n");
          valid2 = true;
        }
        if(isDigit(newPassword) && isEspecialCharacter(newPassword))
          valid2 = false;
        else
        {
          System.out.println("Password must contain at least 2 digits and only contains digits and numbers.\n");
          valid2 = true;
        }
      }while(valid1 || valid2);
      password = newPassword; // update password
      System.out.println("\nPassword changed to: " + password + "\n"); // output the new password
      menu();
    }
    else { // show error message if password is no valid 
      System.out.println("\nInvalid password. Try again later.\n");
      menu(); // call menu
    }
  }
  
  // method to check if new password entered contains digits
  public static boolean isDigit(String p) {
    // checks to see if user inputed at least 2 digits
    int count = 0;
    boolean result = false;
    // count how many digits there is
    for (int i = 0; i < p.length(); i++) {
      if (Character.isDigit(p.charAt(i))) 
        count++; 
    }
    // if it contains at least 2 digits then it is valid
    if (count > 2)
      result = true;
       
    return result; // return true or false
  }
  
  // method to check if new password contains special characters
  public static boolean isEspecialCharacter (String p) 
  {
    // it will check if user inputed especial characters
    boolean result = true;
    for (int i = 0; i < p.length(); i++) {
      if (Character.isLetterOrDigit(p.charAt(i)) == false) 
        return false;
    }
    return result;
  }
} // class