package Ex03_Conditions;

import java.util.Scanner;

public class Lab0026_NestedForLoop {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Row no.");
        int row=sc.nextInt();

        for (int i=1; i<=row; i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
