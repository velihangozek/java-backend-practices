package org.velihangozek;

public class SecondMain {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i < 6) {
            if (i % 5 == 0) {
                System.out.println(i + " value is not considered.");
                i++;
                continue;
            }
            System.out.println(i + " value");
            sum += i;
            i++;
        }
        System.out.println("Total = " + sum);
    }
}
