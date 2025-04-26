package org.velihangozek;

public class Patient {

    private String identityNumber;
    private String firstName;
    private String lastName;
    private int age;

    /*
    public Patient() {
    }
     */

    public Patient(String identityNumber) {
        setIdentityNumber(identityNumber);
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        if (identityNumber.length() != 11) {
            System.out.println("TCKN/ID Must be 11 characters long!");
        } else {
            this.identityNumber = identityNumber;
            System.out.println("Valid TCKN/ID Entered => Patient record successfully accessed!");
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}