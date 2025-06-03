package org.velihangozek.market;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Method-1
        EntityTransaction transaction = entityManager.getTransaction();

//        transaction.begin();
//
//        Customer customer1 = new Customer();
//        customer1.setName("velonaz");
//        customer1.setMail("velo@gmail.com");
//        customer1.setGender(Customer.Gender.FEMALE);
//        customer1.setOnDate(LocalDate.now());
//
//        entityManager.persist(customer1);
//
//        transaction.commit();
//
//        transaction.begin();
//
//        Customer customer = new Customer();
//        customer.setName("Velihan");
//        customer.setMail("velihangozek@hotmail.com");
//        customer.setGender(Customer.Gender.MALE);
//        customer.setOnDate(LocalDate.now());
//
//        entityManager.persist(customer);
//
//        transaction.commit();

        // Method-2
        // entityManager.getTransaction().begin();
        // entityManager.getTransaction().commit();

        // CRUD - Update

//        transaction.begin();
//
//        Customer customerToBeUpdated = entityManager.find(Customer.class, 1);
//        customerToBeUpdated.setName("velo");
//
//        entityManager.persist(customerToBeUpdated);
//
//        transaction.commit();

        // CRUD - Delete

//        transaction.begin();
//
//        Customer customerToBeDeleted = entityManager.find(Customer.class, 5);
//        entityManager.remove(customerToBeDeleted);
//
//        transaction.commit();

        // Customer customer = entityManager.find(Customer.class, 2); // No customer with id = 2 in DB, so the output will be null, no exception.
        //System.out.println(customer);

        transaction.begin();
//
//        Code code = new Code();
//        code.setGroup("11123");
//        code.setSerial("44456");
//        entityManager.persist(code);
//
//        Product product = new Product();
//        product.setName("Iphone 15 Pro");
//        product.setPrice(1234);
//        product.setStock(100);
//        product.setCode(code);
//        entityManager.persist(product);
//
//        System.out.println(product);
        // System.out.println(code);

//        Product product = entityManager.find(Product.class, 1);
//        System.out.println(product);

        Code code = entityManager.find(Code.class, 1);
        System.out.println(code.getProduct().getName());

        transaction.commit();
    }
}