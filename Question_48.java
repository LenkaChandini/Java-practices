/* wirte a program to check whether the given number is Spy number or not?  

        ex:
            1 + 1 + 2 + 4 = 8 sum of digits and  1 * 1 * 2 * 4 = 8 product of digits both are same is called Spy number 
*/

import java.util.Scanner;

public class Question_48 {
    public static boolean isSpy(int n){
        int sum = 0, prod = 1;
        for(int i = n ; i != 0; i /= 10){
            int last = i % 10;
            sum += last;
            prod *= last;
        }
        return sum == prod;
    }

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        System.out.println(isSpy(n) ? n + " Is Spy number" : n+ " Is Spy number");
    }
}
