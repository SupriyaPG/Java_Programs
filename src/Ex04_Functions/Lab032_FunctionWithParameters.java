package Ex04_Functions;

public class Lab032_FunctionWithParameters {
    public static void main(String[] args)
    {
        greetWithName("Snehal");

        int ans=add(40,50);
        System.out.println("Sum of two no is:"+ans);
    }

   static void greetWithName(String str)
   {
       System.out.println("Hi, "+str);

   }
    static int add(int x, int y)
    {
        return x+y;
    }
}
