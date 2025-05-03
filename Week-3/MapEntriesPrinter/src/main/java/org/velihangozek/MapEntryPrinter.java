package org.velihangozek;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class MapEntryPrinter {
    public static void main(String[] args) {

//        Map<String, Integer> scores = new HashMap<>();
//        scores.put("Velo", 100);
//        scores.put("Şevo", 100);
//        scores.put("Furki", 100);
//        scores.put("Burcu", 99);
//        scores.put("Ecem", 87);
//        scores.put("Ercüment", 56);
//        scores.put("Semiramis", 43);

        Map<String, Integer> scores = Map.ofEntries(
                Map.entry("Velo", 100),
                Map.entry("Şevo", 100),
                Map.entry("Furki", 100),
                Map.entry("Burcu", 99),
                Map.entry("Ecem", 87),
                Map.entry("Ercüment", 56),
                Map.entry("Semiramis", 43)
        );

        System.out.println("Scores => ");

//        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }

        scores.forEach((name, score) -> System.out.printf("%s = %d%n", name, score));

    }
}