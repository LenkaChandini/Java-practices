
package Codes_of_Arr;

import java.util.Arrays;

class MergeTwoArray{
    public static void main(String[] args) {
        int [] a ={10,20,30};
        int [] b = {40, 50, 60};
        int [] res = new int[a.length + b.length];
        int j = 0;
        for(int i = 0; i<res.length - 1; i++){
            if(i<a.length){
                res[i] = a[i];
            } else {
                res[i] = b[j++];
            }
        }
        System.out.println("After Merge Two Arrays : " + Arrays.toString(res));
    }
}