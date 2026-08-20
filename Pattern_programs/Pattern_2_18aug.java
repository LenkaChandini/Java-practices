public class Pattern_2_18aug {

    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= 2 * n - 1; i++){
          int a = n;
            for(int j = 1; j <= 2 * n-1; j++){
                
                if(i + j >= n + 1 && i-j <= n - 1 && j - i <= n -1 &&  i + j <= 3 * n-1 ){
                    System.out.print(a + " ");
                } else {
                    System.out.print("  ");
                }
                 a = j< n ? --a : ++a;
            }
            System.out.println();
        }
    }
}
