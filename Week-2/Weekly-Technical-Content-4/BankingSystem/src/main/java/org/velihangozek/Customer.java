package org.velihangozek;

public class Customer {
    private String firstName;
    private String lastName;
    private String phone;
    private String password;
    private String identityNumber;
    private BankAccount[] bankAccounts;

    public Customer(String firstName, String lastName, String password, String identityNumber) {
        if (password.length() < 8 || password.length() > 12) {
            System.out.println("The password should be at least 8 characters and at most 12 characters long!");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
            this.password = password;
            this.identityNumber = identityNumber;
            bankAccounts = new BankAccount[4];
            System.out.println("Customer successfully created! => " + this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
