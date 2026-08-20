
class Pattern_1__18aug {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            char c = 'a';
            for(int j = 1; j <= 2*n-1; j++){
                if(i+j <= n + 1 && j-i <= n - 1){
                    System.out.print(j<= n ? c++ +" " : c-- +" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}