package Ass_07_02_25;

public class leftAnglePattern {
    public static void main(String[] args) {

        for (int i = 4; i >= 0; i--) {
            int k = 0;
            int l=4;
            while (k < i) {
                System.out.print(" ");
                k++;
            }
            while (i<=l) {
                System.out.print("*");
                l--;
            }
            System.out.println();

        }
    }
}

