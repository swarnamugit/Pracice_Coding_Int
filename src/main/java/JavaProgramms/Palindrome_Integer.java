package JavaProgramms;

import java.util.Scanner;

public class Palindrome_Integer {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int val=sc.nextInt();

        int org_val=val; //Whatever input i accepted from user im storing it in a avriable

        int rev=0;

        while(val!=0){

            rev=rev*10+val%10;
            val=val/10;
        }
        System.out.println("After reversing the value:"+ rev);
// After the loop the val will be Zero we cant use the same to compare thats why we stored the input in  avariable
        if(org_val==rev)
        {
            System.out.println("Given Number is a Palindrome");
        }
        else {
            System.out.println("Given Number is Not a Palindrome");
        }


    }
}
