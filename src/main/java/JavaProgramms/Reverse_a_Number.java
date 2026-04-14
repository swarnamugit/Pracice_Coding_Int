package JavaProgramms;

import java.util.Scanner;

public class Reverse_a_Number {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int val=sc.nextInt();

        int rev=0;
        while(val!=0)
        {
            rev=rev*10+val%10;
            val=val/10;

        }
        System.out.println("After reversing:" + rev);
    }
}
