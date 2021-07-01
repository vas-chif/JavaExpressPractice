package edu.tekwill.fors;

/*
 * @author vas-chif
 * @Exercise #4.9 Using the for loop
 * Create a program which reads from the keyboard a positive number and displays in the console all the
 * numbers that are smaller than the one you inserted, but bigger than 0 (zero) and divisible by 2.
 */
import java.util.Scanner;

public class Exercise4point9 {
    public static void main(String[] args) {
        System.out.println("Print a number");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        for (int item = 1; item <= userInput; userInput--) {
            if (userInput % 2 == 0) {
                System.out.print(userInput + " ");
            }
        }
    }
}
