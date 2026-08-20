/* Write a program to check whether the given number is a Strong number or not. */

import java.util.Scanner;

public class Question_43 {
    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i<= n;i++){
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrong(int n){
        int sum = 0;
        for(int j = n; j != 0 ; j /= 10){
            int last = j % 10;
            sum = sum + factorial(last);
        }
        return sum==n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        System.out.println(isStrong(n)? n + "is Strong" : n + "is not Strong");
    }
}
