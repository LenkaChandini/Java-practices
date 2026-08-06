/* Write a program to print the final bill after discount.
   If the bill is more than 10000, give a 20% discount.
   Otherwise, give a 5% discount.
*/
import java.util.Scanner;

public class Question_13 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Bill : ");
        double bill=sc.nextDouble();
        double finalbill;
        if(bill>10000){
            finalbill = bill - (bill * 20/100);
        }
        else {
            finalbill = bill - (bill * 5/200);
        }
        System.out.println("This is FinalBill : " + finalbill);
    }
}
