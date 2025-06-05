package org.velihangozek;

public class Main {
    int x;

    public static void main(String[] args) {
        int number = 5;
        System.out.println("First value of number => " + number);
        change(number);
        System.out.println("Changed value of number => " + number);

        Main m1 = new Main();
        m1.x = 5;

        System.out.println("First value of x => " + m1.x);

        m1.change2(m1);

        System.out.println("Changed value of x => " + m1.x);

        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Element[0] First Value = " + array[0]);

        change3(array);

        System.out.println("Element[0] Changed Value = " + array[0]);
    }

    private static void change3(int[] array) {
        array[0] += 10;
    }

    private void change2(Main m1) {
        m1.x += 10;
    }

    private static void change(int number2) {
        number2 += 10;
    }
}