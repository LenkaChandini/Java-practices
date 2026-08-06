/* wirte a program to check wheather given year is a leap year ot not */
import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = sc.nextInt();

        if(year%100 == 0){
            if(year%400 == 0){
                System.out.println("it is leap year : " + year);
            }
            else{
                System.out.println("it is not leap year : " + year);
            }
        }
        else if (year%4 == 0){
            System.out.println("it is leap is year : " + year);
        } else {
            System.out.println("it id not year : " + year);
        }

    }
}
