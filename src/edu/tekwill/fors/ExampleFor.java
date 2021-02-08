package edu.tekwill.fors;

public class ExampleFor {
    public static void main(String[] args) {
        int ration = 10;
        for (int item = 1, item1 = 5, item2 = 1; item <= 5; item++, ++item2, item1--){
            System.out.print((ration * item) + ", ");
            System.out.println((ration * item1) + ", ");
            System.out.println((ration * item2) + ", ");
        }
    }
}
