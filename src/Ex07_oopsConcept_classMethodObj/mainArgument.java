package Ex07_oopsConcept_classMethodObj;
// we can pass argument values from configuration
//run-->Edit Configuration OR clicl on 3 dots besides bug sign --> Edit
public class mainArgument {
    public static void main(String[] args) {
        System.out.println(args.length);

        for (String values:args)
        {
            System.out.print(values);
        }
    }
}
