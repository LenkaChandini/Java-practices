public class July30_class2 {
    public static void main(String[] args) {
        int num = 7;
        int result = num++;  // Post - Increment: in post increment  first the value of a varible will get executed. then it will be updated by one 

        /*  
        example:  
        int a = 10;
        int b = a++;
        System.out.println(a); ---> output: 11
        System.out.println(b); ---> output: 10
         */

        int a = 67;
        int b = ++a; // pre - increment : in case of pre increment first the variable will be increment by one and then value of variable will get executed...
        
        System.out.println("Post-increment : "+result);

        System.out.println("Pre-increment : " + b);
        
    }
}
