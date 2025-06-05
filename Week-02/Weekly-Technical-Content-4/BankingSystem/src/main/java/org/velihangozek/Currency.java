package org.velihangozek;

public enum Currency {
    TL("₺"),
    DOLLAR("$"),
    EURO("€"),
    GOLD("G");

    private final String currencySymbol;

    Currency(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }
}
