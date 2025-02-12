package Ex07_oopsConcept_classMethodObj;

public class Lab073_employeeClass {

    //variables
    int eid;
    String name;
    int sal;

    //class for display
    void display()
    {
        System.out.println(eid);
        System.out.println(name);
        System.out.println(sal);
    }

    public static void main(String[] args) {
 Lab073_employeeClass ob=new Lab073_employeeClass(); //object 1
 Lab073_employeeClass obj=new Lab073_employeeClass(); //object 2
 ob.eid=101;
 ob.name="John";
 ob.sal=5000;

 obj.eid=102;
 obj.name="Smith";
 obj.sal=10000;

 ob.display();
 obj.display();
    }
}
