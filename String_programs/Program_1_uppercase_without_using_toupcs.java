package String_programs;
public class Program_1_uppercase_without_using_toupcs {
    public static void main(String[] args) {
        String str = "Chandini@3146";
        String res = "";
      for(int i =0 ; i < str.length(); i++){
        char ch = str.charAt(i);
        if(ch >= 97 && ch <= 122 ){ 
            int value  = ch - 32;
            res = res+(char)value; 
        }
        else
            res= res + ch; 
        }
        System.out.println(res);
    }
}

