package exceptionHandling;

import java.util.Scanner;

public class exceptionDemo1 {
    public static void main(String[] args) {

        //Example 1 arithmetic /exception
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(100/num);
        System.out.println("Done.");

    }
}
