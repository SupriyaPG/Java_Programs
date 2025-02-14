package Ex07_oopsConcept_classMethodObj;

public class accountMain_Encapsulation {

    public static void main(String[] args) {
        accountClass_Encapsulation ac=new accountClass_Encapsulation();
        ac.setAccno(101);
        ac.setName("John");
        ac.setAmount(50000);

        System.out.println(ac.getAccno());
        System.out.println(ac.getName());
        System.out.println(ac.getAmount());
    }
}
