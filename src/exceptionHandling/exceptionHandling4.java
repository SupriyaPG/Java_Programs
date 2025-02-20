package exceptionHandling;

public class exceptionHandling4 {
    public static void main(String[] args) {

        //Example 4 nullPointerException
        String str=null;
        try {
            System.out.println(str.length());
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage()); //throw NullPointer Exception
        }
    }
}
