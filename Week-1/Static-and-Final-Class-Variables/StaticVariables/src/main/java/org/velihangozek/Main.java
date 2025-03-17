package org.velihangozek;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.number = "321434";
        Student.number = "432432";

        System.out.println(Student.number);
    }
}