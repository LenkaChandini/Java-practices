
import java.util.Scanner;

class Happy_number{
    public static boolean checkHappyNumber(int num){
        while(num != 0 && num != 1 && num != 4){
            int sum = 0;
            while(num != 0){
                int id = num % 10;
                sum += id * id;
                num /= 10;
            }
            num = sum;
        }
        return num == 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num  = s.nextInt();
        System.out.println(checkHappyNumber(num) ? "Happy number" : "Not a happy number");
    }
}