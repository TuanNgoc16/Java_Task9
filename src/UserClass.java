//session 6
//Snippet 9
import java.util.ArrayList;

public class UserClass {
    ArrayList myCart = new ArrayList();

    public void createList () {
        myCart.add("Doll");
        myCart.add("Bus");
        myCart.add("Teddy");

        System.out.println("Cart contents are : " + myCart);
    }
    public static void main ( String [] args) {
        UserClass objUser = new UserClass();
        objUser.createList();

        StaticMembers objStatic = new StaticMembers();
        objStatic.displayCount();
    }



}
