/* Write a program to check whether n is a factor of m or not. */

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m value : ");
        int m = sc.nextInt();
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();
        if(m%n == 0){
            System.out.println(n + " is a facter of " + m );
        } else {
            System.out.println(n + " is not a facter of " + m);
        }

    }
    
}
