package Ex05_String;

import java.awt.*;
import java.lang.reflect.Array;

//Program to check Anagram string (A string when it contains the same characters, only the order of characters can be different)
public class Lab045_CheckAnagramString {
    public static void main(String[] args)
    {
        String s1="Listen";
        String s2="Silent";

        String ls1=s1.toLowerCase();
        String ls2=s2.toLowerCase();
        String flag="";

        int j;
        if((ls1.length())==(ls2.length())) {
            for (j = 0; j <=ls2.length() - 1; j++) {
                char c = ls1.charAt(j);
                String str = Character.toString(c);
                if (ls2.contains(str)) {
                   // System.out.println("Contains " + str);
                    flag="true";
                } else {
                    System.out.println("Not Contains " + str);
                    flag="false";
                    break;
                }

            }
            if(flag=="true")
            {
                System.out.println("Strings are Anagram");
            }
            else
            {
                System.out.println("Not anagram");
            }
        }
        }



}
