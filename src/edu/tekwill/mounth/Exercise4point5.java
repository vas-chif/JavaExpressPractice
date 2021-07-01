package edu.tekwill.mounth;
/*
 * @author vas-chif
 * Exercise #4.5: Using switch statements
 */
import java.util.Scanner;
public class Exercise4point5 {
public static void main(String... args){
    System.out.println("Please enter a number between 1 and 7: ");
    Scanner day = new Scanner(System.in);
    int userImput = day.nextInt();
switch (userImput){
    case 1:
        System.out.println("Mon");
        break;
    case 2:
        System.out.println("Tue");
        break;
    case 3:
        System.out.println("Wed");
        break;
    case 4:
        System.out.println("Thu");
        break;
    case 5:
        System.out.println("Fri");
        break;
    case 6:
        System.out.println("Sat");
        break;
    case 7:
        System.out.println("Sun");
        break;
    default:
        System.out.println("Unknown mount!");
}
}
}
