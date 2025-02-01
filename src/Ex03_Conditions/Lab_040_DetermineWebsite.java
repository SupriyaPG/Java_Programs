package Ex03_Conditions;

import java.util.Scanner;

public class Lab_040_DetermineWebsite {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter website address link:");
        String link= sc.nextLine();
        int len=link.length();
        int last=len-3;
        String dom="";
       // System.out.print("Lenght"+len);
        //System.out.print("Last"+last);

        for(int i=0; i<3;i++)
        {
           dom=dom+link.charAt(last);
           last++;

        }
        //System.out.print(dom);

        switch (dom)
        {
            case "com": System.out.print("The website type is: commercial");
                        break;
            case "net":   System.out.print("The website is: network related website.");
            break;
            case "org": System.out.print("The Website is: non profit organization.");
            break;
            case "edu":System.out.print("The website is:Educational Institute.");
            break;
            case "info":System.out.print("The website is: Informational Website");
            break;
            case "gov" : System.out.print("The website is: Government Website");
            break;
            case "xyz":System.out.print("Unknown or other type of website.");
            break;
        }



    }
}
