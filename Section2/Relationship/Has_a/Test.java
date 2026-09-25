package Section2.Relationship.Has_a;

public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee(2210, "Chandini", 75000.0, "SE", 2, "Vizianagaram", "Software");
        System.out.println("Employee id is : " + emp.id);
        System.out.println("Employee name is : " + emp.name);
        System.out.println("Employee salary is : " + emp.salary);
        System.out.println("Employee role is : " + emp.role);
        System.out.println("Employee dept No is : " + emp.dept.dno);
        System.out.println("Employee Location is : " + emp.dept.location);
        System.out.println("Employee dept Name is : " + emp.dept.dname);
    }
}
