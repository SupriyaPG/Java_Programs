package Ex02_variablesOperators;

public class Lab035_MaxNumber {
    public static void main(String[] args)
    {
        int x=25; int y=46; int z=89;

        int ans=((x>y)?(x>z?x:z) :(y>z? y:z));
        System.out.println("Maximum Number is: "+ans);
    }
}
