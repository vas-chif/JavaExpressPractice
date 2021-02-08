package edu.tekwill.Constructs;

import java.util.Scanner;

public class Exercise4point2 {
    public static void main(String... agr) {
        System.out.println("Please entered 3 different numbers!");
        Scanner userImput = new Scanner(System.in);
        int a = userImput.nextInt();
        int b = userImput.nextInt();
        int c = userImput.nextInt();
        if ((a <= b) && (a <= c))
            System.out.println("The min number is " + a + "!");

        else if ((b <= a) && (b <= c))
            System.out.println("The min number is " + b + "!");

        else if ((c <= a) && (c <= b))
            System.out.println("The min number is " + c + "!");

        //  else if ((a == b) || (a == c) || (b == c))
        //    System.out.println("2 or all 3 numbers are the same");

        System.out.println("Return result whit Ternary operator");
        String ter = ((a <= b) && (a <= c) && (b <= c )) ? ("The min number is " + a + "!") : ("The min number is " + b + "!");
        System.out.println(ter);
        //ter = ((b <= a) && (b <= c) && (a <= c)) ? ("The min number is " + b + "!") : ter = ((c <= a) && (c <= b) && (b <= a )) ? ("The min number is " + c + "!") : "nil";

    }
}
