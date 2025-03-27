package org.velihangozek;

public class Main {
    public static void main(String[] args) {
        var string = "Lavanta";

        String flower = "Menekşe";

        int flowerLength = flower.length();
        System.out.println("Flower = " + flower + ", Length = " + flowerLength);

        char firstIndex = flower.charAt(0);
        System.out.println("Flower = " + flower + ", First index = " + firstIndex);

        // char c = flower.charAt(7); // StringIndexOutOfBoundsException

        char letter = 'e';
        int indexOfFlower = flower.indexOf(letter, 2);
        System.out.println("Flower = " + flower + ", index of '" + letter + "' => " + indexOfFlower);

        int beginIndex = 3, endIndex = 6;
        String substring = flower.substring(beginIndex, endIndex);
        System.out.println("Flower = " + flower + ", Substring from indexes between: " + beginIndex + ", " + endIndex + " = " + substring);

        String uppercaseFlower = flower.toUpperCase();
        System.out.println("Flower = " + flower + ", UPPERCASE = " + uppercaseFlower);

        String lowercaseFlower = flower.toLowerCase();
        System.out.println("Flower = " + flower + ", LOWERCASE = " + lowercaseFlower);

        String comparisonString = "MeNeKŞe";
        System.out.println("Flower = " + flower + ", is the same with the Comparison String = " + comparisonString + " ? => " + comparisonString.equals(flower));

        System.out.println("Flower = " + flower + ", is the same (case-insensitive) with the Comparison String = " + comparisonString + " ? => " + comparisonString.equalsIgnoreCase(flower));

        String startsWith = "Men";
        System.out.println("Flower = " + flower + ", Starts with '" + startsWith + "' ? => " + flower.startsWith(startsWith));

        String endsWith = "şe";
        System.out.println("Flower = " + flower + ", Ends with '" + endsWith + "' ? => " + flower.endsWith(endsWith));

        String contains = "ek";
        System.out.println("Flower = " + flower + ", Contains '" + contains + "' ? => " + flower.contains(contains));

        String original = "e";
        String replace = "X";
        System.out.println("Flower = " + flower + ", Replace '" + original + "', With  => '" +replace + "'" + " => " + flower.replace(original, replace));
    }
}