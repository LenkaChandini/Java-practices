/* Write a program to implement access permissions for employees.
   CEO       - Add, Delete, Remove, Read, Change
   Admin     - Read, Write, Remove
   Developer - Read, Write
   User      - Read
*/

import java.util.Scanner;

public class Question_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee role: ");
        String role = sc.nextLine();

        switch (role.toLowerCase()) {
            case "ceo":
                System.out.println("Permissions: Add, Delete, Remove, Read, Change");
                break;

            case "admin":
                System.out.println("Permissions: Read, Write, Remove");
                break;

            case "developer":
                System.out.println("Permissions: Read, Write");
                break;

            case "user":
                System.out.println("Permissions: Read");
                break;

            default:
                System.out.println("Invalid employee role.");
        }
    }
}