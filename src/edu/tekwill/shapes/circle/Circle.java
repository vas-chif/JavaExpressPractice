package edu.tekwill.shapes.circle;

public class Circle {
    public int radius;

    public void calculateAreaCircle() {
        //double area = Math.PI * radius * radius;
        double area = Math.PI * Math.pow(radius, 2); //textul comentat de mai sus este echivalente la aceta de aici
        System.out.println("Circle Area is: " + area);
    }

    public void calculateDiameterCircle() {
        double diameter = radius * 2;
        System.out.println("Diameter of circle is: " +diameter);
    }
}
