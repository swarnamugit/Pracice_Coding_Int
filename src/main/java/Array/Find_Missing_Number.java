package Array;

import java.util.Scanner;

public class Find_Missing_Number {
    public static void main(String[] args){

        /*conditions
        1.int[] a={1,2,3,5}
        2. No Duplicates should be there
        3. Array no need to be in sorted order
        4. The may not be sorted but needs to be in range like 1-5 / 10-15 not like 3,12,7,20

        1.Find the SUM of the elements in the array 1+2+3+5=11 / 1+2+3+4+5=12 /
        2. we can write as 1+2+3+x+5=15 => 11+x=15
        3. (or) sum1= 1+2+3+5=11 //sum of elements inside the array
        4. sum of the range sum2=1+2+3+4+5=12

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int size=sc.nextInt();

        int[] ele=new int [size];

        System.out.println("Enter the Elements in an array");
        for(int i=0;i<ele.length;i++){
            ele[i]=sc.nextInt();
        }
            int sum1=0;
        for(int i=0;i<ele.length;i++){
            sum1=sum1+ele[i];
        }
        System.out.println("Sum of Element inside the Array"+ sum1);

        int sum2=0;
        for(int i=1;i<=ele.length+1;i++){
            sum2=sum2+i;
        }
        System.out.println("Sum of Element in the Array"+ sum2);

        int findx=sum2-sum1;
        System.out.println("Missing number" + findx);
    }
}
