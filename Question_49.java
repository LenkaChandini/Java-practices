/* Harshad Number:  
        A Harshad number is a number that is divisible by the sum of its digits.

    Example: 
            18
                Sum of digits = 1 + 8 = 9
                18 is divisible by 9
                So, 18 is a Harshad number
    Another example
            15
                Sum of digits = 1 + 5 = 6
                15 is not divisible by 6
                So, 15 is not a Harshad number
*/

import java.util.Scanner;

public class Question_49 {
    public static boolean isHarshad(int n) {
        if (n <= 0) {
            return false;
        }

        int temp = n;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return n % sum == 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        System.out.println(isHarshad(n) ? n + " is Harshad number" : n + " is not Harshad number");
    }
}
