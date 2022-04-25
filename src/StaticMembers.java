//Session 6
// Snippet 7
public class StaticMembers {
    public static int staticCounter = 0;
    int instanceCounter = 0;

    static {
        System.out.println("I'm a static block");
    }
    public static void staticMethod ( ){
        System.out.println("I am a static method");
    }
    public void displayCount () {
        staticCounter++;
        instanceCounter++;
        System.out.println("StaticCounter " + staticCounter);
        System.out.println("InstanceCounter  " + instanceCounter);
    }
    public static void main (String [] args ){
        System.out.println("I am main method");
        StaticMembers.staticMethod();
        StaticMembers objStatic1 = new StaticMembers();
        objStatic1.displayCount();

        StaticMembers objStatic2 = new StaticMembers();
        objStatic2.displayCount();

        StaticMembers objStatic3 = new StaticMembers();
        objStatic3.displayCount();
    }
}
