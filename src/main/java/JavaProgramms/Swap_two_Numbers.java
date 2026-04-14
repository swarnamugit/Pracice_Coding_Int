package JavaProgramms;

import java.util.Scanner;

public class Swap_two_Numbers {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2=sc.nextInt();
        System.out.println("Before Swapping First Number: "+n1);
        System.out.println("Before Swapping Second Number: "+n2);

        //With 3rd variable

   /*     int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("After Swapping First Number: "+n1);
        System.out.println("After swapping Second Number: "+n2);
    */

        // Without 3rd variable temp
        //Formula
        n1=n1-n2; // eg n1=10, n2=20 => n1=10-20=-10
        n2=n1+n2; //n2= -10+20= 10
        n1=n2-n1; // n1= 10-(-10)=20

        n1=n1*n2;
        n2=n1/n2;
        n1=n1/n2;
        System.out.println("After Swapping First Number: "+n1);
        System.out.println("After swapping Second Number: "+n2);

    }

}
