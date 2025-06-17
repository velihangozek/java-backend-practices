import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        // CREATE - READ - UPDATE - DELETE => CRUD
        session.beginTransaction();

        try {

            Customer customer = new Customer();
//            customer.setName("Hibernate Test");
//            customer.setGender(Customer.Gender.MALE);
//            customer.setOnDate(LocalDate.now());
//            customer.setMail("hibernate@velihan.com");
//
//            session.persist(customer);

//            customer = session.get(Customer.class, 1);
            // System.out.println(customer);
//            customer.setName("Updated Name");
//            session.persist(customer);
//
//            session.remove(customer);

//            customer = session.byId(Customer.class).getReference(2);
//            System.out.println(customer);

            List<Customer> customerList = session
                    .createSelectionQuery("FROM Customer", Customer.class)
                    .getResultList();

//            Customer customer1 = session
//                    .createSelectionQuery("FROM Customer WHERE id = 2", Customer.class)
//                    .getSingleResult();

            Customer customer1 = session
                    .createSelectionQuery("FROM Customer WHERE id = 34", Customer.class)
                    .getSingleResultOrNull();

            System.out.println("List => " + customerList);
            System.out.println("Single => " + customer1);

            session.getTransaction().commit();

        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
}