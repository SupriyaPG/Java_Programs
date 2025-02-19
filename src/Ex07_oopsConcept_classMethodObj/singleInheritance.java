package Ex07_oopsConcept_classMethodObj;

class A
{
    int a=100;
    void display()
    {
        System.out.println(a);
    }
}

class  B extends  A
{
    int b=200;
    void  show()
    {
        System.out.println(b);
    }
}

public class singleInheritance
{

    public static void main(String[] args)
    {
        B obj=new B();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.show();
        obj.display();


    }
}
