
package Arrays;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[5];

            System.out.println("Enter 5 numbers:");

            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Reverse Array:");

            for (int i = 4; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}