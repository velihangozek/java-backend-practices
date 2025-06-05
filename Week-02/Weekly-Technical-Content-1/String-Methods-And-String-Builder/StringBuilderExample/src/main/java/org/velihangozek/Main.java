package org.velihangozek;

public class Main {
    public static void main(String[] args) {
        String name = "Velihan";
        System.out.println(name);
        System.out.println(name.replace('e', 'x'));
        System.out.println(name);

        var name2 = name.replace('e', 'x');
        System.out.println(name2);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Velihan").toString();
        System.out.println(stringBuilder);

        stringBuilder.replace(0, 1, "X");

        System.out.println(stringBuilder);

        StringBuilder alphabet = new StringBuilder();

        for (char current = 'a'; current <= 'z'; current++) {
            System.out.println(alphabet.append(current));
        }

        StringBuilder stringBuilder2 = new StringBuilder();

        stringBuilder2
                .append("Velihan")
                .append(" Gözek")
                .append(" Java");

        stringBuilder2.append(" with version 21");

        System.out.println(stringBuilder2);

        String s1 = "String";
        String s2 = "String";
        boolean iss1TheSameObjectWiths2 = (s1 == s2);
        System.out.println(s1 + " (literal - s1) and " + s2 + " (literal - s2) are the same objects? => " + iss1TheSameObjectWiths2);

        String s3 = new String("String");
        boolean iss1TheSameObjectWiths3 = (s1 == s3);
        System.out.println(s1 + " (literal - s1) and " + s3 + " (new String - s3) are the same objects? => " + iss1TheSameObjectWiths3);

        boolean iss2TheSameObjectWiths3 = (s2 == s3);
        System.out.println(s2 + " (literal - s2) and " + s3 + " (new String - s3) are the same objects? => " + iss2TheSameObjectWiths3);

        System.out.println("Interning s3 in string pool with intern() method...");
        s3.intern();

        boolean iss1TheSameObjectWiths3AfterIntern = (s1 == s3);
        System.out.println(s1 + " (literal - s1) and " + s3 + " (new String - s3) are the same objects? (After s3.intern() independently - not assigned to anything) => " + iss1TheSameObjectWiths3AfterIntern);

        boolean iss2TheSameObjectWiths3AfterIntern = (s2 == s3);
        System.out.println(s2 + " (literal - s2) and " + s3 + " (new String - s3) are the same objects? (After s3.intern() independently - not assigned to anything) => " + iss2TheSameObjectWiths3AfterIntern);

        String interneds3 = s3.intern(); // Returns a "pooled" string reference - not a void method and Strings are IMMUTABLE.
        boolean iss1TheSameObjectWithinterneds3AfterIntern = (s1 == interneds3);
        System.out.println(s1 + " (literal - s1) and " + interneds3 + " (new String - interned s3) are the same objects? (After s3.intern() assigned to a string) => " + iss1TheSameObjectWithinterneds3AfterIntern);

        String helloWorld = "Hello world";
        String helloWorldTrimmed = " Hello world".trim();
        System.out.println(helloWorldTrimmed + " (\"Hello world\") is the same with " + helloWorldTrimmed + " (\" Hello world.trim()\") ? => " + (helloWorld == helloWorldTrimmed));

        String hello = "Hello";
        System.out.println(hello);

        String concat = hello + " world";
        System.out.println(concat);

        hello += concat;
        System.out.println(hello);

        System.out.println(hello);

        System.out.println(helloWorld.equals(concat));
        System.out.println(helloWorld == concat);
    }
}