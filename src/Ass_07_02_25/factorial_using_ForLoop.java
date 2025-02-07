package Ass_07_02_25;

import java.util.Scanner;

public class factorial_using_ForLoop {
    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
      int num=0;


      num=sc.nextInt();

      for(int i=(num-1);i>0;i--)
      {
              num = num * i;
      }
        System.out.println("Factorial is:"+num);
    }
}
