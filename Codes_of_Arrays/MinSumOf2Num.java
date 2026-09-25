public class MinSumOf2Num {
    public static void main(String[] args) {
        int arr[] = {32, 65, 78, 1, 6, 89, 49, 20, 51};
        int n1 = 0;
        int n2 = 0;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i + 1; j< arr.length; j++ ) {
                int current_sum = arr[i]+arr[j];
                if(current_sum < minSum){
                    minSum = current_sum;
                    n1 = arr[i];
                    n2 = arr[j];
                }
            }
        }
        System.out.println("Minimum sum: " + minSum);
        System.out.println("Numbers: " + n1 + " and " + n2);
    }
}