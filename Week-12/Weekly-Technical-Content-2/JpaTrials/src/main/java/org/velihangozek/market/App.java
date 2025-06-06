package org.velihangozek.market;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        // Method-1
//        EntityTransaction transaction = entityManager.getTransaction();

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

//        transaction.begin();

//        // Supplier Insert
//        Supplier supplier = new Supplier();
//        supplier.setAddress("Adres");
//        supplier.setCompany("Velo");
//        supplier.setContact("05432101234");
//        supplier.setMail("velihangozek@hotmail.com");
//        supplier.setPerson("velihan");
//        entityManager.persist(supplier);
//
//        // Code Insert
//        Code code = new Code();
//        code.setGroup("11123");
//        code.setSerial("44456");
//        entityManager.persist(code);
//
//        // Product Insert
//        Product product = new Product();
//        product.setName("Iphone 15 Pro");
//        product.setPrice(1234);
//        product.setStock(100);
//        product.setCode(code);
//        product.setSupplier(supplier);
//        entityManager.persist(product);
//
//        System.out.println(product);
        // System.out.println(code);

//        Product product = entityManager.find(Product.class, 1);
//        System.out.println(product);

//        Code code = entityManager.find(Code.class, 1);
//        System.out.println(code.getProduct().getName());

//        Product product = entityManager.find(Product.class, 1);
//        System.out.println(product);

//        Supplier supplier = entityManager.find(Supplier.class, 1);
//
//        Code code = new Code();
//        code.setGroup("11123");
//        code.setSerial("44456");
//        entityManager.persist(code);
//
//        Product product = new Product();
//        product.setName("Samsung Galaxy");
//        product.setPrice(1234);
//        product.setStock(100);
//        product.setCode(code);
//        product.setSupplier(supplier);
//        entityManager.persist(product);

//        Supplier supplier = entityManager.find(Supplier.class, 1);
//        // System.out.println(supplier.getProductList());
//
//        // Enhanced for approach
//        for (Product product : supplier.getProductList()) {
//            System.out.println(product);
//        }

        // For Category Entity ->

        // Supplier Insert
//        Supplier supplier = new Supplier();
//        supplier.setAddress("Address");
//        supplier.setCompany("Velo");
//        supplier.setContact("05432101234");
//        supplier.setMail("velihangozek@hotmail.com");
//        supplier.setPerson("velihan");
//        entityManager.persist(supplier);
//
//        // Category Insert
//        Category category = new Category();
//        category.setName("Phones");
//        List<Product> productList = supplier.getProductList();
//        //category.setProductList();
//        entityManager.persist(category);
//
//        // Code Insert
//        Code code = new Code();
//        code.setGroup("11123");
//        code.setSerial("44456");
//        entityManager.persist(code);
//
//        // Product Insert
//        Product product = new Product();
//        product.setName("Iphone 15 Pro");
//        product.setPrice(1234);
//        product.setStock(100);
//        product.setCode(code);
//        product.setSupplier(supplier);
//        product.setCategory(category);
//        entityManager.persist(product);
//
//        System.out.println(product);

//        Color red = new Color("red");
//        Color green = new Color("green");
//        Color blue = new Color("blue");
//        entityManager.persist(red);
//        entityManager.persist(green);
//        entityManager.persist(blue);
//
//        Product product = entityManager.find(Product.class, 1);
//        List<Color> colorList = new ArrayList<>();
//        // List<Color> colorList = product.getColorList();
//        colorList.add(red);
//        colorList.add(green);
//        colorList.add(blue);
//        product.setColorList(colorList);
//        // product.setColorList(List.of(red, green, blue));
//        entityManager.persist(product);

//        Product product = entityManager.find(Product.class, 1);
//        System.out.println(product.getColorList());
//
//        Color color = entityManager.find(Color.class, 1);
//        System.out.println(color.getProductList());

//        transaction.commit();

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//
//        transaction.begin();
//
//        Product product = entityManager.find(Product.class, 1);
//        System.out.println(product.getName());
//
//        transaction.commit();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        Product product = entityManager.find(Product.class, 1);
        //System.out.println(product.getCategory().getName());
        //System.out.println(product.getSupplier().getCompany());
        System.out.println(product.getCode().getSerial());

        transaction.commit();
    }
}