/* Write a program to print the sum of digits in a given number. */

import java.util.Scanner;

public class Question_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int sum = 0;

        /*while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits: " + sum);*/


         for (; num > 0; num = num / 10 ) { // is a /10 delete the last digit 
            int digit = num % 10; // is a %10 fetch the last number 

            if (digit >= 0) {
                sum = sum + digit;
            }
        }

        System.out.println("Sum of digits: " + sum);
    }
}