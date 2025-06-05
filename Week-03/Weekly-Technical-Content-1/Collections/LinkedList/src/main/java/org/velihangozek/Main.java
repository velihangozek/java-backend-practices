package org.velihangozek;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linked List");

        LinkedList<String> linkedList = new LinkedList<>();
        List<String> names = new LinkedList<>();

        names.add("velihan");
        names.add("velo");
        names.add("java");

        System.out.println(names);
    }
}