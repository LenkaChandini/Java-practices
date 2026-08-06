

/* Write a program to check given number is even or odd number?? */

import java.util.Scanner;
public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("It is Even number");
        } else {
            System.out.println("It is Odd number");
        }
    }
    
}
