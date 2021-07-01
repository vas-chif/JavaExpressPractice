package edu.tekwill.array;

/*
 * @author vas-chif
 * @Exercise #5.3.7 Write a Java program to check if two arrays are equal: check both the length and the values.
 */
public class Exercise5point3point7 {
    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3, 4};

        boolean confrontItem = false;
        if (firstArray.length == secondArray.length) {
            for (int index1 = 0, index2 = 0; index1 < firstArray.length; index1++, index2++) {
                if (firstArray[index1] == secondArray[index2]) {
                    confrontItem = true;
                } else if (firstArray[index1] != secondArray[index2]) {
                    confrontItem = false;
                    break;
                }
            }
        }
         System.out.println(confrontItem ? "The arrays is equal!" : "The arrays is not equal!");
    }
}
