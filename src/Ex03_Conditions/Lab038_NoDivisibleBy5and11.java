package Ex03_Conditions;

import java.util.Scanner;

public class Lab038_NoDivisibleBy5and11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int num=sc.nextInt();

        if((num%5==0) && (num%11==0))
        {
            System.out.println("Number is divisible by 5 and 11.");
        }
        else
        {
            System.out.println("Not divisible by 5 and 11.");
        }
    }
}
