package Ex05_String;
//Program for remove junk or special characters in string
public class Lab070_removeJunkCharacters {
    public static void main(String[] args) {
        String s="http://youtu.be/xOsghWslbsE";
        System.out.println("Given String:"+s);
        String s2=s.replace("/","").replace(".","").replace(":","");
        System.out.println(s2);
    }
}
