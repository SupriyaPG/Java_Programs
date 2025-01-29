package Ex03_Conditions;

public class Lab022_ForLoopWithIfElse {
    public static void main(String[] args)
    {
        //Scanner sc=new Scanner();
        //System.out.println("Enter your a number: ");
        //int num=sc.nextInt();

        for(int i=0; i<=10; i++)
        {
            if(i%2==0)
            {

                System.out.println(i +" is even.");
            }
            else
            {
                System.out.println(i + " is Odd.");
            }
        }
    }
}
