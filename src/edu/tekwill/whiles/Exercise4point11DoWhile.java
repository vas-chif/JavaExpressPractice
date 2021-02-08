package edu.tekwill.whiles;
/*
* @author vas-chif
* @Exercise #4.11: Using while, do-while loop
 */

import java.util.Scanner;

public class Exercise4point11DoWhile {

    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
//do-while loop

        do {
            sum += count;
            count++;
        } while (count <= 100);
        System.out.println("The sum is: " + sum);

// for loop

        System.out.println("Please print first number: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        for (int item = 1; userInput != 0; ) {
            System.out.println("Please enter another number: ");
            userInput = sc.nextInt();
        }
        System.out.println("Program is closed!");

    }
}
