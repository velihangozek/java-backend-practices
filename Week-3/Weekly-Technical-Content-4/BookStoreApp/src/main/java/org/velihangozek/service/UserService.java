package org.velihangozek.service;

import org.velihangozek.model.User;

import java.util.HashSet;
import java.util.Set;

public class UserService {

    private static Set<User> userList = new HashSet<>();

    public void create(String name, String email, String password) {

        User user = new User(name, email, password);

        userList.add(user);

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
}
