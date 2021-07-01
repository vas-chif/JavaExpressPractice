package edu.tekwill.fors;

import java.util.Scanner;

public class WorkingWhitFor {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        //asc
        for (int item = 1; item <= userInput; item++) {
            System.out.print(item + " ");
        }
        System.out.println(";");
        //desc
        for (int item = 1; item <= userInput; userInput--) {
            System.out.print((userInput + " "));
        }
        System.out.println(";");
        String[] cars = {"Toy", "BmV", "Mer"};
        for (int index = 0; index < cars.length; index++) {
            System.out.println(cars[index]);
        }
        for (String car : cars){
            System.out.println(car);
        }
    }
}
