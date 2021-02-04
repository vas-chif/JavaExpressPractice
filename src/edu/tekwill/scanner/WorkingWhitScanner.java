package edu.tekwill.scanner;

import java.util.Scanner;

public class WorkingWhitScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userImput = sc.nextInt();
        System.out.println("User has entered the following value: " + userImput);

    }
}
