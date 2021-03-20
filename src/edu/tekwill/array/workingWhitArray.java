package edu.tekwill.array;

import java.util.Arrays;

public class workingWhitArray {
    public static void main(String[] args) {
//Exercise #5.3 Working with arrays
        //5.3.4 Write a Java program to find the index of an array element.
        int[] someNumbers = {1, 3, 5, 10, 6, -8};
        int search = 1;
        boolean found = false;
        for (int element : someNumbers) {
            if (element == search) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Found it!" : "Could not find anything!");
//5.3.5 Write a Java program to copy the elements of an array into another array.
        int[] sourceArray = {2, 3, 4, 7, 8, 6, 12, 20};
        int[] targetArray = new int[sourceArray.length];
        System.out.println("Target Array befor: " + Arrays.toString(targetArray));
        for (int index = 0; index < sourceArray.length; index++){
            int sourceElement = sourceArray[index];
            targetArray[index] = sourceElement;
        }
System.out.println("Source Array: " + Arrays.toString(sourceArray));
System.out.println("Target Array after: " + Arrays.toString(targetArray));

//5.3.6 Write a Java program to find the number of even and odd integers in a given array of integers.
        int oddCount = 0;
        for (int elemnt : sourceArray) {
            if (elemnt % 2 == 1 || elemnt % 2 == -1) {
                oddCount++;
            }
        }
        int evenNumbers = sourceArray.length - oddCount;
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Even numbers: " + evenNumbers);
    }
}
