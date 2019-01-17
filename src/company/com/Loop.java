package company.com;

import java.util.Scanner;


public class Loop {
    // Write a program that prints the numbers 1-10.
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }

        //Write a program that prints the numbers 1-10 backwards.
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
        }

        //Write a program that prints all the odd numbers from 1-20.
        for (int i = 1; i <= 20 ; i += 2) {
            System.out.println(i);
        }

       //Write a program that prints all the even numbers from 1-20.
        for (int i = 2; i <= 20 ; i += 2) {
            System.out.println(i);
        }

        //Have the user input a number and print all numbers from that input value to 1.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n = keyboard.nextInt();

        for (int i = n; i > 0 ; i--) {
            System.out.println(i);
        }

        //Sum all values from 1-10.
        int sum = 0;
        for (int i = 1; i <=10 ; i++) {
            sum += i;
        }
        System.out.println(sum);

        //Have the user enter a number and print the sum of all numbers from that inputted value to 1.
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int no = keyboard1.nextInt();
        int result = 0;
        for (int i = no; i > 0 ; i--) {
            result += i;
        }
        System.out.println(sum);

        /*
         * Write loops to print the following:
         *
         * i)
         *
         * **********
         * **********
         * **********
         * **********
         *
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * ii)
         *
         * *
         * **
         * ***
         * ****
         * *****
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * iii)
         *
         *     *
         *    **
         *   ***
         *  ****
         * *****
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
