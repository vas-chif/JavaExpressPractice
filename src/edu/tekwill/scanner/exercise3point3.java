package edu.tekwill.scanner;

import java.util.Scanner;

public class exercise3point3 {
    public static void main(String... args){

        Scanner celsius = new Scanner(System.in);
        System.out.print("Enter the temperature in your home in celsius: ");
        int userInput = celsius.nextInt();
        double fahrenheit = ((9 * userInput) + (32*5))/5.d;
        System.out.print("In your house you have " + fahrenheit + "°F");
    }
}
