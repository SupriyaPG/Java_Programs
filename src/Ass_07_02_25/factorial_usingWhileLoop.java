package Ass_07_02_25;

import java.util.Scanner;

public class factorial_usingWhileLoop {
    public static void main(String[] args)
    {
        System.out.print("Enter num for Factorial: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int i=num-1;
        while(i>=1)
        {
            int prod=0;
            num=num*i;
            i--;
        }
        System.out.println("Factorial is= "+num);
    }
}
