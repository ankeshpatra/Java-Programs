//Multi-level Inheritance
class Animal {
    void print() {
        System.out.println("This animal is a dog");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("This dog barks");
    }
}

class Cat extends Dog {
    void meow() {
        System.out.println("This cat meows");
    }
}

//Hierarchical Inheritance
class animal extends Animal{
    void musk() {
        System.out.println("This animal musks");
    }
}

class dog extends Animal {
    void bark() {
        System.out.println("This dog bhauks");
    }
}

/**
 * Inheritance - Multilevel Inheritance
 */
public class Inheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        animal a = new animal();
        dog d = new dog();
        a.print();
        a.musk();
        d.bark();
        d.print();
        c.print();
        c.bark();
        c.meow();
    }
}