package Ex07_oopsConcept_classMethodObj.abstractDemo;

public abstract class shape {
    
    int width;
    int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public abstract void area();

}
 class rectangle extends shape {

     @Override
     public void area() {
         System.out.println("Area of rectangle:"+(width*height));
     }
 }

 class square extends shape
 {

     @Override
     public void area() {
         System.out.println("Area of square is:"+(width*height));
     }
 }

class test
{
    public static void main(String[] args)
    {
        square sq=new square();
        sq.height=45;
        sq.width=20;
        sq.area();

        rectangle rc=new rectangle();
        rc.height=8;
        rc.width=12;
        rc.area();
    }
}

