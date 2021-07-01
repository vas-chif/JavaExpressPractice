package edu.tekwill.shapes.geometric.rectangle;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Please enter the length of your rectangle: ");
        rectangle.length = sc.nextInt();
        System.out.println("Please enter the width of your rectangle: ");
        rectangle.width = sc.nextInt();

        rectangle.calculateAreaRectangle();
        rectangle.calculatePerimeterRectangle();
    }
}
