package exceptionHandling;

import java.util.Scanner;

public class exceptionHandling3 {
    public static void main(String[] args) {
              //example3 nullPointerException
            String str="Welcome";
            try {
                int num = Integer.parseInt(str);
                System.out.println(num);
            }catch (NullPointerException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

