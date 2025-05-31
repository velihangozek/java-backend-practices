import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        try (EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
             EntityManager entityManager = entityManagerFactory.createEntityManager();) {
            //TODO
        }
        System.out.println("TEST");
    }
}