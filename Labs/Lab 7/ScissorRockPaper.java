/**
 * Name: Beatriz Ristau
 * Course: CS 121
 * Professor: Dr. Rai
 * Institution: WVU Tech
 * 
 * Description
 * -> program prompts the user to enter a number 0,1, or 2, and displays
 * whether the user or computer wins, loses or draws.
*/

import java.util.*;

public class ScissorRockPaper {
  static Scanner sc = new Scanner (System.in);
  public static void main (String [] args) {
    // get user input
    System.out.print("Enter your choice: scissor (0), rock (1), paper (2): ");
    int yourChoice = sc.nextInt();
    
    // generate computer's choice
    int computerChoice = (int) (Math.random() * 3);

    // check whether user or computer won, lost or tied the game
    if (yourChoice == 0 && computerChoice == 2)
      System.out.print("Computer is paper. You are scissor. You lost");
    else if (yourChoice == 0 && computerChoice == 1)
      System.out.print("Computer is rock. You are scissor. You lost");
    else if (yourChoice == 1 && computerChoice == 2)
      System.out.print("Computer is paper. You are rock. You lost");
    else if (yourChoice == 1 && computerChoice == 0)
      System.out.print("Computer is Scissor. You are rock. You won");
    else if (yourChoice == 2 && computerChoice == 1)
      System.out.print("Computer is rock. You are paper. You won");
    else if (yourChoice == 0 && computerChoice == 2)
      System.out.print("Computer is paper. You are scissor. You won");
    else if (yourChoice == 0 && computerChoice == 0)
      System.out.print("Computer is scissor. You are scissor too. It is a draw");
    else if (yourChoice == 1 && computerChoice == 1)
      System.out.print("Computer is rock. You are rock too. It is a draw");
    else if (yourChoice == 2 && computerChoice == 2)
      System.out.print("Computer is paper. You are paper too. It is a draw");
    else
      System.out.println("invalid choice.");   
  }
}