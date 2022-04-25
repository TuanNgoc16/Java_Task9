//Session 6
// Snippet 6
public class FinalDemo {
    final float PI = 3.14F;
    public void display ( float pi){
        System.out.println("The value of Pi: " + PI);
    }
    public static void main ( String[] args) {
        final FinalDemo objFinalDemo = new FinalDemo();
        objFinalDemo.display(22.7F);
    }
}
