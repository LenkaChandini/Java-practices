//Wirte a program to print the sum of the digits in  the given a string .
package String_programs;
public class Program_3 {
    public static void main(String[] args) {
        String str = "123";
        int sum = 0;
      for(int i =0 ; i < str.length(); i++){
        char ch = str.charAt(i);
        if(Character.isDigit(ch)){ 
            sum  = sum + (ch - 48);
        }
        
        System.out.print(sum);
      }
    }
}
