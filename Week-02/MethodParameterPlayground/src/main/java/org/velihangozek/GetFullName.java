package org.velihangozek;

public class GetFullName {
    public static void main(String[] args) {
        String fullName = getFullName("Velihan", "Gözek");
        System.out.println("Full Name => " + fullName);
    }
    private static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}