package org.velihangozek;

// TicketCalculator.java
public class TicketCalculator {

    public static double calculateTicketPrice(double distance, int age, int journeyType) {
        // Validate input: distance and age must be positive; journeyType must be 1 or 2.
        if (distance <= 0 || age <= 0 || (journeyType != 1 && journeyType != 2)) {
            return -1;
        }

        // Calculate the normal fare (base fare)
        double baseFare = distance * 0.10;
        double discountRate = 0;

        // Determine age discount rate
        if (age < 12) {
            discountRate = 0.50; // 50% discount
        } else if (age >= 12 && age < 24) {
            discountRate = 0.10; // 10% discount
        } else if (age >= 65) {
            discountRate = 0.30; // 30% discount
        }

        // Apply age discount
        double discountedFare = baseFare - (baseFare * discountRate);

        // Apply round-trip discount if applicable
        if (journeyType == 2) {
            discountedFare = discountedFare - (discountedFare * 0.20); // 20% discount for round trip
            discountedFare *= 2; // Multiply by 2 for both ways
        }

        return discountedFare;
    }
}