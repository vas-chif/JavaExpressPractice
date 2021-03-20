package edu.tekwill.array;
/*
 @ Author vas-chif
 @Exercise #5.2 Working with arrays
*/
public class Exercise5point2 {
    public static void main(String[] args) {

        String[] skiRestor = {"Whistler Blackcomb", "Squaw Valley", "Brighton", "Snowmass", "Sun Valley", "Taos"};

        for (int index = 0; index < skiRestor.length; index++){
            System.out.println("Intem whit index: " + index + " is " + skiRestor[index]);
        }
// Write an expression that refers to the string Brighton within the array
        System.out.println("Select Ski Restor: " +  skiRestor[2]);
// What is the value of the expression skiResorts.length?
        System.out.println("The value of the expression skiResorts.length is: " + skiRestor.length);
        //What is the index of the last item in the array?
        System.out.println("The index of the last item in the array is: " + (skiRestor.length - 1));
// What is the value of the expression skiResorts[4]?
        System.out.println("the expression skiResorts[4] is : " + skiRestor[4]);
    }
}
