package Ass_07_02_25;

import java.util.Scanner;

public class multiplicationTable_usingWhileLoop {
    public static void main(String[] args)
    {
        System.out.print("Enter a number for Multiplication:");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=1;
        int mul=0;
        while(j<=10)
        {
            mul=i*j;
            System.out.println(i+"*"+j+"="+mul);
            j++;
        }
    }
}
