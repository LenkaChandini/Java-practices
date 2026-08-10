/* Write a program to check whether the given alphabet is a vowel
   or a consonant using a switch statement. */

import java.util.Scanner;

public class Question_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the alphabet: ");
        char alphabet = sc.next().charAt(0);

        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("It is a Vowel.");
                break;

            default:
                System.out.println("It is a Consonant.");
        }
    }
}