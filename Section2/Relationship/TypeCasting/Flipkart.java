package Section2.Relationship.TypeCasting;

public class Flipkart extends App{
    int nooforders, noofwishlistprod, noofwalletcash;
    public Flipkart (String Username, String Password, int nooforders, int noofwishlistprod, int noofwalletcash){
        super(Username, Password);
        this.nooforders = nooforders;
        this.noofwishlistprod = noofwishlistprod;
        this.noofwalletcash = noofwalletcash;
    }
}
