package oop.encapsulation;

/**
 * Project Name    : java-practice
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/24/2022
 * Time            : 7:53 PM
 * Description     :
 **/

public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Osanda");
        student.setAge(30);
        student.setGrade("A");

        System.out.println("Student name is: " + student.getName());
        System.out.println("Student age is: " + student.getAge());
        System.out.println("Student grade is: " + student.getGrade());
    }
}
