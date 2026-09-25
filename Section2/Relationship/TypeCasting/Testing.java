package Section2.Relationship.TypeCasting;

public class Testing {
    public static void details(App a){
        if (a == null) {
            return;
        }
        if(a instanceof Insta){
            Insta i = (Insta)a;
            System.out.println("--------Instagram------------");
            System.out.println("No of post is : " +i.noofpost);
             System.out.println("No of following is : " +i.nooffollowing);
              System.out.println("No of followers is : " +i.nooffollowers);
        } else if(a instanceof Flipkart){
            System.out.println("--------Flipkart------------");
            Flipkart f = (Flipkart)a;
            System.out.println("No of orders is : " +f.nooforders);
            System.out.println("No of wishlist productds  is : " +f.noofwishlistprod);
            System.out.println("No of Wallet Cash is : " +f.noofwalletcash);
        } else if(a instanceof Whatsapp){
            System.out.println("--------WhatsApp------------");
            Whatsapp w = (Whatsapp) a;
            System.out.println("No of contacts Number is : "+w.noofcontacts);
        }
        System.out.println("Username is : "+a.username);
        System.out.println("password is : " +a.password );
    } 
    public static void main(String[] args) {
        Insta i = new Insta("Chandini", "chandini@123", 3, 178, 245);
        details(i);
        Flipkart f = new Flipkart("panda", "panda@28", 7, 234, 7500);
        details(f);
        Whatsapp w =new Whatsapp("Rinku","panda@12", 234);
        details(w);

    }
}
