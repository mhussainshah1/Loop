package company.com;

import java.util.Scanner;

/**
 * 10. Factorial of a Number:
 *
 * You are going to write an application to determine the factorial of a single number.
 * A factorial of an integer is the product of that integer and all the integers below it.
 * For example, the factorial of 4 is (4 x 3 x 2 x 1 = 24).
 * The user will be required to enter an integer.
 * You will then calculate the factorial of that integer and print the result to the screen.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n = keyboard.nextInt();
        int result = 1;
        for (int i = n;i > 0 ; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}
