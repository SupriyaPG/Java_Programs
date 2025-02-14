package Ex07_oopsConcept_classMethodObj;

//when static variables,methods contains in a separate class and main method too
public class staticMain {

//    public static void main(String args[])
//    {
//        System.out.println(a); //static variable can not call in separate main method without class or object
//        m1(); //static method can not call in separate main method without class or obj
//    }
public static void main(String args[])
{
    System.out.println(staticVariable_Method.a); //static variable can called with class
    staticVariable_Method.m1(); //static method can call with class
    staticVariable_Method sm=new staticVariable_Method();

    System.out.println(sm.b); //non-static variable can call only with obj
    sm.m2(); //non-static variable can call only with obj
}
}
