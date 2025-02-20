package exceptionHandling;

//finally block executed anyhow although it get exception

public class finallyBlock {
    public static void main(String[] args) {
        //Example 4 nullPointerException
        String str=null;
        try {
            System.out.println(str.length());
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This is finally block.");
        }
    }
}
