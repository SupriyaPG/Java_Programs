package exceptionHandling;

import java.util.Scanner;

public class exceptionHandling2 {

    public static void main(String[] args) {


        //Example 2 arrayOutOfBound
        Scanner sc=new Scanner(System.in);
        int a[] = new int[5];
        int pos;
       System.out.println("Enter the position(0-4):");

        pos = sc.nextInt();
        System.out.println("Enter a value:");
        int value = sc.nextInt();
       try {
           a[pos] = value;
           System.out.println(a[pos]);
       }catch (ArrayIndexOutOfBoundsException e)
       {
           System.out.println(e.getMessage());
       }
        System.out.println("Done.");
    }
}
