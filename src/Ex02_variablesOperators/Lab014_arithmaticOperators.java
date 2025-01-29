package Ex02_variablesOperators;
/* In java there are various types of operators like
arithmetic(+,-,*,/,etc), logical(&&,||,!), relational(==,<>,+>,etc), and increment & decrement operations etc.

 */

public class Lab014_arithmaticOperators {
    public static void main(String[] args) {
        //arithmetic operators are symbols of arithmetic expression which operates on 2 operants
        // Declare and initialize variables
        int num1 = 10; //assignment operator(=)
        int num2 = 5;  // assignment operator(=)

        System.out.println("----------------Arithmatic Operatos--------------");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);


        // Using the + (addition) operator
        int sum = num1 + num2;
        System.out.println("The Sum is: " + sum);

        // Using the - (subtraction) operator
        int diff = num1 - num2;
        System.out.println("The Difference is: " + diff);

        // Using the * (Multiplication) operator
        int pro = num1 * num2;
        System.out.println("The multiplication is: " + pro);

        // Using the / (division) operator
        int div = num1 / num2;
        System.out.println("The division is: " + div);

    }
}
