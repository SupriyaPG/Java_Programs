package Ex06_Array;

//finding element in a array or Linear search

public class Lab060_searchingElementArray {
    public static void main(String[] args) {

        int a[]={10,20,30,40,50};
        int serach_element=30;
        boolean flag=false;

        for(int x:a)
        {
            if(x==serach_element)
            {
                System.out.println("Element found.");
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("Element not found.");
        }
    }
}
