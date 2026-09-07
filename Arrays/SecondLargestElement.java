package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
            int[] num = { 23, 56, 12, 34, 89, 13 };
            int lg = Integer.MIN_VALUE;
            int sl = Integer.MIN_VALUE;

            for (int n : num) {
                if (n > lg) {
                    sl = lg;
                    lg = n;
                } else if (n > sl && n != lg) {
                    sl = n;
                }
        }
        System.out.println("Second-largest element: " + sl);
                
    }
        
}
