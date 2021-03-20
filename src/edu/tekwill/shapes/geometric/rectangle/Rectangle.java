package edu.tekwill.shapes.geometric.rectangle;

public class Rectangle {
    public int length;
    public int width;

    public void calculateAreaRectangle() {
        double area = length * width;
        System.out.println("Rectangle Area is: " + area);
    }

    public void calculatePerimeterRectangle() {
        double perimeter = (length + width) * 2;
        System.out.println("Rectangle perimeter is: " + perimeter);
    }

}
