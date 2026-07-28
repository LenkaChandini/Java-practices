public class July28_class_1 {
    public static void main(String[] args) {
        double bill = 2000;
        double discountRate = 20.0;
        double gstRate = 12.0 ;

        double billAfterDiscount = bill - (bill * discountRate)/100;
        double totalBillWithGst = billAfterDiscount + (billAfterDiscount * gstRate) /100;

        System.out.println("Total bill with GST = " + totalBillWithGst);
    }
}
