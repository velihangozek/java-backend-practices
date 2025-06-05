package org.velihangozek;

public class ThirdMain {
    public static void main(String[] args) {
        int left = 100, right = 200;

        while (++left < --right);
        System.out.println("The middle of 100 and 200 --> " + left);
    }
}