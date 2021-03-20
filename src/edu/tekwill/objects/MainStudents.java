package edu.tekwill.objects;

public class MainStudents {
    public static void main(String[] args) {
        Student someStudent = new Student();
        someStudent.name = "Tom";
        someStudent.roll_no = 1;
//       System.out.println(someStudent.name);
//        System.out.println(someStudent.roll_no);
        // System.out.println("Student [ name = " + someStudent.name + ", roll_no = " + someStudent.roll_no + "]");
        someStudent.printState();
//        String objectState = someStudent.printState();
//        System.out.println(objectState);

    }
}
