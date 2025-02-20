package exceptionHandling;

import java.util.Scanner;

public class exceptionDemo2 {
    public static void main(String[] args) {


        //Example 2 arrayOutOfBound
        Scanner sc=new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the position(0-4):");
        int pos = sc.nextInt();
        System.out.println("Enter a value:");
        int value = sc.nextInt();
        a[pos] = value;

        System.out.println(a[pos]);
    }
}
