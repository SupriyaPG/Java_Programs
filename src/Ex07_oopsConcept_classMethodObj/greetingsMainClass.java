package Ex07_oopsConcept_classMethodObj;

public class greetingsMainClass {
    public static void main(String[] args) {
        greetings gr=new greetings();
        gr.m1(); //method1

        String str=gr.m2(); //method2
        System.out.println(str);

        gr.m3("John"); //method3

        String str1=gr.m4("David");
        System.out.println(str1);

    }
}

