
import java.util.Scanner;

class July28_class_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String a = sc.nextLine();

        System.out.println("Enter your Reg no : ");
        int b = sc.nextInt();

        System.out.println("Enter your city: ");
        String city = sc.next();

        System.out.println("Enter your Phone number : ");
        long phone = sc.nextLong();

        System.out.println("Enter your gmail id : ");
        String email = sc.next();

        System.out.println("Name : "+a);
        System.out.println("Reg no : "+b);
        System.out.println("City : "+city);
        System.out.println("Phone No : " + phone);
        System.out.println("Email ID : "+email);
    }
    
}
