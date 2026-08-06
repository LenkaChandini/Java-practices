
import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your marks 1 : ");
        double marks_1 = sc.nextDouble();
          System.out.println("Enter the your marks 2 : ");
        double marks_2 = sc.nextDouble();
          System.out.println("Enter the your marks 3 : ");
        double marks_3 = sc.nextDouble();
          System.out.println("Enter the your marks 4 : ");
        double marks_4 = sc.nextDouble();
          System.out.println("Enter the your marks 5 : ");
        double marks_5 = sc.nextDouble();
          System.out.println("Enter the your marks 6 : ");
        double marks_6 = sc.nextDouble();

        double total = (marks_1 + marks_2 + marks_3 + marks_4 + marks_5 + marks_6)/6;

        if(total>95){
            System.out.println("First Rank " + total);
        } 
        else if (total>90){
            System.out.println("Second Rank "+total);
        }
        else if (total>80) {
            System.out.println("Distinction " + total);
            
        } else if(total>70){
            System.out.println("First class with distinction " + total);
        } else if(total>60){
            System.out.println("First Class " + total);

        } else if(total>45){
            System.out.println("Second Class " + total);
        }
         else if(total>35){
            System.out.println("Pass " + total);
         }
         else if (total<35){
            System.out.println("Fail " + total);
         }
            
        }
    }
    

