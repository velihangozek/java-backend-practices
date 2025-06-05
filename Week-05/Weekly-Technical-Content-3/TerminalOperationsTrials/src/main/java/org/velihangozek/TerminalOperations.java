package org.velihangozek;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {

        List<String> namesList = List.of("Asu", "Veli", "Ece", "Ege", "Ece", "Asu");

        System.out.println(namesList);

        List<String> namesStartWithE = namesList.stream()
                .filter(name -> name.startsWith("E"))
                .toList();

        System.out.println(namesStartWithE);

        Set<String> uniqueNames = namesList.stream()
                .collect(Collectors.toSet());

        System.out.println(uniqueNames);

        Map<String, Integer> namesWithLengths = uniqueNames.stream()
                .collect(Collectors.toMap(name -> name, String::length));

        System.out.println(namesWithLengths);

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);

        Integer sumOfIntegerList = integerList.stream()
                .reduce(0, Integer::sum);

        System.out.println(sumOfIntegerList);

        Integer multiplicationOfIntegerList = integerList.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(multiplicationOfIntegerList);

        Optional<Integer> max = integerList.stream()
                .reduce(Integer::max);

        System.out.println("Max => " + max.get());

        Optional<Integer> min = integerList.stream()
                .reduce(Integer::min);

        System.out.println("Min => " + min.get());

        long countOfNamesLengthOver3 = namesList.stream()
                .filter(name -> name.length() > 3)
                .count();

        System.out.println(countOfNamesLengthOver3);

        List<Integer> integerList2 = List.of(10, 20, 30, 40, 50);

        boolean allEven = integerList2.stream().allMatch(number -> number % 2 == 0);
        System.out.println(allEven);

        boolean anyMultiplyOf25 = integerList2.stream().anyMatch(number -> number % 25 == 0);
        System.out.println(anyMultiplyOf25);

        boolean noneGreaterThan49 = integerList2.stream().noneMatch(n -> n > 49);
        System.out.println(noneGreaterThan49);
    }
}