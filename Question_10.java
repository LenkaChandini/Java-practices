/* Write a program to check wheather a person is eligible for voting or not */

import java.util.Scanner;
public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = sc.nextInt();
        if(age>=18){
            System.err.println("Your Eligible for Voting");
        } else {
            System.err.println("Your not Eligible for Voting");
        }
    }
    
}
