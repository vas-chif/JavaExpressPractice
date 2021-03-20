package edu.tekwill.shapes.array.probe;

import java.util.Arrays;
import java.util.Scanner;
/*
Create a code that read the data typed by the user for the "length Array" and the "Item Array",
after covert  it in void class for importing them in another package.
 */

public class Probe {
    public static void main(String[] args) {
        int[] basket;
        int lengthArray;


        System.out.println("Please enter length of the Array");

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        lengthArray = userInput;
        basket = new int[lengthArray];


        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Please enter item of the Array: ");
            int userItem = sc.nextInt();
            basket[i] = userItem;
        }
        System.out.println("Your Array is : " + Arrays.toString(basket));
    }
}
