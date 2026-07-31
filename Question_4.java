/* Write a program to check whether a person is eligible to contest in a Member of the Legislative Assembly (MLA) election or not? */

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the persons age: ");
        int age = sc.nextInt();

        String result = (age >= 25) ? "Eligible to contest the MLA election" : "Not eligible to contest the MLA election";

        System.out.println(result);
    }
}
