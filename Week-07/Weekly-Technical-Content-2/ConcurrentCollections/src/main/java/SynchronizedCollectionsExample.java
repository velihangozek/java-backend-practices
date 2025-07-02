import java.util.*;

public class SynchronizedCollectionsExample {

    public static void main(String[] args) {

        Collections.synchronizedMap(new HashMap<String, Integer>());

        Collections.synchronizedList(List.of(1, 2, 3));

        Collections.synchronizedSet(Set.of("Velihan", "Engineer"));

    }

}