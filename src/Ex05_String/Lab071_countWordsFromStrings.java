package Ex05_String;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Lab071_countWordsFromStrings {
    public static void main(String[] args) {
        String s1="Welcome to java";
        String s[]=s1.split(" ");
        int num= s.length;
        System.out.println(num+" Strings");
        System.out.println(Arrays.toString(s));
    }
}
