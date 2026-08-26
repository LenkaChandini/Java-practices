/* wirte a program to check whether the given number is neon number or not?  */
import java.util.Scanner;

class Question_46 {
    public static boolean neonNumber(int n){
        int sum = 0;
        int sq = n * n;
        while(sq != 0){
            int last = sq % 10;
            sum += last;
            sq /= 10;
        }
        return sum == n;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(neonNumber(n) ? n + " Is a neon number" : n + " Is not neon number");
    }
}