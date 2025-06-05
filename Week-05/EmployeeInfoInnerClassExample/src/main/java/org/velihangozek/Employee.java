package org.velihangozek;

import java.util.Objects;

/**
 * Represents an employee with basic personal information
 * and an inner class for their contact details.
 */
public class Employee {
    private final String firstName;
    private final String lastName;
    private final ContactInfo contactInfo;

    /**
     * Constructs an Employee with the given name and contact info.
     *
     * @param firstName   the employee’s first name; must not be null
     * @param lastName    the employee’s last name; must not be null
     * @param phoneNumber the employee’s phone number; must not be null
     * @param email       the employee’s email address; must not be null
     * @throws NullPointerException if any argument is null
     */
    public Employee(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName   = Objects.requireNonNull(firstName,   "firstName cannot be null");
        this.lastName    = Objects.requireNonNull(lastName,    "lastName cannot be null");
        // instantiate the inner class here
        this.contactInfo = new ContactInfo(phoneNumber, email);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * @return the ContactInfo instance bound to this employee
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Prints this employee’s full contact information to stdout.
     */
    public void printContactInfo() {
        System.out.printf(
                "Contact Info for %s %s:%n" +
                        "  Phone: %s%n" +
                        "  Email: %s%n",
                firstName, lastName,
                contactInfo.getPhoneNumber(),
                contactInfo.getEmail()
        );
    }

    /**
     * Inner class that holds an employee’s phone number and email.
     * Because it’s non-static, each ContactInfo is tied to its Employee.
     */
    public class ContactInfo {
        private final String phoneNumber;
        private final String email;

        /**
         * Constructs ContactInfo. Both values are required.
         *
         * @param phoneNumber the phone number; must not be null
         * @param email       the email address; must not be null
         * @throws NullPointerException if any argument is null
         */
        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber, "phoneNumber cannot be null");
            this.email       = Objects.requireNonNull(email,       "email cannot be null");
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "ContactInfo{phoneNumber='" + phoneNumber + "', email='" + email + "'}";
        }
    }

    /**
     * Demo entry point.
     */
    public static void main(String[] args) {
        Employee emp = new Employee(
                "Velihan",
                "Gözek",
                "0543-123-45-67",
                "velihangozek@hotmail.com"
        );
        emp.printContactInfo();

        // You can also fetch the ContactInfo object:
        ContactInfo info = emp.getContactInfo();
        System.out.println("Raw Contact Info: " + info);
    }
}