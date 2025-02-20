package exceptionHandling;

import java.util.Scanner;

public class exceptionHandling1 {
    public static void main(String[] args) {

        //Example 1 arithmetic exception
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        try {
            System.out.println(100 / num);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Invalid value.");
            //OR
            System.out.println(e.getMessage());
        }
        System.out.println("Done.");
    }
}
