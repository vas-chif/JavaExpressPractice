package edu.tekwill.mounth;
/*
 * @author vas-chif
 * Exercise #4.6: Using switch statements
 */

import java.util.Scanner;


public class Exercise4point6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        float number1 = sc.nextInt();

        System.out.println("Please enter a number: ");
        float number2 = sc.nextInt();

        System.out.println("Please enter one arithmetic operator: +, -, * or / ");
        char caracter = sc.next().charAt(0);
        switch (caracter) {
            case '+':
                float result = (number1 + number2);
            System.out.println("The result is: " + result );
            break;
            case '-':
                float result1 = (number1 - number2);
                System.out.println("The result is: " + result1 );
                break;
            case '*':
                float result2 = (number1 * number2);
                System.out.println("The result is: " + result2 );
                break;
            case '/':
                float result3 = (number1 / number2);
                System.out.println("The result is: " + result3 );
                break;
            default:
                System.out.println("Unknown operation");
        }
    }
}
