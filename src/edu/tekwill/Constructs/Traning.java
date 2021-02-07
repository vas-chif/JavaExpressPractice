package edu.tekwill.Constructs;
/*
 * @author vas-chif
 * @Exercise # training
 */
import java.util.Scanner;

public class Traning {
    public static void main(String[] args) {
        System.out.println("Please enter Your name!");
        Scanner userImput = new Scanner(System.in);
        String name = userImput.next();
        System.out.println("Please enter your surname!");
        String surname = userImput.next();
        System.out.println("My name is " + name + " " + surname + "!");
        // System.out.println(name.length());
        if (name.length() > 3 || surname.length() > 4)
            //  String th = name.split(0,3);
            System.out.println(name.substring(0, 3) + "_" + surname.substring(0, 4));
        else
            System.out.println(name + " " + surname);

        System.out.println("Return result whit Ternary operator");
        String resultTrenaryMetod = ((name.length() > 3) || (surname.length() > 4)) ? (name.substring(0, 3) + "_" + surname.substring(0, 4)) : (name + " " + surname);
        System.out.println(resultTrenaryMetod);
    }
}
