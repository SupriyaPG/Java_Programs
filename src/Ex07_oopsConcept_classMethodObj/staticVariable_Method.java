package Ex07_oopsConcept_classMethodObj;

public class staticVariable_Method {
    static  int a=10; //static variable
    int b=20;
    static  void m1()  //static method
    {
        System.out.println("This is static m1 method...");
    }

    void m2()
    {
        System.out.println("This is non-static m2 method....");
    }

//     public static void main(String args[])
//     {
//       System.out.println(a); //static variable can called without object
//        m1(); //static method can call without obj
//       staticVariable_Method sm=new staticVariable_Method();
//       sm.m2();// non-static method can call only with object
//       System.out.println(sm.b);// non-static variable can call only with object
// }
}
