package Array;

public class Search_Element_in_Array {
    public static void main(String[]args){

        int a[]={1,2,3,4,5};
        int search=8;
        boolean found=false; // By default boolean will be false
        for(int i=0;i<a.length-1;i++)
        {
            if(search==a[i])
            {
                found=true;
                System.out.print("Element found");
                break;
            }
//            else {
//                System.out.print("Element Not found"); this will print multiple times

            }
        if(found==true) {
            System.out.print("Element found");
            }
        else{
                System.out.print("Element Not found");
            }
        }
    }

