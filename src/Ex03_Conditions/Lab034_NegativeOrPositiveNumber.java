package Ex03_Conditions;

import java.util.Scanner;

public class Lab034_NegativeOrPositiveNumber {
    public static void main(String[] args)
    {
        Scanner num=new Scanner(System.in);
        System.out.print("Enter any number:");
        int chkNum=num.nextInt();

        if(chkNum>0)
        {
            System.out.println("Number is positive.");
        }
        else {
            System.out.println("Number is negative.");
        }
    }
}
