package Ex06_Array;

public class Lab055_forLoop_redTwoDArray {
    public static void main(String[] args) {

        int a[][]={{11,12},
                {13,14},
                {15,16}
        };

        /*
        for(int r=0;r<=2;r++) //for loop for rows
        {
            for(int c=0;c<=1;c++) //for loop for column
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println(); // for nest line
        } */

        //using length

        for(int r=0;r<=a.length-1;r++) //for loop for rows
        {
            for(int c=0;c<=a[r].length-1;c++) //for loop for column
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println(); // for nest line
        }
    }
}
