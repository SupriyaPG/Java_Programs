package Ex07_oopsConcept_classMethodObj;

class  parent1
{
    int a=100;
    void  display()
    {
        System.out.println(a);
    }
}

class parent2 extends parent1
{
    int b=200;
    void show()
    {
        System.out.println(b);
    }
}

class child extends parent2
{
    int c=300;
    void print()
    {
        System.out.println(c);
    }
}


public class multiLevel_Inheritance
{
    public static void main(String[] args) {

    child pp=new child();

    System.out.println(pp.a);
    pp.display();

    System.out.println(pp.b);
    pp.show();

    System.out.println(pp.c);
    pp.print();
    }

}
