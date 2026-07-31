/* Write a program to print the final bill after imposing tax using the following conditions:

    - If the bill amount is greater than ₹1,00,000, add 22% tax.
    - If the bill amount is between ₹50,000 and ₹1,00,000, add 12% - tax.
    - If the bill amount is greater than or equal to ₹20,000 and less than ₹50,000, add 8% tax.
    - If the bill amount is less than or equal to ₹20,000, no tax is applicable.
*/

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the bill amount: ");
        double bill = sc.nextDouble();

        double finalBill = (bill > 100000) ? bill + (bill * 22 / 100) : ((bill > 50000) ? bill + (bill * 12 / 100) : ((bill >= 20000) ? bill + (bill * 8 / 100) : bill));
        System.out.println("Final Bill Amount: " + finalBill);
    }
}