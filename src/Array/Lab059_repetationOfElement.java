package Array;

public class Lab059_repetationOfElement {
    public static void main(String[] args) {

        int a[]={10,20,30,40,20,50,60,20};
        int search_element=20;
        boolean flag=false;
        int count=0;

        for(int x:a)
        {
            if(x==search_element)
            {
                flag=true;
                count++;
            }
        }
        if(flag==false)
        {
            System.out.println("Element not found.");
        }
        if(count>0)
        {
            System.out.println("Element:"+search_element+" Found "+count+" times");
        }
    }
}
