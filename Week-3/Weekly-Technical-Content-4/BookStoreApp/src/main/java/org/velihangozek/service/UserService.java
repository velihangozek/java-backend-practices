package org.velihangozek.service;

import org.velihangozek.model.User;

import java.util.HashSet;
import java.util.Set;

public class UserService {

    private static Set<User> userList = new HashSet<>();

    public void create(String name, String email, String password) {

        User user = new User(name, email, password);
        boolean isCreated = userList.add(user);
        if (isCreated) {
            System.out.println("User created successfully!: " + email);
        } else {
            System.out.println("Could not create user — a user with the email may already exist: " + email);
        }

    }

    public void list() {
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + " - Email: " + user.getEmail());
        }
    }

    public User findUserByName(String userName) {
        User foundUser = null;

        for (User user : userList) {
            if (user.getName().equals(userName)) {
                foundUser = user;
                break;
            }
        }
        return foundUser;
    }

    public User findUserByEmail(String userEmail) {
        User foundUser = null;
        for (User user : userList) {

            if (user.getEmail().equals(userEmail)) {
                foundUser = user;
                System.out.println("User found with the entered email: " + foundUser);
                break;
            }
        }
        return foundUser;
    }
}