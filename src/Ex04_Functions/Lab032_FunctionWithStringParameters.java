package Ex04_Functions;

public class Lab032_FunctionWithStringParameters {
    public static void main(String[] args)
    {
        String name=greetWithName("Snehal");
        int ans=add(40,50);
        System.out.println("Sum of two no is:"+ans);
    }

   static String greetWithName(String str)
   {
       System.out.println("Hi, "+str);
       return str;
   }
    static int add(int x, int y)
    {
        return x+y;
    }
}
