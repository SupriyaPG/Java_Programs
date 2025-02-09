package Array;

public class Lab056_enhancedForLoop_2DArray {
    public static void main(String[] args) {

        int a[][]={{1,2},
                {3,4},
                {5,6}
        };

        for(int arr[]:a)
        {
            for (int x:arr) //it will store values of rows one by one first row then second, so on
            {
                System.out.print(x+" "); //and print that values
            }
            System.out.println();
        }

    }
}
