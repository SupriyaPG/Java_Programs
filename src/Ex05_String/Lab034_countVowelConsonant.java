package Ex05_String;

import javax.swing.*;

public class Lab034_countVowelConsonant {
    public static void main(String[] args)
    {
        String name="Pramod";

        int vow=0;
        int con=0;
        for(int i=0; i<name.length(); i++)
        {
            if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='o'
                || name.charAt(i)=='i' ||name.charAt(i)=='u')
            {
            vow++;
            }
            else
            {
                con++;
            }
                    }
        System.out.println("Name : Pramod "+"\nVowels are: " + vow);
        System.out.println("Consonants are:"+con);
    }
}
