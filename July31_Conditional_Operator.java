
import java.util.Scanner;

class July31_Conditional_Operator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        String result = (num%2==0) ? "Even number" :"Odd number";
        System.out.println(num + " is " + result);
    }
}