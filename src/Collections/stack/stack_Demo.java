package Collections.stack;

import java.util.Iterator;
import java.util.Stack;

public class stack_Demo {

    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();

        stack.push("Anu");
        stack.push("Renu");
        stack.push("Sonu");
        stack.push("Monu");

        //iterate for the stack
        Iterator<String> itr=stack.iterator();

        //printing the stack
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
    }
}
