package org.velihangozek.model;

public class Magazine extends Product{

    public Magazine(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                '}';
    }
}
