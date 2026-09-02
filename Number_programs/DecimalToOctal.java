
/* wirte a program to convert Decimal number to Oatal binary.  */

import java.util.Scanner;

class DecimalToOatal {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int  num = sc.nextInt();

        String o = "";
        while( num != 0){
            int rem = num % 8;
            o = rem + o;
            num /= 8;
        }
        System.out.println(o);
    }
}