package Codes_of_Arr;

import java.util.Arrays;

class ReverseArrayWithUsingNewArray{
    public static void main(String[] args) {
        int [] arr1 = {12, 45, 7, 98, 15, 23};
        int [] arr2 = new int[arr1.length];
        int j = 0;
        for(int i = arr1.length - 1; i>=0;i--){
            arr2[j] = arr1[i];
            j++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}