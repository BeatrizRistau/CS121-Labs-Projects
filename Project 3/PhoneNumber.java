/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program that prompts the user to enter a phone number expressed 
 * in letters and outputs the corresponding phone number in digits.
 * 
 * Input: Y or N to run each time. 8 letter alphabets (String) to convert
 * to numbers. Input can be upper or lower case letter.
 * Output: print the phone number in digits.
*/

import java.util.*;

public class PhoneNumber {
  static Scanner sc = new Scanner (System.in);
  public static void main (String [] args) {
    // declare variable
    String phoneInLetters, phone; 
    int i, j, len;
    char letters, answer; 
    
    System.out.print("Do you want to enter a number (Y/N): ");
    answer = sc.nextLine().charAt(0); // read & store the user's answer
    
    // if user enters yes
    while (answer == 'Y' || answer == 'y') {
      System.out.print("Enter a number expressed in letters: ");
      phoneInLetters = sc.nextLine(); // read & store number in letters
      phone = "Phone number is ";
      i = 0;
      j = 0;
      len = 0;
      len = phoneInLetters.length(); // to know how many letters the user entered
        
      while(i < len && j < 8) {
        letters = phoneInLetters.charAt(i); // convert string to char
          
        // case 1: when string does not present 7 letters a message will appear
        if (len != 7) {
          phone = ("Invalid length.");
          i = len; // since this is a false statatement this will break the while loop
          // and jump to the question "Do you want to enter a number?"
        }
          
        // case 2: when input contains 7 letters then it will be converted into a phone number
        else {
          switch (letters) {
            case 'A':
            case 'a':
            case 'B':
            case 'b':
            case 'C':
            case 'c':
              phone += ("2");
              j++;
              break;
            case 'D':
            case 'd':
            case 'E':
            case 'e':
            case 'F':
            case 'f':
              phone += ("3");
              j++;
              break;
            case 'G':
            case 'g':
            case 'H':
            case 'h':
            case 'I':
            case 'i':
              phone += ("4");
              j++;
              break;
            case 'J':
            case 'j':
            case 'K':
            case 'k':
            case 'L':
            case 'l':
              phone += ("5");
              j++;
              break;
            case 'M':
            case 'm':
            case 'N':
            case 'n':
            case 'O':
            case 'o':
              phone += ("6");
              j++;
              break;
            case 'P':
            case 'p':
            case 'R':
            case 'r':
            case 'S':
            case 's':
              phone += ("7");
              j++;
              break;
            case 'T':
            case 't':
            case 'U':
            case 'u':
            case 'V':
            case 'v':
              phone += ("8");
              j++;
              break;
            case 'W':
            case 'w':
            case 'X':
            case 'x':
            case 'Y':
            case 'y':
            case 'Z':
            case 'z':
              phone += ("9");
              j++;
              break;
            default:
              phone = ("An invalid character detected.\n" + phone + letters);
              j++;
              break;
          }
          // when we reach the third number we add a dash
          if (j==3) {
            phone += ("-");
            j++;
          } 
        }
        i++; 
      }
      // display output
      System.out.println(phone); // print the phone number
      System.out.println("Do you want to enter a number (Y/N): "); // if user enter 'n' then the program terminate
      answer = sc.nextLine().charAt(0); // read & store the user's answer
    }
  }
}