package Week1;

public class Lab004_logicalOperator {
    public static void main(String[] args)
    {
        /*Logical operators
        AND Operator ( && ) – if( a && b ) [if both true execute else don’t]
        OR Operator ( || ) – if( a || b) [if one of them is true to execute else don’t]
        NOT Operator ( ! ) – !(a<b) [returns false if a is smaller than b]
            X       Y       X&&Y    X||Y     !X
            true    true    true    true    false
            true    false   false   true
            false   true    false   true    true
            false   false   false   false              */

        System.out.println("----------------Logical Operatos--------------");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y  " + (x && y));
        System.out.println("x || y  " + (x || y));
        System.out.println("!=x  " + (!x));
        System.out.println("!=y  " + (!y));

    }
}
