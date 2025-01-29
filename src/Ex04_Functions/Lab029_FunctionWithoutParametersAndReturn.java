package Ex04_Functions;

public class Lab029_FunctionWithoutParametersAndReturn {
    public static void main(String[] args)
    {
        int ageToVotePerson=age();
        System.out.println("Age to vote is:" +ageToVotePerson);
    }

    static int age()
    {
        System.out.println("Calculating age...");
        return 18;
    }
}
