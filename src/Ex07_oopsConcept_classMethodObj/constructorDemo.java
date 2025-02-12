package Ex07_oopsConcept_classMethodObj;

public class constructorDemo {
    int x,y;
    constructorDemo()  //default constructor
    {
        x=100;
        y=200;
    }

    constructorDemo(int a,int b) //parameterised constructor
    {
        x=a;
        y=b;
    }

    void sum()
    {
        System.out.println(x+y);
    }

    public static void main(String[] args) {

    constructorDemo cs=new constructorDemo(10,20);
    cs.sum();
    }
}
