package Ex07_oopsConcept_classMethodObj;

class  Bank
{
    double roi()
    {
        return 0;
    }
}

class ICICI extends Bank
{
    @Override
    double roi()
    {
        return 10.5;
    }
}

class  SBI extends  Bank
{
    @Override
    double roi()
    {
        return  11.5;
    }
}

public class overRiding {
    public static void main(String[] args) {

        System.out.println("Objecct of Bank");
        Bank b=new Bank();
        System.out.println(b.roi());

        System.out.println("Objecct of ICICI");
        ICICI ic=new ICICI();
        System.out.println(ic.roi());

        System.out.println("Object of SBI");
        SBI sb=new SBI();
        System.out.println(sb.roi());


    }
}
