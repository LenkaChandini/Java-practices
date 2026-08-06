/* Write a program to input two numbers, print their sum,
   and check whether the sum is even or odd. */

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        if (sum % 2 == 0) {
            System.out.println("The sum is Even.");
        } else {
            System.out.println("The sum is Odd.");
        }
    }
}