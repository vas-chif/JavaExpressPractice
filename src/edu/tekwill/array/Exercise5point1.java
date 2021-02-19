package edu.tekwill.array;
/*
 * @author vas-chif
 * Exercise #5.1 Working with arrays
 */
import java.util.Arrays;

public class Exercise5point1 {
    public static void main(String[] args) {
        int a = 8, b = 6;

        //1. Declare an array of type int.
        int[] integerArray = {1, 3};

        //2. Allocate memory for this array.
        integerArray = new int[2];

        //3. Initialize the array.
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;

 //4. Print the array to the console.
        }
        System.out.println("Show intArray: "+ Arrays.toString(intArray) + " ");

 // 5. Repeat 1, 2 and 3 by combining the declaration, allocation and initialization of the array in one statement.

        int[] dArray = new int[5];
        for (int i = 0; i < dArray.length; i++) {
            dArray[i] = i + 0;

        }
        // 6. Print the array to the console.
        System.out.print("Sow dArray: " + Arrays.toString(dArray));

    }


}

