import java.util.Scanner;

/* Define a method to accept a character and print whether it is a vowel. */
public class Question_41 {

    public static void vowel(char a) {
        a = Character.toLowerCase(a);

        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.println(a + " is a vowel.");
        } else {
            System.out.println(a + " is not a vowel.");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the character:");
        char a = s.next().charAt(0);

        vowel(a);
    }
}