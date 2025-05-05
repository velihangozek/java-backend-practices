package org.velihangozek.model;

import org.velihangozek.model.enums.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private String password;
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate createdDate;
    private boolean isActive;
    private List<Order> orderList = new ArrayList<>();

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.createdDate = LocalDate.now();
        this.isActive = true;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", createdDate=" + createdDate +
                ", isActive=" + isActive +
                ", orderList=" + orderList +
                '}';
    }
}
