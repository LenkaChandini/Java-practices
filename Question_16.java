/* Write a program to check whether a candidate is eligible for an interview or not.
   The candidate is eligible if the aggregate percentage is 60% or above.
*/


import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the aggregate percentage: ");
        double aggregate = sc.nextDouble();

        if (aggregate >= 60) {
            System.out.println("Candidate is eligible for the interview.");
        } else {
            System.out.println("Candidate is not eligible for the interview.");
        }
    }
}