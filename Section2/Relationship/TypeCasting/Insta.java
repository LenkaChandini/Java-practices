package Section2.Relationship.TypeCasting;

public class Insta extends App{
    int noofpost, nooffollowing, nooffollowers;
    public Insta(String Username, String Password,int noofpost, int nooffollowing, int nooffollowers ){
        super(Username, Password);
        this.noofpost = noofpost;
        this.nooffollowing = nooffollowing;
        this.nooffollowers = nooffollowers;
    }
}
