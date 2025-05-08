package org.velihangozek;

import java.util.Objects;

/**
 * Immutable value class representing a student.
 * Uses Java Record to automatically generate:
 * - private final fields
 * - canonical constructor (with null-checks if desired)
 * - equals(), hashCode(), toString()
 */
public record Student(String firstName, String lastName, int studentNumber) {
    /**
     * Canonical constructor with explicit null-checks.
     * Ensures immutability and validity at creation time.
     */
    public Student {
        Objects.requireNonNull(firstName, "firstName cannot be null");
        Objects.requireNonNull(lastName, "lastName cannot be null");
        if (studentNumber <= 0) {
            throw new IllegalArgumentException("studentNumber must be positive");
        }
    }
}