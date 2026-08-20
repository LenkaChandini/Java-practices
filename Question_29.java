/* the multi stage Order processor 
    - goal : complex multi - line blocks inside a switch expression (String Tier) 
    - "Bronze" : Apply a flat 5% discount
    - "Silver" : Apply a 10% Discount 
    - "Gold" : If the baseprice is over $500 apply a 20% discount other wise apply 15% discount
    - Any other tier no discount (refurn the base price)  */
import java.util.Scanner;

public class Question_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill : ");
        double bill = sc.nextDouble();
    

        System.out.println("Enter the tier : ");
        String card = sc.nextLine();
        double discount = 0;

        switch (card.toLowerCase()){
            case "bronze":
                discount = bill * 0.05;
                break;
            case "silver" :
                discount = bill * 0.10;
                break;
            case "gold" :
                if(bill >500){
                    discount = bill * 0.20;
                }
                else {
                    discount = bill * 0.15;
                }
                break;
            default:
                discount = 0;
                break;
            }
        System.out.println("After Discount price : " + (bill - discount));

    }
    
}
