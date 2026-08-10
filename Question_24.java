/* Write a program to implement a simple calculator using
   integer numbers and operators as input by the user. */


import java.util.Scanner;

public class Question_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int num1 =sc.nextInt();
        System.out.println("Enter the operator ( +, -, *, %, /) : ");
        char operator =sc.next().charAt(0);
        System.out.println("Enter the number 2 : ");
         int num2 =sc.nextInt();

         switch(operator){
            case '+' :
                System.out.println("Result : " + (num1 + num2));
                break;

            case '-' :
                System.out.println("Result : " + (num1 - num2));
                break;
            
            case '*' :
                System.out.println("Result : " + (num1 * num2));
                break;
            case '%' :
                System.out.println("Result : " + (num1 % num2));
                break;
            case '/' :
                System.out.println("Result : " + (num1 / num2));
                break;
            default:
                System.out.println("Invaild operator");
                break;
            
         }
    }
}
