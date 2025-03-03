package week1;

public class Main {

    static boolean bool1;

    public static void main(String[] args) throws InterruptedException {

        System.out.println(bool1);

        System.out.println("Hello \rvelihan1!\n");

        System.out.println("H\'ello\b velihan\"2!");

        System.out.println("\tHello v\\elihan3!\f");

        System.out.print("Loading 10%\r");
        // Thread.sleep(1000);
        System.out.print("Loading 20%\r");
        // Thread.sleep(1000);
        System.out.print("Loading 30%\r");
        // Thread.sleep(1000);
        System.out.print("Loading 40%\n");

        int i = 35;

        int i1 = 56;

        boolean isA;
        isA = true;

        isA = false;

        i1 = -67;

        i = 200 + i1;

        byte b = 127;
        b = 127 - 255;

        char c = 'c';
        char c1 = 'A';

        System.out.println(c1);

        int i2 = 2_000_000_000;

        long l;
        l = 100;

        //short 2m;
        //2m = 1;

        short m2;
        m2 = 1;

        int number;

        int j1=0,j2=1,j3=2;
        int k1,k2,k3;
        k1=2;k2=4;k3=6;

        // int j1=7;

        boolean bool = false;
        bool = true;

        System.out.println(bool);

        System.out.println(k1 + k2 + k3);

        // Operators
        // Arithmetic Operators

        int sum = 100 + 200;

        // int x = 5, y = 3;

        int x = 7;
        int y = 4;

        int sum1 = x + y;
        System.out.println("Addition: " + sum1); // String Concatenation

        int result = x - y;
        System.out.println("Subtraction: " + result);

        int result1 = x * y;
        System.out.println("Multiplication: " + result1);

        int result2 = x / y;
        System.out.println("Division: " + result2); // result in int so it will be rounded down.

        int result3 = x % y;
        System.out.println("Mod: " + result3);

        //int result4 = x * 3.4;
        double result4 = x * 3.4;
        System.out.println(result4);

        // Assignment Operator

        boolean isEqual = x == y;
        boolean isEqual1 = 4 == y;
        System.out.println("x:" + x + " y:" + y + " Equal? " + isEqual);
        System.out.println("x:" + 4 + " y:" + y + " Equal? " + isEqual1);

        boolean notEqual = x != y;
        boolean notEqual1 = 4 != y;
        System.out.println("x:" + x + " y:" + y + " Not Equal? " + notEqual);
        System.out.println("x:" + 4 + " y:" + y + " Not Equal? " + notEqual1);

        boolean isGreater = x > y;
        boolean isLesser = x < y;
        System.out.println("x:" + x + " y:" + y + " Greater Than? " + isGreater);
        System.out.println("x:" + x + " y:" + y + " Less Than? " + isLesser);

        boolean isLessThanOrEqual = x <= y;
        boolean isGreaterThanOrEqual = x >= y;
        System.out.println("x:" + x + " y:" + y + " Less Than Or Equal? " + isLessThanOrEqual);
        System.out.println("x:" + x + " y:" + y + " Greater Than Or Equal? " + isGreaterThanOrEqual);

        // Logical Operators

        boolean isTrue = isEqual && isEqual1;
        boolean isTrue1 = true && false;
        boolean isFalse = false || true;
        boolean isFalse1 = ( false || true ) && ( false && false ) || ( true && true && false) ;

        int a = 5;
        int d = (a == 1) ? 1 : 0;
        System.out.println("\n" + d);

    }
}
