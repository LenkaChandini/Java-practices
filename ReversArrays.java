
import java.util.Scanner;


public class ReversArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter 5 number : ");
        for(int i = 0 ; i < 5; i++){
        arr[i] = sc.nextInt();
        }
        System.out.println("Reverse Arrays : ");

        for(int j = 4; j >= 0 ; j--){
            System.out.print(arr[j] + " ");
        }

    }
}


