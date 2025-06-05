package org.velihangozek;

import java.util.*;
import java.io.*;

public class Main {
    public static String firstReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(firstReverse(s.nextLine()));
    }
}