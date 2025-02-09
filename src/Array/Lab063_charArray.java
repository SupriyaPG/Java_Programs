package Array;

import java.util.Arrays;

public class Lab063_charArray {
    public static void main(String[] args) {

        char c[]={'a','f','e','b'};

        System.out.println(Arrays.toString(c));//before sorting

        Arrays.sort(c);
        System.out.println(Arrays.toString(c));//After sorting
    }
}
