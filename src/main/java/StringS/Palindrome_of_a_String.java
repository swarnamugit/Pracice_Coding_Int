package StringS;

import java.util.Scanner;

public class Palindrome_of_a_String {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.next(); // "Hello"
        char[] sArray=s.toCharArray(); //[H,e,l,l,o]

        String rev="";

        for(int i=sArray.length-1;i>=0;i--) {
            rev = rev + sArray[i];
        }
        System.out.println("Reversed String:" + rev);


        if(s.equals(rev))
        {
            System.out.println("Given String is a Palindrome");
        }
        else {
            System.out.println("Given String is Not a Palindrome");
        }

    }
        }



