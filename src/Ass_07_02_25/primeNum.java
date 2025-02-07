package Ass_07_02_25;

import java.util.Scanner;

public class primeNum {
    public static void main(String[] args)
    {
        System.out.print("Enter num:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int prime;
        if(num%2==0)
        {
            System.out.println("Number is prime.");
        }
        else
        {
            System.out.println("Not a prime.");
        }
    }
}
