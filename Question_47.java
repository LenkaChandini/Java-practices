/* wirte a program to check whether the given number is Xylem pholem number or not. */

import java.util.Scanner;

public class Question_47 {
    public static boolean isXylem(int n ){
        int esum = 0, msum = 0;
        for( int i = n; i != 0 ; i /= 10){
            int last = i  % 10;
            if(n == i || i < 10){
                esum += last;
            }else {
                msum += last;
            }
        }
        return esum == msum;
    }
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = c.nextInt();
        System.out.println(isXylem(n) ? n + " Is a Xylem number" : n + " Is not Xylem number");
    }
    
}
