package org.velihangozek;

public class GetSubstring {
    public static void main(String[] args) {
        String subString = getSubstring("Velihan", 4, 7);
        System.out.println("Substring = " + subString);
    }
    private static String getSubstring(String string, int beginIndex, int endIndex) {
        return string.substring(beginIndex, endIndex);
    }
}
