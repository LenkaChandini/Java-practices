// it is a example of hierarchical inheritance in java 
// Hierarchical inheritance is a type of inheritance in which multiple subclasses inherit from a single superclass. In this example, both the Dog and Cat classes inherit from the animal class.
public class Inheritance_hierarchical {
    public static void main(String[] args) {
        Dog dog = new Dog(); // creating an object of Dog class
        dog.eat(); // calling the eat() method of Dog class
        dog.bark(); // calling the bark() method of Dog class

        Cat cat = new Cat(); // creating an object of Cat class
        cat.eat(); // calling the eat() method of Cat class
        cat.meow(); // calling the meow() method of Cat class
    }
}
 

class animal { // animal class is the superclass, and Dog and Cat classes are subclasses that inherit from it.
    void eat(){
        System.out.println("Animal can eat");
    }
}

class Dog extends animal { // Extends keyword is used to inherit the properties and methods of the animal class into the Dog class.
    void bark() {
        System.out.println("Dog can bark");
    }
}

class Cat extends animal {
    void meow(){
        System.out.println("Cat can meow");
    }
}


