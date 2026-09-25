public class Prg_2_lowercase_without_usi_toLowercase {
    public static void main(String[] args) {
        String str = "CHANDINI@3146";
        String res = "";
      for(int i =0 ; i < str.length(); i++){
        char ch = str.charAt(i);
        if(ch >= 65 && ch <= 96 ){ 
            int value  = ch + 32;
            res = res+(char)value; 
        }
        else
            res= res + ch; 
        }
        System.out.println(res);
    }
}


