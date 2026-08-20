
/* define a method to accept 3 intergers and print smallest number. */


import java.util.Scanner;
public class Question_39 {
    public static void smallest(int a, int b, int c ) {
        int min = a < b ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println(min + " It is Smallest number");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 3 numbers : ");
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
        smallest(a,b,c);
    }
}
