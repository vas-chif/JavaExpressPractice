package edu.tekwill.constructs;

public class TernaryContructs {
    public static void main(String... args){
        int a = 199;
        int b = (a > 199) ? a%20 : a%3;
        System.out.println(b);
    }
}
