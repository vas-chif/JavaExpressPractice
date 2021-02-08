package edu.tekwill.Constructs;

//a x 2 + b x + c = 0
public class Exercise4poin3Quadratic {
    public static void main(String... args) {
        int a = 1;
        int b = 5;
        int c = 1;
        int delta = b * b - 4 * a * c;
        double x1 = 0;
        double x2 = 0;
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            x1 = x2 = (-b / (2 * a));
            System.out.println("x1 = x2 = " + x1);
        } else {
            System.out.println(("There are not roots for this equation!"));
        }
    }
}
