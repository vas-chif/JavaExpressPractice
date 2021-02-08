package edu.tekwill.scanner;
/*
 * @author vas-chif
 * @Exercise #3.3: Fahrenheit to Celsius degree
 */

import java.util.Scanner;

public class Exercise3point3 {
    public static void main(String... args){

        Scanner celsius = new Scanner(System.in);
        System.out.print("Enter the temperature in your home in celsius: ");
     //   int userInput = celsius.nextInt();
        double fahrenheit = ((9 * celsius.nextInt()) + (32*5))/5.d;
        System.out.print("In your house you have " + fahrenheit + "°F");
    }
}
