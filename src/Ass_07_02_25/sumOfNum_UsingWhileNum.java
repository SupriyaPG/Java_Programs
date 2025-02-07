package Ass_07_02_25;

public class sumOfNum_UsingWhileNum {
    public static void main(String[] args)
    {
        System.out.print("Sum of number 1 to 100 : ");
        int i=0;
        int sum=0;
        while(i<100)
        {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
