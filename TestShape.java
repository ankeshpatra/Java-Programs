/*Develop a Java program to create a class named shape. Create three sub classes namely: circle,triangle and square, each class has
 * two member methods named draw() and erase(). Demonstrate polymorphism concepts by developing suitable methods defining member data 
 * main program.
 */

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
    void erase() {
        System.out.println("Erasing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
    void erase() {
        System.out.println("Erasing a circle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle");
    }
    void erase() {
        System.out.println("Erasing a triangle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
    void erase() {
        System.out.println("Erasing a square");
    }
}

class TestShape {
    public static void main(String[] args) {
        Shape shape;
        shape=new Circle();
        shape.draw();
        shape.erase();
        shape=new Triangle();
        shape.draw();
        shape.erase();
        shape=new Square();
        shape.draw();
        shape.erase();
        shape=new Shape();
        shape.draw();
        shape.erase();
    }
}
