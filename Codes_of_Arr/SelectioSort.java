package Codes_of_Arr;

public class SelectioSort {

    public static int[] selectionSort(int[] arr){
    
    for(int i = 0; i < arr.length - 1; i++){
        int index = i;
        for(int j = i + 1; j < arr.length; j++){
            if(arr[j] < arr[index]){
                index = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
    return arr;
    }
    public static void main(String [] args){
        int arr [] = {12, 45, 78, 47, 34, 89, 98};
        System.out.println("Selection Sort Array Element :");
        for (int value : selectionSort(arr)) {
            System.out.print(value + " ");
        }
    }
}