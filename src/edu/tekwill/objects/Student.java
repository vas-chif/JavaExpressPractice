package edu.tekwill.objects;

public class Student {
    String name;
    int roll_no;

    void printState() {
        System.out.println("Student [ name = " + name + ", roll_no = " + roll_no + "]");
    }
    //metoda urmeaza sa intoarca o valoare (codul de dedesupt este o metoda)
    //care are funtia la codul cometat mai sus
//    String printState() { // tipul de  date a metodei trebue sa corespunda cu valoare returnata
//        return "Student [ name = " + name + ", roll_no = " + roll_no + "]";//in acest cas valoare returnata este txt
}

