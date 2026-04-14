package StringS;

import java.util.Scanner;

public class Reverse_a_String {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String value=sc.next();

        char[] s=value.toCharArray();
        String rev="";

//        for(int i=value.length()-1;i>=0;i--)// String length is a method
            for(int i=s.length-1;i>=0;i--) //Array length is property

            {
            rev=rev+s[i];
        }
        System.out.print(rev);
    }
}
