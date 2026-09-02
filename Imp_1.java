class Imp_1{
    void eat() {
        System.out.println("Animal can eat");
    }
}
class Dog extends Imp_1 {
    void bark() {
        System.out.println("Dog can bark");
    }
}

class Cat extends Imp_1 {
    void meow(){
        System.out.println("Cat can meow");
    }
}
