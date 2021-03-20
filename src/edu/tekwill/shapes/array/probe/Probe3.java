package edu.tekwill.shapes.array.probe;

import java.util.Arrays;

public class Probe3 {
    public static void main(String[] args) {

        int[] basket = {2, 3, 4, 5, 6};

        int evenElement = 0;
        for (int item : basket) {
            if (item % 2 == 0) {
                evenElement++;
            }
        }
        System.out.println("Total even element in Array is: " + evenElement);

        int[] evenItemArray = new int[basket.length];
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] % 2 == 0) {
                int elementBasket = basket[i];
                evenItemArray[i] = elementBasket;
                System.out.println("Singular even element of the array: " + evenItemArray[i]);
            }
        }
        System.out.println("Original array: " + Arrays.toString(basket));
        System.out.println("Even item of the original Array: " + Arrays.toString(evenItemArray));
    }
}
