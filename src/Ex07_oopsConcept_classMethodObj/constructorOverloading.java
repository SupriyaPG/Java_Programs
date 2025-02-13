package Ex07_oopsConcept_classMethodObj;

public class constructorOverloading {
    public static void main(String[] args) {
        constructorClass cc=new constructorClass(); //default constructor

        System.out.println(cc.volume());

        constructorClass cc1=new constructorClass(10.5,15.5,5.0); //3 parameters constructor
        System.out.println(cc1.volume());

        constructorClass cc2=new constructorClass(10.5);
        System.out.println(cc2.volume());


    }
}
