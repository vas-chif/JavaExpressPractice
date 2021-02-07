package edu.tekwill.Constructs;

public class ternaryContructs {
    public static void main(String... args){
        int a = 199;
        int b = (a > 199) ? a%20 : a%3;
        System.out.println(b);
    }
}
