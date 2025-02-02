package Ex05_String;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Lab042_StringBasics {
    public static void main(String[] args)
    {
        String str1="Hello";  // Creates or reuses "Hello" in the string pool
        String str2="Hello";   //reuses "Hello" in the string pool
        String str3= new String("Hello"); //Creates new string object in heap area

        System.out.println(str1==str2);    //true, both strigs refers to same object in the pool
        System.out.println(str1==str3);   //false, str3 is a new object in th heap
        System.out.println(str1.equals(str3));    //true, because content is same


        //Practice
        String name="Sonal";
        String name2="Sonal Patel";

        //1.charAt()
        System.out.println(name.charAt(3));

        //2.concat()
        System.out.println(name.concat("Patel"));

        //3.Contains()
        System.out.println(name.contains("Sonal"));

        //4.equals()
        System.out.println(name.equals("Sonal"));

        //5.equalgnoreCase
        System.out.println(name.equalsIgnoreCase("sonal"));

        //6.indexOf()
        System.out.println(name.indexOf("o"));

        //7.length()
        System.out.println(name.length());

        //8.replace( , )
        System.out.println(name.replace("n","N"));

        //9. split()
        String str4="Harish Patel";
        String[]  split=name.split("");
        System.out.println(Arrays.toString(split));
        System.out.println(split[0]);
        System.out.println(split[1]);

        //10 Substring( , )
        System.out.println(name.substring(1,3));

        //11.toLowerCase()
        System.out.println("SONAL".toLowerCase());

        //12.toUpperClass
        System.out.println("sonal".toUpperCase());

        //13.replaceAll()
        System.out.println(name2.replaceAll(" ","Harish"));

        //14.startWith()
        System.out.println(name.startsWith("S"));

        //15.endsWith
        System.out.println(name.endsWith("a"));

        //16.isEmpty()
        System.out.println(name.isEmpty());

        //17.trim()
        String name3="     Sonal Harish     ";
        System.out.println(name.trim());

        //18.compareTo
        System.out.println(name.compareTo("sonal"));

        //19.lastIndexOf
        System.out.println(name.lastIndexOf("a"));

        //20.compareToIgnoreCase
        System.out.println(name.compareToIgnoreCase("sonal"));

        //21.repeat()
        System.out.println(name.repeat(2));


        StringBuilder sb=new StringBuilder("Hi");
        sb.append(" It's my world.");
        System.out.println(sb.toString());

        String s1="Hello";
        String s2=" world";
        String s3=s1+s2; //create a new string "Hello World"
        System.out.println(s3);
        System.out.println(s1);


    }
}
