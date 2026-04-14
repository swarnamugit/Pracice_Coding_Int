package Array;

import java.util.Scanner;

public class Max_Min_ina_Array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int size=sc.nextInt();

        int [] arr= new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //Maximun
        int max=arr[0]; //considering number in index 0 as maximum
        for(int i=1;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            System.out.println("Maximum number is:   " + max);

        //Minimum
        int min=arr[0]; //considering number in index 0 as minimum
        for(int j=1;j<arr.length;j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
            System.out.println("Minimum number is:   " + min);


    }
}
