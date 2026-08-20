/* Wirte a program to check whether the given number is a Disarium or not. */
import java.util.Scanner;

class Question_44 {
    public static int count(int n){
        int count = 0;
        while(n!=0){
            count++;
            n /= 10;
        }
        return count;
    }

    public static int power(int base, int exp){
        int pow = 1;
        for(int i = 1; i <= exp ; i++){
            pow = pow * base;
        }
        return pow;
    }

    public static boolean isDisarium(int n){
        int sum = 0, exp = count(n);
        for(int j = n ; j != 0; j /= 10){
            int last = j % 10;
            sum = sum * power(last, exp);
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(isDisarium(n) ? n + " is Disarium " : n + " is not Disarium");
    }
}