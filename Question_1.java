/* Write a program to check whether a person is eligible for voting or not? */


import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int a = sc.nextInt();
        String result = (a >= 18) ? "Eligible" : "Not Eligible";
        System.out.println(result);
    }
}
