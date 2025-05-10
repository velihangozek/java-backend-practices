package org.velihangozek;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperations {
    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("velihan"));
        customers.add(new Customer("velihan"));
        customers.add(new Customer("velihan"));
        customers.add(new Customer("velihan"));
        customers.add(new Customer("petek"));
        customers.add(new Customer("tutku"));
        customers.add(new Customer("tutku"));
        customers.add(new Customer("furkan"));
        customers.add(new Customer("tuana"));
        customers.add(new Customer("tuana"));
        customers.add(new Customer("tuana"));

        List<Customer> filteredCustomers = new ArrayList<>();

        for (Customer customer : customers) {
            if (customer.getName().startsWith("t")) {
                filteredCustomers.add(customer);
            }
        }

        System.out.println("With Foreach => " + filteredCustomers);

        List<Customer> filteredCustomersViaStream = customers.stream()
                .filter(customer -> customer.getName().startsWith("t"))
                .toList();

        System.out.println("With Stream => " + filteredCustomersViaStream);

        List<String> customersUpperCase = customers.stream()
                .map(customer -> customer.getName().toUpperCase())
                .toList();

        System.out.println(customersUpperCase);

        List<String> customersUpperCaseDistinct = customers.stream()
                .map(customer -> customer.getName().toUpperCase())
                .distinct()
                .toList();

        System.out.println(customersUpperCaseDistinct);

        List<String> customersSortedByName = customers.stream()
                .sorted(Comparator.comparing(customer -> customer.getName()))
                .map(customer -> customer.getName())
                .toList();

        System.out.println(customersSortedByName);

        List<String> customersSortedByNameDistinct = customers.stream()
                .sorted(Comparator.comparing(customer -> customer.getName()))
                .map(customer -> customer.getName())
                .distinct()
                .toList();

        System.out.println(customersSortedByNameDistinct);

        List<String> reverseSortedCustomers = customersSortedByNameDistinct.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(reverseSortedCustomers);

        List<String> reverseListMax3 = reverseSortedCustomers.stream()
                .limit(3)
                .toList();

        System.out.println(reverseListMax3);

        List<String> reverseListMax3SkippedFirst = reverseSortedCustomers.stream()
                .limit(3)
                .skip(1)
                .toList();

        System.out.println(reverseListMax3SkippedFirst);
    }
}