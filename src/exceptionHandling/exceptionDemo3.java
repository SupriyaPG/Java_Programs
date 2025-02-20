package exceptionHandling;

import java.util.Scanner;

public class exceptionDemo3 {
    public static void main(String[] args) {
        //example3 nullPointerException
        Scanner sc=new Scanner(System.in);
        String str="Welcome";
        int num=Integer.parseInt(str);
        System.out.println(num);
    }
}
