package edu.tekwill.mounth;
/*
 * @author vas-chif
 * Exercise #4.7: Using switch statements
 */

import java.util.Scanner;

public class Exercise4point7 {
    public static void main(String... args) {
        System.out.println("Please insert your vote: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if ((userInput == 9) || (userInput == 10)) {
            System.out.println("I’m proud of you!");
        }
        if ((userInput == 7) || (userInput == 8)) {
            System.out.println("Very good!");
        }
        if (userInput == 6) {
            System.out.println("Good!");
        }
        if (userInput == 5) {
            System.out.println("Approved.");
        }
        if ((userInput == 0) || (userInput == 1) || (userInput == 2) || (userInput == 3) || (userInput == 4)) {
            System.out.println("Fail");
        } else
            System.out.println("Unknown vote");

        System.out.println("Using metod switch");
        switch (userInput) {
            case 10:
            case 9:
                System.out.println("I’m proud of you!");
                break;
            case 8:
            case 7:
                System.out.println("Very good!");
                break;
            case 6:
                System.out.println("Good!");
                break;
            case 5:
                System.out.println("Approved.");
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
            default:
                System.out.println("Unknown vote");

        }


    }
}
