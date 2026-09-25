// Write a program using a sort method to print only positive numbers in an array.

package Codes_of_Arr;

public class UsingSort_printPositivenum {

    public static int[] Sort(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            int sl_inx = i;

            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[sl_inx]) {
                    sl_inx = j;
                }
            }

            int temp = num[i];
            num[i] = num[sl_inx];
            num[sl_inx] = temp;
        }

        for (int number : num) {
            if (number > 0) {
                System.out.print(number + " ");
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int[] num = {12, -4, 0, 25, -9, 7, 3};
        Sort(num);
    }
}


