package org.velihangozek.market;

import jakarta.persistence.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//
//        transaction.begin();
//
//        Product product = entityManager.find(Product.class, 1);
//        //System.out.println(product.getCategory().getName());
//        //System.out.println(product.getSupplier().getCompany());
//        System.out.println(product.getCode().getSerial());
//
//        transaction.commit();

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//
//        transaction.begin();
//
//        Code code = new Code();
//        code.setSerial("2234");
//        code.setGroup("1234");
//
//        Product product = new Product();
//        product.setName("test");
//        product.setStock(10);
//        product.setPrice(123);
//        product.setCategory(entityManager.find(Category.class, 1));
//        product.setSupplier(entityManager.find(Supplier.class, 1));
//        product.setCode(code);
//
//        entityManager.persist(product);

//        transaction.commit();

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//
//        transaction.begin();
//
//        Product product = entityManager.find(Product.class, 1);
//        product.getCode().setGroup("4321");
//        product.setName("Update Test");
//        entityManager.merge(product);
//
//        // System.out.println(product.getCode());
//
//        transaction.commit();

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//
//        transaction.begin();
//
//        Product product = entityManager.find(Product.class, 1);
//        entityManager.remove(product);
//
//        // System.out.println(product.getCode());
//
//        transaction.commit();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        // JPQL (JAVA PERSISTENCE QUERY LANGUAGE)
        transaction.begin();

        // SELECT * FROM categories
        // Query getAllCategories = entityManager.createQuery("SELECT category FROM Category category", Category.class);
//        TypedQuery<Category> getAllCategories = entityManager.createQuery("SELECT category FROM Category category", Category.class);

        // SELECT * FROM Categories WHERE category_id = 1;
//        TypedQuery<Category> getCategory = entityManager.createQuery("SELECT cat FROM Category cat WHERE cat.id = 1", Category.class);

        // SELECT * FROM Categories WHERE category_id = 1;
//        TypedQuery<Category> getCategory = entityManager.createQuery("SELECT cat FROM Category cat WHERE cat.id = ?1", Category.class);
//        getCategory.setParameter(1, 1);

//        TypedQuery<Category> getCategory = entityManager.createQuery("SELECT cat FROM Category cat WHERE cat.id = :id", Category.class);
//        getCategory.setParameter("id", 1);
//
//        List<Category> categoryList = getCategory.getResultList();
//
//
//        for (Category category : categoryList) {
//            System.out.println(category.getName());
//        }

//        TypedQuery<Category> getCategory = entityManager.createQuery("SELECT cat FROM Category cat WHERE cat.id = :id", Category.class);
//        getCategory.setParameter("id", 1);

//        TypedQuery<Category> getCategory = entityManager.createQuery("SELECT cat FROM Category cat WHERE cat.id = :id", Category.class);
//        getCategory.setParameter("id", 123);
//        Category category = getCategory.getSingleResult();
//        System.out.println(category.getName());

//        TypedQuery<Product> productQuery = entityManager.createQuery("SELECT p FROM Product p WHERE p.price < 10", Product.class);
//        List<Product> productList = productQuery.getResultList();
//        System.out.println(productList);

//        TypedQuery<Product> productQuery = entityManager.createQuery("SELECT p.name FROM Product p WHERE p.price < 10", Product.class);
//        List<Product> productList = productQuery.getResultList();
//
//        for (Product product : productList) {
//            System.out.println(product.getName());
//        }

//        TypedQuery<String> productQuery = entityManager.createQuery("SELECT p.name FROM Product p WHERE p.price < 10", String.class);
//        List<String> productNameList = productQuery.getResultList();
//
//        for (String productName : productNameList) {
//            System.out.println(productName);
//        }

//        TypedQuery<Product> productQuery = entityManager.createQuery("SELECT p.id, p.name, p.price FROM Product p WHERE p.price < 10", Product.class);
//        List<Product> productInfoList = productQuery.getResultList();
//
//        for (Product productInfo : productInfoList) {
//            System.out.println("ID = " + productInfo);
//        }
//
//        TypedQuery<Product[]> productQuery = entityManager.createQuery("SELECT p.id, p.name, p.price FROM Product p WHERE p.price < 10", Product[].class);
//        List<Product[]> productInfoList = productQuery.getResultList();
//
//        for (Product[] productInfo : productInfoList) {
//            System.out.println("ID = " + productInfo[0]);
//        }

