package Ex07_oopsConcept_classMethodObj;

//method concepts
public class greetings {
    //1.no parameters no return value
    void  m1()
    {
        System.out.println("Hello.....");
    }

    //2.No parameters return value
    String m2()
    {
        return ("How are you?");
    }

    //3. with parameter no teturn value
    void m3(String name)
    {
        System.out.println("Hello "+name);
    }

    //4. with parameter with return value
    String m4(String name)
    {
        return "Hello"+name;
    }
}
