package org.velihangozek;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;

        System.out.println(today.format(formatter));

        System.out.println(today.format(DateTimeFormatter.ofPattern("EEEE/MM/yyyy")));

        // Date date = Date.valueOf(futureDate);
        // System.out.println(date);

        String stringDate = "08/15/2026";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate parsedLocalDate = LocalDate.parse(stringDate, formatter1);
        System.out.println("Parsed Local Date (ISO) => " + parsedLocalDate);

        String formattedStringDate = formatter1.format(parsedLocalDate);

        System.out.println("Formatted String Date => " + formattedStringDate);

        String isoFormattedStringDate = "2026-03-15";

        LocalDate parsedLocalDateWithoutFormatter = LocalDate.parse(isoFormattedStringDate);
        System.out.println("ISO Formatted String Date (Without formatter) => " + parsedLocalDateWithoutFormatter);

        // Parsing Error => System.out.println("Future Date => " + LocalDate.parse("10.02.2026"));

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now => " + now);

        System.out.println("Formatted now => " + now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        System.out.println("Formatted now (hours and minutes only) => " + now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));

        String dateTime = "14-04-2026 00:46:52";

        System.out.println(LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        LocalDateTime australiaDateTime = ZonedDateTime.now(ZoneId.of("Australia/Sydney")).toLocalDateTime();

        System.out.println("Zoned Date Time for Australia/Sydney => " + australiaDateTime);
    }
}