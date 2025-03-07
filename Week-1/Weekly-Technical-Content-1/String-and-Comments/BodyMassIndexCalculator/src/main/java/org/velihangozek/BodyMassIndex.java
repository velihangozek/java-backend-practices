package org.velihangozek;

public class BodyMassIndex {
    private final double heightInMeters;
    private final double weight;

    /**
     * Constructs a BodyMassIndex instance.
     *
     * @param heightInCm The height in centimeters.
     * @param weight     The weight in kilograms.
     */
    public BodyMassIndex(double heightInCm, double weight) {
        // Convert height from centimeters to meters
        this.heightInMeters = heightInCm / 100;
        this.weight = weight;
    }

    /**
     * Calculates the Body Mass Index (BMI).
     *
     * @return the calculated BMI.
     */
    public double getBodyMassIndex() {
        return weight / (heightInMeters * heightInMeters);
    }
}