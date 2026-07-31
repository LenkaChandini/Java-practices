public class July28_1 {
    public static void main(String[] args) {

        // it is if-else Statement - The if-else statement allows you to execute one block if the condition is true and another block if it is false.
        int a = 90;

        if(a < 89) {
            System.out.println("Condition is true");
        }
        else {
            System.out.println("Condition is false");
        }

        // it it nested-if Statement - A nested-if is an if statement inside another if statement. It is useful when a second condition depends on the first.
        int b = 20;

        if(b > 15){
            System.out.println("It is Smaller than 15");

            if(b == 20){
                System.out.println("It is exactly 20");
            }
        }

        //The if-else-if ladder allows multiple independent conditions to be checked in order. As soon as one condition is true, its block executes, and the rest are skipped.

        

    }
    
}
