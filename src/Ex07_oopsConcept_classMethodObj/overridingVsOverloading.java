package Ex07_oopsConcept_classMethodObj;

class ABC
{
    void m1(int a)
    {
        System.out.println(a);
    }
    void m2(int b)
    {
        System.out.println(b);
    }
}

class  XYZ extends ABC
{

    //overriding
    @Override
    void m1(int a)
    {
        System.out.println(a*a);
    }

    void  m2(int a,int b) //overloading
    {
        System.out.println(a+b);
    }
}

public class overridingVsOverloading {
    public static void main(String[] args) {
        XYZ obj1=new XYZ();
        obj1.m1(20);
        obj1.m2(20,25);
        obj1.m2(30);
    }
}
