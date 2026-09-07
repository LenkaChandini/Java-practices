interface Father {
    void work();
}

interface Mother {
    void cook();
}

class Child implements Father, Mother {

    // Implementing Father method
    public void work() {
        System.out.println("father is working");
    }

    // Implementing Mother method
    public void cook() {
        System.out.println("mother is cooking");
    }
}

public class Main {
    public static void main(String[] args) {

        Child c = new Child();

        c.work();
        c.cook();
    }
}