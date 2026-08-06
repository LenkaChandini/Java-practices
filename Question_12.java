/* Write a program to print the largest number among two numbers. */
import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 >= num2){
            System.out.println("The largest number : " + num1);
        } else {
            System.out.println("The largest number : " +num2);
        }
    }   
}
