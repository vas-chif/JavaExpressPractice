package edu.tekwill.scanner;

import  java.util.Scanner;

public class Exercise3point4 {
    public static void main(String[] arg){
        int secondsInAMinute = 60;
        int minutesInAnHours = 60;
        int secondsInAnHours = (secondsInAMinute * minutesInAnHours);
        int hoursInADay = 24;
        int secondsInADay = (secondsInAnHours * hoursInADay);
        System.out.println("Seconds in a day: " + secondsInADay + ".");

        int dayInAYear = 365;
        int secondsInAYear = (secondsInADay * dayInAYear);
        System.out.println("Seconds in a Year: " + secondsInAYear + ".");

        Scanner age = new Scanner(System.in);
        int userImput = age.nextInt();
        System.out.println("How old are you? ");
        int ageInASeconds = (userImput * secondsInAYear);
        System.out.print("Your age in seconds is " + ageInASeconds + " " + "!");

    }
}
