package Ex05_String;

public class Lab044_InsertIntoAnotherString {
    //String program to insert into a another string ex.insert and into DevelopTest
    public static void main(String[] args)
    {
        //By concatination
        String s="DevelopTest";
        String s1=s.substring(0,7);
        String s2=s.substring(7,11);
        String ans=s1.concat(" and ");
        ans=ans.concat(s2);
        System.out.println(ans);

        //by using for loop

        for(int i=0; i<s.length();i++)
        {
            String newString="";
            newString+=s.charAt(i);

            if(i==7)
            {
                newString+=" and ";
            }

        }
        System.out.println(ans);

    }
}
