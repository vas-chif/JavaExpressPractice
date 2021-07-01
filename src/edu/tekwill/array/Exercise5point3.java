package edu.tekwill.array;

/*
 * @author vas-chif
 * @Exercise #5.3 Working with arrays
 */

import java.util.Scanner;

public class Exercise5point3 {
    public static void main(String[] args) {

//5.3.1 Write a Java program to sum values of an array (do it with one & two dimensional array).
//5.3.2 Write a Java program to calculate the average value of array elements (do it with one & two dimensional array)
        int[] oneMArray = {1, 8, 10};

        float sumIndexArray = 0;
        float averageIndexArrey = 0;
        for (int item = 0; item < oneMArray.length; item++) {
            sumIndexArray = sumIndexArray + oneMArray[item]; //5.3.1
            averageIndexArrey = sumIndexArray / oneMArray.length;//5.3.2
        }
        System.out.println("Sum all index of the oneMArray: " + sumIndexArray);//5.3.1
        System.out.println("Average all index of the oneMArray: " + averageIndexArrey);//5.3.2

        //Two dimensional

        int[][] twoDArray = {{1, 2, 1}, {1, 1}};
        float sumIndexDArray = 0;
        float averageIndexDArray = 0;
        for (int horiz = 0; horiz < twoDArray.length; horiz++) {

            for (int vert = 0; vert < twoDArray[horiz].length; vert++) {
                sumIndexDArray = sumIndexDArray + twoDArray[horiz][vert]; //5.3.1
                averageIndexDArray = sumIndexDArray / (twoDArray[0].length + twoDArray.clone().length); //5.3.2
            }
        }
        System.out.println("Size twoDArray: " + (twoDArray[0].length + twoDArray.clone().length));
        System.out.println("Sum all index of the otwDArray " + sumIndexDArray); //5.3.1
        System.out.println("Average all index of the twoDArray: " + averageIndexDArray);//5.3.1

//5.3.3 Write a Java program to test if an array contains a specific value.
        char[] valueArray = {'a', 'b', 'c', 'w', 't', 'z'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        char value = sc.next().charAt(0);
        boolean foundCharacter = false;
        for (char item : valueArray) {
            if ((char) item == value) {
                foundCharacter = true;
                break;
            }
        }
        System.out.println(foundCharacter ? "The character searched for was found!" : "It is impossible to find the character!");

//5.3.4
//5.3.5
//5.3.6
//5.3.7 is in another file
    }
}
