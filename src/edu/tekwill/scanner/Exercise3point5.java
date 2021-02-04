package edu.tekwill.scanner;
/**
 * @author vas-chif
 * @Exercise #3.5: Sum, difference, product, average
 */

import java.util.Scanner;

public class Exercise3point5 {
    public static void main(String ... args){

        System.out.println("Please entre 2 numbers!");

        Scanner number = new Scanner(System.in);
        int firstNumber = number.nextInt();
        int secondNumber = number.nextInt();
       // 1. the addition
        int addition = (firstNumber + secondNumber);
        System.out.println("This is the addition of the two numbers: " + addition );
      //  2. the subtraction
        int subtraction = (firstNumber - secondNumber);
        System.out.println("This is the subtraction of the two numbers: " + subtraction );
      //  3. multiplication
        int multiplication = (firstNumber * secondNumber);
        System.out.println("This is the multiplication of the two numbers: " + multiplication );
     //   4. the division
        float division = (firstNumber / secondNumber);
        System.out.println("This is the division of the two numbers: " + division ); // nu imi da decimalele ??????
     //   5. the average ...media
        int average = (firstNumber + secondNumber)/2;
        System.out.println("This is the average of the two numbers: " + average );
     //   6. the remainder ... restul
        int remainder = (firstNumber % secondNumber);
        System.out.println("This is the remainder of the two numbers: " + remainder );

    }
}
