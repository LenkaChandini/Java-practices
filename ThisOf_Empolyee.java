public class ThisOf_Empolyee {
    int id ;
    String name;
    Double salary;
    String role;

    public ThisOf_Empolyee(int id) {
        this.id = id;
    }

    public ThisOf_Empolyee(int id , String name) {
        this(id);
        this.name  = name;
    }

    public ThisOf_Empolyee(int id , String name, Double salary) {
        this(id, name);
        this.salary = salary;
    }

    public ThisOf_Empolyee(int id , String name, Double salary, String role) {
        this(id, name, salary);
        this.role = role;
    }
    public static void main(String[] args) {
        ThisOf_Empolyee e = new ThisOf_Empolyee(34, "chandini" , 3546.766, "Software Developer");
        System.out.println("Id is :" + e.id);
        System.out.println("Name is : " + e.name);
        System.out.println("Salary is : " + e.salary);
        System.out.println("Role is : " + e.role);
    }
    
    
    
}
