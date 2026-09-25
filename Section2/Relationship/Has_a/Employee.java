package Section2.Relationship.Has_a;
public class Employee {
	int id;
	String name;
	Double salary;
	String role;
	Dept dept;
	public Employee(int id, String name, Double salary, String role, int dno, String location, String dname) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.role = role;
		dept = new Dept(dno, location, dname);
	}
}
