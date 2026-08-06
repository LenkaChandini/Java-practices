/* Write a program to check whether an employee is eligible for a hike or not.
   The employee is eligible for a hike if the number of projects completed is more than 5.
*/
import java.util.Scanner;
public class Question_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of project completed :  ");
        int num = sc.nextInt();
        if(num>=5){
            System.out.println("Employee is eligible for a hike ");
        }
        else {
            System.out.println("Employee is not eligible for a hike");
        }

    }
    
}
