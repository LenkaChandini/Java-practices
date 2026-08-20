import java.util.Scanner;

/* Define a method to accept an integer and print the count of even and odd digits. */
public class Question_42 {

    public static void countEvenOddDigits(int num) {
       

        int evenC = 0;
        int oddC = 0;

        if (num == 0) {
            evenC = 1;
        } else {
            while (num > 0) {
                int digit = num % 10;

                if (digit % 2 == 0) {
                    evenC++;
                } else {
                    oddC++;
                }

                num /= 10;
            }
        }

        System.out.println("Even digits: " + evenC);
        System.out.println("Odd digits: " + oddC);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = s.nextInt();

        countEvenOddDigits(num);
    }
}