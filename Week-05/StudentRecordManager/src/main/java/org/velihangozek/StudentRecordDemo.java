package org.velihangozek;

import java.util.List;

/**
 * Demo application for creating and printing Student records.
 * Also verifies that equals() and hashCode() behave correctly.
 */
public class StudentRecordDemo {
    public static void main(String[] args) {
        // 1. Create several students
        List<Student> students = List.of(
                new Student("Ali", "Yılmaz", 1001),
                new Student("Ayşe", "Demir", 1002),
                new Student("Mehmet", "Kara", 1003)
        );

        // 2. Print each student's info (uses Record.toString())
        System.out.println("=== Registered Students ===");
        students.forEach(System.out::println);

        // 3. Demonstrate equals() and hashCode()
        Student s1 = new Student("Ali", "Yılmaz", 1001);
        Student s2 = new Student("Ali", "Yılmaz", 1001);

        System.out.println("\n=== Equality & HashCode Check ===");
        System.out.printf("s1.equals(s2): %b%n", s1.equals(s2));
        System.out.printf("s1.hashCode() == s2.hashCode(): %b%n",
                s1.hashCode() == s2.hashCode());
    }
}