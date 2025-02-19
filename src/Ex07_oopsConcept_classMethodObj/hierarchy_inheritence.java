package Ex07_oopsConcept_classMethodObj;

class parents1
{
    int a=100;
    void  display()
    {
        System.out.println("This is Parent class:"+a);
    }
}

class child_1 extends  parents1
{
    int b=200;
    void show()
    {
        System.out.println("This is 1st child:"+b);
    }
}

class child_2 extends parents1
{
    int c=300;
    void print()
    {
        System.out.println("This is 2nd child:"+c);
    }
}


public class hierarchy_inheritence {
    public static void main(String[] args) {

        child_1 cc1=new child_1();
        System.out.println("object of child 1: "+cc1.a);
        System.out.println("object of child 1: "+cc1.b);
        cc1.display();
        cc1.show();

        System.out.println();

        child_2 cc2=new child_2();
        System.out.println("object of child 2: "+cc2.a);
        System.out.println("object of child 2: "+cc2.c);
        cc2.display();
        cc2.print();
    }
}
