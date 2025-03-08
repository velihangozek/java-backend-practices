package org.velihangozek;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fruit {
    private final String name;
    private final BigDecimal pricePerKg;
    private BigDecimal amountInKg = BigDecimal.ZERO;

    public Fruit(String name, String pricePerKg) {
        this.name = name;
        this.pricePerKg = new BigDecimal(pricePerKg);
    }

    public void setAmountInKg(BigDecimal amountInKg) {
        if (amountInKg.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        this.amountInKg = amountInKg;
    }

    public BigDecimal getTotalPrice() {
        return pricePerKg.multiply(amountInKg).setScale(2, RoundingMode.HALF_UP);
    }

    public String getName() {
        return name;
    }
}