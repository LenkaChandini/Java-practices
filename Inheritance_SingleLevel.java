// Single Level Inheritance in Java
// Single level inheritance is a type of inheritance .the process of acquiring properties and methods of a one parent class by a one child class is called single level inheritance. In this example, the Dog class inherits from the animal class.

class Inheritance_SingleLevel {
    public static void main(String[] args) {
        Dog dog = new Dog(); // creating an ob.ject of Dog class
        dog.eat(); // calling the eat() method of Dog class
        dog.bark(); // calling the bark() method of Dog class
    }
}

class animal { // animal class is the superclass, and Dog class is a subclass that inherits from it.
    void eat() {
        System.out.println("Animal can eat");
    }
}   

class Dog extends animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}