/*
 * Lab 8 - develop a java program to create and outer class with a method display
 */

class Outer{
    void display(){
        System.out.println("This is the display method of Outer class ");
    }
    class Inner{
        void display(){
            System.out.println("This is the display method of Inner class");
        }
    }
}
public class OuterClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner in = o.new Inner();
        // Outer.Inner.Deeper d = in.new Deeper();
        o.display();
        in.display();
        // d.display();
    }
}