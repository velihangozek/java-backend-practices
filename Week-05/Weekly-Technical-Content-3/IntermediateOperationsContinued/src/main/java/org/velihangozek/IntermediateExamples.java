package org.velihangozek;

import java.util.List;
import java.util.Optional;

public class IntermediateExamples {
    public static void main(String[] args) {

        List<String> names = List.of("Burcu", "Kemal", "Velihan");

        names.stream().forEach(System.out::println);
        names.forEach(System.out::println);

        names.forEach(name -> {
            if (name.startsWith("V")) {

            }

            name.toUpperCase();
        });

        List<Student> studentList = List.of(
                new Student("Velihan", List.of(new Course("Math"), new Course("Gym"))),
                new Student("Zeynep", List.of(new Course("Chemistry"), new Course("Biology"))),
                new Student("Mathilda", List.of(new Course("Physics"), new Course("History"), new Course("Geography")))
        );

        Optional<Course> math = studentList.stream()
                .flatMap(student -> student.getCourseList().stream())
                .filter(course -> course.getName().equals("Math"))
                .findFirst();

        System.out.println(math.get());

        Optional<String> mathUpperCase = studentList
                .stream()
                .flatMap(student -> student.getCourseList().stream())
                .filter(course -> course.getName().equals("Math"))
                .map(course -> course.getName().toUpperCase())
                .findFirst();

        System.out.println(mathUpperCase.get());

        List<String> mathilda = studentList
                .stream()
                .filter(student -> student.getName().equals("Mathilda"))
                .map(student -> student.getName())
                .peek(name -> name.trim())
                .filter(string -> string.endsWith("a"))
                .toList();

        System.out.println(mathilda);
    }
}
