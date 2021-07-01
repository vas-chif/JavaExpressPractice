package edu.tekwill.reference;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.age = 1;        dog2.age = 2;
        int var1 = 10;        int var2 = 11;

        System.out.println(dog1); //Dog { age = 1 }
        System.out.println(dog2); //Dog { age = 2 }
        System.out.println("var1 = " + var1); //var1 = 10
        System.out.println("var2 = " + var2); //var1 = 11
        System.out.println(" ++++++++++++ ");

        var2 = var1;        dog2 = dog1;

        System.out.println(dog1); //Dog { age = 1 }
        System.out.println(dog2); //Dog { age = 1 }
        System.out.println("var1 = " + var1); //var1 = 10
        System.out.println("var2 = " + var2); //var2 = 10
        System.out.println(" ++++++++++++ ");

        var2 = 12;        dog1.age = 3;

        System.out.println(dog1); //Dog { age = 3 }
        System.out.println(dog2); //Dog { age = 3 }
        System.out.println("var1 = " + var1); // var1 = 10
        System.out.println("var2 = " + var2); // var2 = 12
    }
}
