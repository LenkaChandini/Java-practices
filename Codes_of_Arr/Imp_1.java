package Codes_of_Arr;

public class Imp_1 {
    public static void main(String [] args){
        int [] arr = {30, 10, 20, 10, 40, 20};
        System.out.println("Reverse Arrays: ");
        for(int i = arr.length-1; i >= 0; i-- ){
            System.out.print(arr[i]+ " ");
        }
    }
}
