import java.util.Scanner;

public class Palindrome_number {
    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            rev= rev * 10 + n % 10 ;
            n /= 10;   
        }
        return rev;
    }
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        if(n == reverse(n)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a Palindrome numbe");
        }
    }
}
