package edu.tekwill.shapes.array.elemts;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayElemts {

    int[] basket;

    int userInputLength;

    public void setUserInputLengthArray() {
        System.out.println("Please enter length array: ");
        Scanner ul = new Scanner(System.in);
        userInputLength = ul.nextInt();
        basket = new int[userInputLength];
        System.out.println("Length array is declared: " + basket.length);
    }

    public void setUserInputItemArray() {
        for (int i = 0; i < basket.length; i++) {
            System.out.println("Please enter item Array: ");
            Scanner ui = new Scanner(System.in);
            int userItemInput = ui.nextInt();
            basket[i] = userItemInput;
        }
        System.out.println("Your Array is: " + Arrays.toString(basket));
    }

    public void sum() {
        int sumIndexArray = 0;
        for (int i = 0; i < basket.length; i++) {
            sumIndexArray = sumIndexArray + basket[i];
        }
        System.out.println("Result sum of all index Array: " + sumIndexArray);
    }

    public void average() {
        double averageIndexArray = 0;
        int sumIndexArray = 0;
        for (int i = 0; i < basket.length; i++) {
            sumIndexArray = sumIndexArray + basket[i];
        averageIndexArray = (double)sumIndexArray / basket.length;
        }
        System.out.println("Result average index array is: " + averageIndexArray);
    }

    public void contOddElementArray() {
        int contOddElemnt = 0;
        for (int item : basket) {
            if (item % 2 == 1 || item % 2 == -1) {
                contOddElemnt++;
            }
        }
        System.out.println("Total odd element in Array is: " + contOddElemnt);
    }

    public void contEvenElementArray() {
        int evenElement = 0;
        for (int item : basket) {
            if (item % 2 == 0) {
                evenElement++;
            }
        }
        System.out.println("Total even element in Array is: " + evenElement);
    }

    public void odd() {
        int[] oddItemArray = new int[basket.length];
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] % 2 != 0) {
                int elementBasket = basket[i];
                oddItemArray[i] = elementBasket;
                System.out.println("Singular odd element of array: " + oddItemArray[i]);
            }
        }
        System.out.println("Original Array :" + Arrays.toString(basket));
        System.out.println("Odd item of the Original Array: " + Arrays.toString(oddItemArray));
    }

    public void even() {
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

    public void length() {
        System.out.println("Length array is: " + basket.length);
    }
}
