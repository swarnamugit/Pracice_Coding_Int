package StringS;

import java.util.Scanner;

public class Find_occurance_of_a_character_in_string {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.next();
        s=s.toUpperCase();

        // Cap and small are different for them so we need to conver to upper/Lowe case
        System.out.println("Enter the occurance Character: ");
        char c=sc.next().charAt(0);
//        String s="Swarnamugi";
//        char toFind='u';


        int initialcount=0;


        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                initialcount++;
            }
        }
        System.out.println("No of occurences: "+initialcount);
    }
}
