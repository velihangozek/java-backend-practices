package org.velihangozek;

public class Scopes {
    public static void main(String[] args) {
        int variable1 = 100;
        int variable2 = 200;

        {
            int variable3 = 300;

            System.out.println(variable1);

            {
                int variable4 = 400;
                System.out.println(variable2);
            }

            int variable5 = 500;
            System.out.println(variable3);
        }

        int variable6 = 600;
        System.out.println(variable6);
    }
}