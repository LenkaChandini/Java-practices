import java.util.Scanner;

/* write a program to print the sum of digits of a given number */
public class Question_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of value you wanted to executed : ");
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= number; i++){
            System.out.println("Enter the " + i + "th number : ");
            int n =sc.nextInt();
            sum=sum+n;
        }
        System.out.println("Sum of vaule : " + sum);
    }
}
