// Multilevel Inheritance in Java

class Inheritance_MutilLevel {
    public static void main(String[] args) {

        Puppy puppy = new Puppy();

        puppy.eat();   // Inherited from Animal
        puppy.run();  // Inherited from Dog
        puppy.play();  // Puppy class method
    }
}

// Parent class
class Animal_1 {

    void eat() {
        System.out.println("Animal can eat");
    }
}

// Child class of Animal
class Dog_1 extends Animal_1 {

    void run() {
        System.out.println("Dog can run");
    }
}

// Child class of Dog
class Puppy extends Dog_1 {

    void play() {
        System.out.println("Puppy can play");
    }
}