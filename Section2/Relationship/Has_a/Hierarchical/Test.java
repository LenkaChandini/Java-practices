package Section2.Relationship.Has_a.Hierarchical;


public class preson {
    String name ;
    int age;
    String gender;
    long phoneNo;
    public preson(String name, int age, String gender, long phoneNo){
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNo = phoneNo;
    }
    public void detpre(){
        System.out.println("person name is : " +name );
        System.out.println("person age is : " +age );
        System.out.println("person gender is : " +gender );
        System.out.println("person phone no is : " +phoneNo );
    } 
}

public class student extends preson{
    int rollno;
    String course;
    public student(String name, int age, String gender, long phoneNo, int rollno, String course){
        super(name, age, gender, phoneNo);
        this.rollno = rollno;
        this.course = course;
    }
    public void detstud(){
        detpre();
        System.out.println("Studen ");
    }
}
public class emp extends preson{

}

public class Test {
    public static void main(String[] args) {
        student stu = new student();

        emp e = new emp();
    }
}