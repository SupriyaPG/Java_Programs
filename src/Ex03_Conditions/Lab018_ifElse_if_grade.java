package Ex03_Conditions;

import java.util.Scanner;

public class Lab018_ifElse_if_grade {
    public static void main(String[] args)
    {
        int totalMarks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total Marks of the student: ");
        totalMarks=sc.nextInt();

        double perc=(totalMarks * 100)/600;
        String grade; //Declaring grade variable outside if_else block

        if(perc >= 80)
        {
            grade="A+";
        }
        else if (perc >=70)
        {
            grade="B+";
        }
        else
        {
            grade = "B";
        }
        System.out.println("The percentage of the student is : " + perc);
        System.out.println("The grade is: " + grade);
    }
}
