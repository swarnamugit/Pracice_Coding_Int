package StringS;

import java.util.Scanner;

public class Remove_space_in_String {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println("Before removing white spaces:  " +s);

        s=s.replaceAll("\\s","");
        System.out.println("After removing white spaces:  " +s);

    }
}
