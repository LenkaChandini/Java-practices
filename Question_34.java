

/* write a program to print numbers in a range that are divisible by a given number. */

import java.util.Scanner;

class Question_34 {
    public static void main(String[] args) {
        /* int num = 1;
        int div = 5;
        for (int i = num; i <= 100; i++) {
            if (i % div == 0) {
                System.out.println(i);
            }
        }*/

        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter the div : ");
        int div = sc.nextInt();
        while(num <= 100){
            if(num % div == 0){
                System.out.println(num);
            }
            num++;
        } */

            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter the div : ");
        int div = sc.nextInt();
       do{
            if(num % div == 0){
                System.out.println(num);
            }
            num++;
        } while (num<=100); 

    }
}