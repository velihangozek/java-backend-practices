package org.velihangozek.model;

import org.velihangozek.model.enums.Gender;

import java.time.LocalDate;

public class User {
    private String name;
    private String email;
    private String password;
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate createdDate;
    private boolean isActive;

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
}
