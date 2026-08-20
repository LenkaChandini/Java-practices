
import java.util.Scanner;

/* defined a method to accept a integer and print sum of the digits. */

public class Question_40 {
    public static void SumOfdigit (int num){
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a =sc.nextInt();
        SumOfdigit(a);
    }
    
}
