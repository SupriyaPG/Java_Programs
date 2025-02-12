package Ex07_oopsConcept_classMethodObj;

public class Lab074_studentClass {

    int sid;
    String sname;
    int marks;

    void display()
    {
        System.out.println("Student Id"+sid);
        System.out.println("Student Name: "+sname);
        System.out.println("Marks: "+marks);
    }

    public static void main(String[] args) {
        Lab074_studentClass obj1=new Lab074_studentClass();
        Lab074_studentClass obj2=new Lab074_studentClass();

        obj1.sid=1;
        obj1.sname="Kiran";
        obj1.marks=463;

        obj2.sid=2;
        obj2.sname="Ravi";
        obj2.marks=380;

        obj1.display();
        obj2.display();
    }
}
