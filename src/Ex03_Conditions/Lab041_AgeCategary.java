package Ex03_Conditions;

import java.util.Scanner;

public class Lab041_AgeCategary {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age:");
        int age=sc.nextInt();

        if(age>=65)
        {
         System.out.print("Senior citizen");
        }else if (age>20 && age<65)
        {
            System.out.print("Adult");
        } else if (age>12 && age<20)
        {
            System.out.print("Teenager");
        } else if (age<12)
        {
            System.out.print("Child");
        }
    }
}
