package Ass_19_02_25;

public class constructorOverloading {

    constructorOverloading()
    {
        System.out.println("This is constructor--->1");
    }

    constructorOverloading(String str)
    {
        System.out.println("Hello,"+str+" This is constructor---->2");
    }

    constructorOverloading(int a,int b)
    {
        int c=a+b;
        System.out.println("This is constructor 3, Addition is:"+c);
    }

    public static void main(String[] args) {
        constructorOverloading co=new constructorOverloading();
        constructorOverloading co1=new constructorOverloading("Devid");
        constructorOverloading co2=new constructorOverloading(6,9);
    }


}
