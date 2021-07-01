package edu.tekwill.shapes.array.probe;

import java.util.Arrays;

public class Probe2 {
    public static void main(String[] args) {
        int[] basket = {2, 3, 4, 7, 8, 6, 9, 11 };
        System.out.println("Target Array befor: " + Arrays.toString(basket));
        int contOddElemt = 0;
        for (int item : basket) {
            if (item % 2 == 1 || item % 2 == -1) {
                contOddElemt++;
            }
        }
        System.out.println("Odd Element: " + contOddElemt);

        int[] evenElementArray = new int[basket.length];
        System.out.println("Length even array: " + evenElementArray.length);

        int[] oddElementArray = new int[basket.length];
        System.out.println("Length odd array: " + oddElementArray.length);

        for (int index = 0; index < basket.length; index++) {
            if (basket[index] % 2 != 0) {
                int oddElement = basket[index];
                oddElementArray[index] = oddElement;
                System.out.println("Odd elemnt Array: " + oddElementArray[index]);
            } else {
                int evenElement = basket[index];
                evenElementArray[index] = evenElement;
                System.out.println("Even element array: " + evenElementArray[index]);
            }
        }
        System.out.println("Odd element of original Array: " + Arrays.toString(oddElementArray));
        System.out.println("Even element of original Array: " + Arrays.toString(evenElementArray));

    }
}
