/* Write a program to implement traffic signal simulation.
   Red    - Stop immediately
   Yellow - Be alert and get ready
   Orange - Be alert and get ready
   Green  - Go
   Any other signal - Invalid
*/

import java.util.Scanner;

public class Question_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the traffic signal: ");
        String signal = sc.nextLine();

        switch (signal) {
            case "red":
                System.out.println("Stop immediately.");
                break;

            case "yellow":
                System.out.println("Be alert and get ready.");
                break;

            case "orange":
                System.out.println("Be alert and get ready.");
                break;

            case "green":
                System.out.println("Go.");
                break;

            default:
                System.out.println("Invalid signal.");
        }
    }
}