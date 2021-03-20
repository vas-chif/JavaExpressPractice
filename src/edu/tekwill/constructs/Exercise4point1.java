package edu.tekwill.constructs;
/*
 * @author vas-chif
 * @Exercise #4.1: Using if, if-else statements
 */

import java.util.Scanner;

public class Exercise4point1 {
    public static void main(String... agr) {
        System.out.println("Please entered 2 numbers!");
        Scanner userImput = new Scanner(System.in);
        int a = userImput.nextInt();
        int b = userImput.nextInt();
        if (a > b)
            System.out.println("The max number is " + a + "!");
        else
            System.out.println("The max number is " + b + "!");

        System.out.println("Return result whit Ternary operator");
        String ter = (a > b) ? ("The max number is " + a + "!") : ("The max number is " + b + "!");
        System.out.println(ter);
    }

}