//        TypedQuery<Object[]> productQuery = entityManager.createQuery("SELECT p.id, p.name, p.price FROM Product p WHERE p.price < 10", Object[].class);
//        List<Object[]> productInfoList = productQuery.getResultList();
//
//        for (Object[] productInfo : productInfoList) {
//            System.out.println("ID = " + productInfo[0] + " - Name = " + productInfo[1] + " - Price = " + productInfo[2]);
//        }

//        TypedQuery<CheapProduct> productQuery = entityManager.createQuery("SELECT NEW CheapProduct(p.id, p.name, p.price) FROM Product p WHERE p.price < 10", CheapProduct.class);
//        List<CheapProduct> cheapProductList = productQuery.getResultList();
//
//        for (CheapProduct cheapProduct : cheapProductList) {
//            System.out.println(cheapProduct);
//        }

        // SELECT COUNT(*) AS cat_count FROM categories
//        TypedQuery<Long> customQuery = entityManager.createQuery("SELECT COUNT(p.id) FROM Product p", Long.class);
//        Long productCount = customQuery.getSingleResult();
//        System.out.println(productCount);

//        TypedQuery<Double> customQuery = entityManager.createQuery("SELECT MAX(p.price) FROM Product p", Double.class);
//        Double maxPriceProduct = customQuery.getSingleResult();
//
//        System.out.println("Max Price: " + maxPriceProduct);

        // SELECT COUNT(p.product_id), c.category_name FROM products AS p LEFT JOIN categories AS c ON p.product_category_id = c.category_id; GROUP BY c.category_name;
//        TypedQuery<Object[]> customQuery = entityManager.createQuery("SELECT COUNT(p.id), c.name FROM Product p LEFT JOIN p.category c GROUP BY p.category.id", Object[].class);
//        List<Object[]> productCountByCategory = customQuery.getResultList();
//
//        for (Object[] row : productCountByCategory) {
//            System.out.println("Category: " + row[1] + " has " + row[0] + " products");
//        }

//        TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product p WHERE p.category.id IN (1,5)", Product.class);
//        List<Product> productList = query.getResultList();
//
//        for (Product product : productList) {
//            System.out.println(product);
//        }

//        TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product p WHERE p.category.id IN (:cat1, :cat5)", Product.class);
//        query.setParameter("cat1", 1);
//        query.setParameter("cat5", 5);
//        List<Product> productList = query.getResultList();
//
//        for (Product product : productList) {
//            System.out.println(product.getCategory().getId() + " - " + product.getCategory().getName() + " - " + product.getName());
//        }

//        TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product p WHERE p.category.id IN :catIdList", Product.class);
//        query.setParameter("catIdList", List.of(1, 2));
//        List<Product> productList = query.getResultList();
//
//        for (Product product : productList) {
//            System.out.println(product.getCategory().getId() + " - " + product.getCategory().getName() + " - " + product.getName());
//        }

//        TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product p WHERE p.name LIKE :name", Product.class);
//        query.setParameter("name", "%c%");
//        List<Product> productList = query.getResultList();
//
//        for (Product product : productList) {
//            System.out.println(product.getName());
//        }

//        TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product p WHERE p.name LIKE '%c%'", Product.class);
//        List<Product> productList = query.getResultList();
//
//        for (Product product : productList) {
//            System.out.println(product.getName());
//        }

//        TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product p WHERE p.price BETWEEN 1 AND 10", Product.class);
//        List<Product> productList = query.getResultList();
//
//        for (Product product : productList) {
//            System.out.println("price: " + product.getPrice() + ", name: " + product.getName());
//        }

//        TypedQuery<Product> allQuery = entityManager.createNamedQuery("Product.findAll", Product.class);
//        List<Product> productList = allQuery.getResultList();
//
//        for (Product product : productList) {
//            System.out.println("price: " + product.getPrice() + ", name: " + product.getName());
//        }

        TypedQuery<Product> allQuery = entityManager.createNamedQuery("Product.cheap", Product.class);
        allQuery.setParameter("price", 3);
        List<Product> productList = allQuery.getResultList();

        for (Product product : productList) {
            System.out.println("price: " + product.getPrice() + ", name: " + product.getName());
        }

        transaction.commit();

    }
}