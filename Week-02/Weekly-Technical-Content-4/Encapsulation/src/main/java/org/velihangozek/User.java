package org.velihangozek;

public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        //this.userName = userName;
        // this.password = password;
        setUserName(userName);
        setPassword(password);
    }

    public String getUserName() {
        return userName;
    }

    private void setUserName(String userName) {
        if (userName.length() >= 3 && userName.length() <= 20) {
            this.userName = userName;
        } else {
            System.out.println("Username length must be between 3-20 characters (inclusive)");
        }
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        if (password.length() >= 8 && password.length() <= 11) {
            this.password = password;
        } else {
            System.out.println("Password length must be between 8-11 characters (inclusive)");
        }

    }
}