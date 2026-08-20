import java.util.Scanner;

public class Question_38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = digit;
            num = num / 10;
            System.out.print(sum);
        }
    }
}
