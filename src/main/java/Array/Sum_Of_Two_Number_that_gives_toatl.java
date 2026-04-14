package Array;

import java.util.Scanner;

public class Sum_Of_Two_Number_that_gives_toatl {
    public static void main (String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int arraysize=sc.nextInt();
        int arr[]=new int[arraysize];

        System.out.println("Enter the Array element");
        for(int i=0;i<arraysize;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target total");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i] + arr[j]==target){
                System.out.println(arr[i] +" " + "+"  + " " + arr[j] +" "+ "=" + target);

            }
            }
        }
        System.out.println("No matches found");




    }
}
