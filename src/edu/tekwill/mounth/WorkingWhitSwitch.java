package edu.tekwill.mounth;

import java.util.Scanner;


public class WorkingWhitSwitch {
    public static void main(String... args) {
        System.out.println("Please enter a number between 1 and 12: ");
        Scanner sc = new Scanner(System.in);
        int userImput = sc.nextInt();
        switch (userImput) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("Mag");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Set");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Unknown mount!");
        }

    }
}
