/* Write a program to calculate the fine imposed for traffic rules based on the vehicle speed.

   - If the speed is less than or equal to 60 km/h, no fine.
   - If the speed is between 61 and 80 km/h, fine is ₹100.
   - If the speed is between 81 and 120 km/h, fine is ₹1000.
   - If the speed is greater than 120 km/h, punishment is 5 years imprisonment.
*/

import java.util.Scanner;

class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the vehicle speed: ");
        int speed = sc.nextInt();

        String result = (speed <= 60) ? "No Fine" : (speed <= 80) ? "Fine: ₹100" : (speed <= 120) ? "Fine: ₹1000" : "Punishment: 5 Years Imprisonment";

        System.out.println(result);
    }
}