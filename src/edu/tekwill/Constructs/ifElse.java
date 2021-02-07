package edu.tekwill.Constructs;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        Scanner userImput = new Scanner(System.in);
        System.out.println("Please entered 2 numbers!");
        int a = userImput.nextInt(), b = userImput.nextInt();
        int max;
        if (a > b) {
            //  max = a;
            System.out.println("a is max!");
        } else {
            //  max = b;
            System.out.println("b is max!");
        }
// Se pun acoladele daca trebue sa executi mai multe instructiuni
        System.out.println("Return result whit Ternary operator");
        String resultTrenaryMetod = (a > b) ? ("a is max!") : ("b is max!");
        System.out.println(resultTrenaryMetod);

    }
}
