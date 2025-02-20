package exceptionHandling;

public class multipleCatchBlock {
    public static void main(String[] args) {
        //Example we can use multiple catch blocks, but it's not possible so we can use common block
        String str=null;
        try {
            System.out.println(str.length());
        }
       /* catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
       catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }*/
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
