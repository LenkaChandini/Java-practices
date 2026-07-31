
/* A store gives a 10% discount if the billing amount is greater than $1000, otherwise, it gives a 5%  discount . Calcalate the finalbill using a single line code with the conditional operator  */

import java.util.Scanner;
public class July31_class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter billing amount: ");
        double billing_Amount = sc.nextDouble();

        double finalBill = billing_Amount > 1000 ? billing_Amount * 0.90 : billing_Amount * 0.95;
        System.out.println("Final bill after discount: " + finalBill);
    }
}
