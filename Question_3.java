/* Write a program to check whether a student is passed or failed based on the marks.
    - If the marks are greater than or equal to 35, print "Passed";
   otherwise, print "Fail". */

   
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int a = sc.nextInt();
        String result = (a >= 35) ? "Passed" : "Fail";
        System.out.println(result);
    }
    
}
