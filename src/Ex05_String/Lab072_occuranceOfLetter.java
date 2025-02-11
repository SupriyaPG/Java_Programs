package Ex05_String;

public class Lab072_occuranceOfLetter {
    public static void main(String[] args) {
        String s1="https://youtu.be/jbGxTiObi7c";
        char c='b';
        int count=0;
        for (int i=0;i<s1.length();i++)
        {
            char chk=s1.charAt(i);
          if(c==chk)
          {
              count++;
          }
        }
        System.out.println("Character b is occurs in a string "+count+" times");
    }
}
