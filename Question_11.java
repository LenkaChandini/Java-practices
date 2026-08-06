/* write a program check wheather the student in the passed or fail in the exam. */
import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks : ");
        int marks = sc.nextInt();
        if(marks>=35){
            System.err.println("Student is Passed in Exam");
        }
        else{
            System.err.println("Student is fail in Exam");
        }

    }
    
}
