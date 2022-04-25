public class Furniture {
    String ID;
    float price;
    public Furniture (String ID,float price){
        this.ID= ID;
        this.price= price;
    }
    public void displayDetails (){
        System.out.println("ID" + ID);
        System.out.println("Price" + price);

    }
}
