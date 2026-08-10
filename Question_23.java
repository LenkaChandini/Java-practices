
import java.util.Scanner;

/* write a program to print the secson names based on the months. */

public class Question_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month name : ");
        String month = sc.nextLine();
        switch (month) {
            case "january":
            case "february":
            case "december":
            case "november":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
            case "june":
                System.out.println("Rainy");
                break;
            case "july":
            case "august":
            case "september":
            case "october":
                System.out.println("Summer");
                break;
            default:
                System.out.println("Invalid month name");
                break;
        }
    }
    
}
