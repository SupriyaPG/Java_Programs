package Ex07_oopsConcept_classMethodObj;

//creating multiple construcor means constructor overloading
public class constructorClass {

    double width,height,depth;

    constructorClass()
    {
        width=height=depth=0;
    }

    constructorClass(double a, double b, double c)
    {
        width=a;
        height=b;
        depth=c;
    }

    constructorClass(double len)
    {
        width=height=depth=len;
    }
    double volume()
    {
        return (width*height*depth);
    }
}
