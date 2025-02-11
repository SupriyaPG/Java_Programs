package Ex01_BasicJava;
//Program for print larger number from given 2 numbers without if
public class Lab073_findLargerNumWithoutIf {
    public static void main(String[] args) {
        int num1=9642;
        int num2=8654;
        int i=(num1>num2?num1:num2);
        System.out.println("Larger number is:"+i);
    }
}
