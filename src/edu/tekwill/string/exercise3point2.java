package edu.tekwill.string;

/**
 * @author vas-chif
 * @Exercise #3.2: Using and manipulating numbers
 */

public class exercise3point2 {
    public static void main(String[] args) {
        double price = 88.8;
        double tax = 22.3;
        int quantity = 2;
        double total = price * quantity * tax;
        System.out.println("I want to buy " + quantity + " shirt!");
        System.out.println("Total cost with tax is: " +total + " $");
    }

}
