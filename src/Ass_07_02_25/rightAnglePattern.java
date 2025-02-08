package Ass_07_02_25;

import java.text.Format;

public class rightAnglePattern {
    public static void main(String[] args)
    {
        for (int i=1;i<6;i++)
        {
            for (int j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
