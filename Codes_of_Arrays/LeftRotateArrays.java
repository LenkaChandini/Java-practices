import java.util.Arrays;

public class LeftRotateArrays {
        public static void main(String[] args) {
        int arr [] = {34, 16, 10, 7, 45, 30, 24, 56};
        int k = arr.length;

        for (int i = 0; i < k; i++) {
            int lastElement = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = lastElement;
        }

        System.out.println(Arrays.toString(arr));
    }
}

