package Ex04_Functions;

//Function is a reusable piece of code. It can have input data on which it can operate(i.e. arguments) and it can also return data by having a return type.
public class Lab028_FunctionWithoutParameterAndReturn {
    public static void main(String[] args)
    {
       System.out.println("Hi! This is main Function");
       greet();
       main();
    }

   static void greet()
    {
        System.out.println("Hello! This is Greet Function.");
    }

    static  void main()
    {
        System.out.println("This is main function.");
    }
}
