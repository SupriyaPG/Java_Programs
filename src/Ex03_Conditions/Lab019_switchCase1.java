package Ex03_Conditions;

import java.util.Scanner;

public class Lab019_switchCase1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  number between 1 to 7: ");

        int day=sc.nextInt();

        switch (day){
            case 1: System.out.println("It is a Monday.");
            break;
            case 2: System.out.println("It is a Tuesday.");
            break;
            case 3: System.out.println("It is a Wednesday.");
            break;
            case 4: System.out.println("It is a Thursday.");
            break;
            case 5: System.out.println("It is a Friday.");
            break;
            case 6: System.out.println("It is a Saturady.");
            break;
            case 7: System.out.println("It is a Sunday.");
        }
    }
}
