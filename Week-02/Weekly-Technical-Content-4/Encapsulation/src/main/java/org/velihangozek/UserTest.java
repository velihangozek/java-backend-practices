package org.velihangozek;

public class UserTest {
    public static void main(String[] args) {
        // User user = new User();
        // user. => Setter methods are private.

        // Invalid Password
        User firstUser = new User("javelin", "1234_");

        // Valid Password
        User secondUser = new User("velihan", "1234qwer?_");
    }
}