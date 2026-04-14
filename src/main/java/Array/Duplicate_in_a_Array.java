package Array;

import java.util.Scanner;

public class Duplicate_in_a_Array {
    // Duplicate in an array for String


//    public static void main (String[]args){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the array Size");
//        int size=sc.nextInt(); //{java,c,c,java,python}
//
//        String[] arr=new String[size];
//        System.out.println("Enter the array elements Strings");
//        for(int i=0;i<arr.length;i++)
//        {
//          arr[i] = sc.next();
//        }
//        for(int i=0; i<arr.length;i++)
//        {
//            for(int j=i+1;j<arr.length;j++){
//
//                if(arr[i].equals(arr[j])){
//                    System.out.println("Duplicate found"  + arr[i]);
//                }
//            }
//        }
//    }


// Duplicate in an array for Number
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array Size");
        int size=sc.nextInt(); //{java,c,c,java,python}

        int[] arr=new int[size];
        System.out.println("Enter the array elements Numbers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    System.out.println("Duplicate found:  "  + arr[i]);
                }
            }
        }
    }

}
