package com.linkedin.javacodechallenges;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
  //Challenge 3
  public void playGame() {
    int points = 10;
    boolean running = true;
    Scanner s = new Scanner(System.in);
    boolean doublePoints = false;

    System.out.println("---------- Welcome to the Double or Nothing game! ----------");

    //TODO: Let user decide whether to double their points or leave with what they have
    while(points > 0 && running) {
      
      Random r = new Random();
      System.out.println("You currently have " + points + " point(s)");
      System.out.print("Enter 1 to double the value or 0 to leave with " + points + " points: ");
      try {
        int input = s.nextInt(points);
        switch(input) {
          case 0:
            running = false;
            break;
          case 1:
            doublePoints = r.nextBoolean();
            if(doublePoints) {
              points *= 2;
            }
            else {
              points = 0;
            }
            break;
          default:
            System.out.println("Input invalid. You must enter 1 or 0");
            break;
        }
      }
      catch (IllegalArgumentException e) {
        System.out.println("Input invalid. You must enter 1 or 0");
      }
    }
    System.out.println("You are leaving with " + points + " points. Thanks for playing!");
    s.close();
  }
}