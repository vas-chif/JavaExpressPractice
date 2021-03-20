package edu.tekwill.shapes;

import edu.tekwill.shapes.circle.Circle;
import edu.tekwill.shapes.rectangle.Rectangle;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {

        System.out.println("Please select figure: 1 for Circle and 2 for rectangle");
        Scanner sc = new Scanner(System.in);
        int userSelect = sc.nextInt();

        while (userSelect != 1 && userSelect != 2) {
            System.out.println("Please select figure: 1 for Circle and 2 for rectangle");
            userSelect = sc.nextInt();
        }
        if (userSelect == 1) {
            Circle circle = new Circle();
            System.out.println("Please enter the length of radius: ");
            circle.radius = sc.nextInt();
            circle.calculateAreaCircle();
            circle.calculateDiameterCircle();
        }
        if (userSelect == 2) {
            Rectangle rectangle = new Rectangle();
            System.out.println("Please enter the length of rectangle: ");
            rectangle.length = sc.nextInt();
            System.out.println("Please enter the width of rectangle: ");
            rectangle.width = sc.nextInt();
            rectangle.calculateAreaRectangle();
            rectangle.calculatePerimeterRectangle();
        }
    }
}
