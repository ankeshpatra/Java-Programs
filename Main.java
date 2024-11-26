/**Develop a Java program to create an abstract class shape with abstract methods calculateArea() and calculatePerimeter().
 * Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape
 *///lab-6
import java.util.Scanner;
abstract class Shape{
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
class Circle extends Shape{
    int radius;
    final float pi = 3.14f;
    Circle(int radius){
        this.radius = radius;
    }
    void calculateArea(){
        System.out.println("Area of Circle: "+(pi*radius*radius));
    }
    void calculatePerimeter(){
        System.out.println("Perimeter of Circle: "+(2*pi*radius));
    }
}
class Triangle extends Shape{
    int side1,side2,side3;
    Triangle(int side1,int side2,int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    void calculateArea(){
        int s = (side1+side2+side3)/2;
        System.out.println("Area of Triangle: "+Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
    }
    void calculatePerimeter(){
        System.out.println("Perimeter of Triangle: "+(side1+side2+side3));
    }
}
public class Main{
    public static void main(String[] args) {
        Shape sh;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle: ");
        sh=new Circle(scanner.nextInt());
        sh.calculateArea();
        sh.calculatePerimeter();
        System.out.println("Enter the sides of Triangle: ");
        sh=new Triangle(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        sh.calculateArea();
        sh.calculatePerimeter();
        scanner.close();
    }
}