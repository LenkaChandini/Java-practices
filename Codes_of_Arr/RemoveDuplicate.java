package Codes_of_Arr;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {23, 65, 11, 90, 11, 34, 23, 56, 44, 23, 90, 84};

       for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[count - 1]) {
                arr[count] = arr[i];
                count++;
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
