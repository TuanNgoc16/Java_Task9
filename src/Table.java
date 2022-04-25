public class Table extends Furniture {
    String type;

    public Table(String ID, float price, String type) {
        super(ID, price);
        this.type = type;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type" + type);

    }

    public static void main(String[] args) {
        Furniture obj = new Table("F001", 2000F, "Wooden");
        obj.displayDetails();
    }
}
