package org.velihangozek;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Date => Deprecated

        System.out.println(LocalDateTime.now());

        System.out.println(LocalDate.now());

        System.out.println(LocalDate.now().plusDays(2));

        System.out.println(LocalDateTime.now().plusMonths(1));

        System.out.println(LocalDate.now().plusYears(1));

        var birthDate = LocalDate.of(1998, 3, 8);
        System.out.println(birthDate);

        System.out.println(LocalDate.now().minusWeeks(1));

        var expireDate = LocalDate.of(2025, 4, 5);
        System.out.println();

        boolean isBefore = expireDate.isBefore(LocalDate.now());

        if (isBefore) {
            System.out.println("Expired!");
        } else {
            System.out.println("Not Expired yet!");
        }

        LocalDate extended = expireDate.plusMonths(2);

        if (LocalDate.now().isAfter(extended)) {
            System.out.println("Expired!");
        } else {
            System.out.println("Subscription extended!");
        }

        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalDate.now().getDayOfYear());
        System.out.println(LocalDate.now().getMonth());
        System.out.println(LocalDate.now().getYear());

        LocalTime now = LocalTime.now();
        LocalTime specificTime = LocalTime.of(23, 58, 45);

        System.out.println("Current time: " + now);
        System.out.println("Specific time: " + specificTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime now2 = LocalDateTime.now();

        String formattedDate = now2.format(formatter);
        System.out.println("Formatted Date => " + formattedDate);
    }
}