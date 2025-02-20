package Ass_19_02_25;

public class parameterisedConstructor {
    parameterisedConstructor(String name,int sal)
    {
        System.out.println("Your name: "+name+"\nSalary:"+sal);

    }

    public static void main(String[] args) {

        parameterisedConstructor pc=new parameterisedConstructor("Kevin",2000);

    }
}
