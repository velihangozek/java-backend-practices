package org.velihangozek;

public class Main {
    static boolean condition;

    public static void main(String[] args) {

        // Syntax
        if (condition) {
            // Code to execute when the condition is true
        } else {
            // Code to execute when the condition is false
        }

        // Simple if-else -> Consider a program that checks if a number is positive or non-positive:
        int number = 0;

        if (number > 0) {
            System.out.println(number + " is positive.");
        } else {
            System.out.println(number + " is whether negative or zero.");
        }

        // if-else-if ladder -> Grade Example
        int score = 75;

        if (score >= 92) {
            System.out.println("Grade: A with the score: " + score);
        } else if (score >= 80) {
            System.out.println("Grade: B with the score: " + score);
        } else if (score >= 70) {
            System.out.println("Grade: C with the score: " + score);
        } else if (score >= 55) {
            System.out.println("Grade: D with the score: " + score);
        } else {
            System.out.println("Grade: F with the score: " + score);
        }

        // Nested if-else.
        int secondNumber = 27;

        if (secondNumber <= 0) {
            System.out.println(secondNumber + " is not positive.");
            if (secondNumber == 0) {
                System.out.println(secondNumber + " is zero.");
            } else {
                System.out.println(secondNumber + " is negative.");
            }
        } else {
            System.out.println(secondNumber + " is positive.");
        }

        int thirdNumber = 3;

        if (thirdNumber > 5) {
            System.out.println(thirdNumber + " 5'ten büyük");
        } else if (thirdNumber < 0) {
            System.out.println(thirdNumber + " 0'dan küçük");
        }

        if (thirdNumber == 5) {
            System.out.println(thirdNumber + " 5'e eşit.");
        } else if (number != 5 && number > 5) {

        }

        int grade = 85;
        char letterGrade;

        if (grade >= 80)
            letterGrade = 'A';
         else if (grade >= 70)
            letterGrade = 'B';
         else if (grade >= 60)
            letterGrade = 'C';
         else if (grade >= 50)
            letterGrade = 'D';
            // letterGrade = 'G';
         else
            letterGrade = 'F';
            // letterGrade = 'E';

        System.out.println(letterGrade);

    }
}