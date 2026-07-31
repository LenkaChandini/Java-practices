/* Write a program to find and print the largest number among two numbers using the ternary operator. */

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int largest=(a>b)? a:b;
        System.err.println("The largest among two is : " + largest);
    }
    
}
