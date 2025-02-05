package Ex05_String;

import java.awt.*;

public class Lab043_PrintEvenLengthWords {
    public static void main(String[] args)
    {
        //String program to print Even-Length words
        String s="This is a java language";

        for(String s2:s.split(" "))
        {
            if(s2.length()%2==0)
            {
                System.out.print(s2+" ");
            }
        }
    }
}
