package Ex03_Conditions;

import java.util.Scanner;

public class Lab039_ConvertingDaysIntoYear {
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter days: ");
        int num= sc.nextInt();
        int year=0;
        int month=0;
        int days=0;
        int bal=0;

        year=num/365;
        bal=num%365;

        if(bal>30) {
            month = bal / 30;
            days=bal%30;
        }
        else
        {
            days=bal%30;
        }
        System.out.println("Year="+year+"\nMonth="+month+"\ndays="+days);
    }
}
