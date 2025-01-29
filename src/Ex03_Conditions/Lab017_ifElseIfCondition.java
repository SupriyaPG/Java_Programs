package Ex03_Conditions;

import java.util.Scanner;

public class Lab017_ifElseIfCondition {
    public static void  main(String[] args)
    {
        System.out.println("Triangle Type based on angle.");
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter angle1 in integer=");
        int angle1=sc1.nextInt();

        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter angle2 in integer=");
        int angle2=sc2.nextInt();

        Scanner sc3=new Scanner(System.in);
        System.out.println("Enter angle3 in integer=");
        int angle3=sc3.nextInt();

        if (angle1 == 90 && angle2 == 90 && angle3 ==90)
        {
            System.out.println("The trianle is Acute angle.");
        }
        else if (angle1==90 || angle2==90 || angle3==90)
         {
             System.out.println("The triangle is Right angle.");
        }
        else
        {
            System.out.println("The triangle is Abtuse.");
        }


    }
}
