package Section2.Relationship.Has_a;

public class Car {
    String brand;
    Double price;
    String color;
    Engine eng;
    public Car(String brand, Double price, String color, int hp, String fueltype){
        this.brand = brand;
        this.price = price;
        this.color = color;
        eng = new Engine(hp, fueltype);
    }
}
