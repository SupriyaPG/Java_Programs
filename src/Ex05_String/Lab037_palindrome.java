package Ex05_String;

import java.util.Scanner;

public class Lab037_palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String chk=sc.nextLine();
        String rev="";

        for (int i=chk.length()-1;i>=0;i--)
        {
            rev=rev+chk.charAt(i);

        }

        System.out.println("Reverse string is "+rev);
        if(chk.equals(rev))
        {
            System.out.println("String is palindrome.");
        }
        else
        {
            System.out.println("String is not palindrome.");
        }

    }
}
