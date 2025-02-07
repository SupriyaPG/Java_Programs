package Assignments_10x;

public class Ass_05_01_25 {
    public static void main(String[] args)
    {

        //Assignment 1: Print no.s from 1 to 10
        printNo();

        //Assignment 2: print even no from 1 to 20
        even();

        //Assignment 3:print hello 5 time
        hello();

        //Assignment 4:sum first 10 of natural no
        sumOfNaturalNo();

        //Assignment 5; multiplication table of 5
        multiplicationTable5();

        //printing no 1 to 10 using while loop
        printNo1To10();

        //printing even no from 1 to 20 using while loop
        evenNum();

        //Printing java 5 time using while loop
        printingJava();

        //Printing first natural numbers using while loop
        naturalNum();

        //Printing multiplication table of 7
        multiplicationTable7();
    }
    static void printNo()
    {

        System.out.println("Printing no.s from 1 to 10");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }

    }
    static void even()
    {
        System.out.println("Printing even no from 1 to 20");
        for(int j=1; j<=20;j++)
        {
            if(j%2==0)
            {
                System.out.println(j);
            }
        }
    }

    static void hello()
    {
        System.out.println("Printing Hello 5 times.");
        for (int i=0;i<5;i++)
        {
            System.out.println("Hello!");
        }
    }

    static void sumOfNaturalNo()
    {
        //program for sum of natural no
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }

    static void multiplicationTable5()
    {
        int mul=0;
        System.out.println("Multiplication table of 5 :");
        for (int i=0;i<=10;i++)
        {
            mul=5*i;
            System.out.println(mul);
        }
    }

    static void printNo1To10()
    {
        System.out.println("Printing no 1 to 10 using while");
        int i=1;
        while (i <= 10)
        {
            System.out.println(i);
            i++;
        }
    }

    static void evenNum()
    {
        int i=1;
        System.out.println("Printing even no from 1 to 20");
        while (i<=20)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }
    }

    static void printingJava()
    {
        int i=1;
        while(i<=5)
        {
            System.out.println(i+":Java");
            i++;
        }
    }

    static void naturalNum()
    {
        System.out.println("Printing first 10 natural numbaers:");
        int i=0;
        while(i<10)
        {
            System.out.println(i);
            i++;
        }
    }

    static  void multiplicationTable7()
    {
        System.out.println("Multiplication table of 7:");
        int i=1;
        while (i<=10)
        {
            int mul=7*i;
            System.out.println(mul);
            i++;
        }
    }
}

