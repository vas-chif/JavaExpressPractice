package edu.tekwill.whiles;

import java.util.Scanner;

public class WorkingWhitWhile {
    public static void main(String[] args) {
        System.out.println(" Please enter first number: ");
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int userInput = sc.nextInt();

        while (userInput != 0) {
            sum += userInput;
            count++;
            System.out.print(" Please enter another number: ");
            userInput = sc.nextInt();

        }
        System.out.println("Sum is:" + sum);
        System.out.println("Count is:" + count);

    }
}
