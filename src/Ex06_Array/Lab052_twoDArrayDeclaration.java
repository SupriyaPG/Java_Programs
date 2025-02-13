package Ex06_Array;

public class Lab052_twoDArrayDeclaration {
    public static void main(String[] args) {

        //two-dimensional array it has rows as well as columns
        //Approach 1
        //int a[][]=new int[3][2]; //int[3][2] it can be int[3][3] any no of rows and any no of columns

        /*
        //assigning values
        a[0][0]=101;
        a[0][1]=102;

        a[1][0]=103;
        a[1][1]=104;

        a[2][0]=105;
        a[2][1]=106;*/

        //Approach 2 this is more preferable
        int a[][]={{101,200},
            {103,104},
            {105,106}
        };
    }
}
