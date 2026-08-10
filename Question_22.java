/* 
 */

import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number : ");
        int day_number= sc.nextInt();
        switch (day_number){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Firday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            case 8:
                System.out.println("Invaild day");
                break;
            
        }

    }
    
}