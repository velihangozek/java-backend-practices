package org.velihangozek;

public class Grade {
    public static void main(String[] args) {
        int grade = 7;

        String letterGrade = switch (grade / 10) {
            case 10,9 -> "A";
            case 8 -> "B";
            case 6 -> "C";
            case 3,4 -> "D";
            default -> "F";
        };
        System.out.println(letterGrade);
    }
}