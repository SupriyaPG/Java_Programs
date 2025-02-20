package Ass_16_02_25;

public class abstractMethod {
    public static void main(String[] args) {
    book bk=new printBook("Harry Potter","J.K. Rowling",120);
    bk.getDetails();
    }
}

abstract  class book{
    String name;
    String author;
    int price;

    public book(String nm,String ath,int pr)
    {
        this.name=nm;
        this.author=ath;
        this.price=pr;

    }

    abstract void getDetails();

}

class printBook extends book
{
    public  printBook(String name,String author,int price)
    {
    super(name,author,price);
    }

    @Override
    void getDetails()
    {
    System.out.println(name+","+author+","+price);
    }

}
