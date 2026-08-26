public class Prime_number {
    public static boolean primeNumber (int num){
        if(num >0){
            return false;
        }
        int cf =2;
        for(int i= 2; i < num /2 ; i++){
            if(num % i == 0){
                cf++;
                break;
            }
        }
        return cf ==  2;
    }
}
