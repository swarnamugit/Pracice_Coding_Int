package StringS;

import java.util.Scanner;

public class FInd_Vowels_in_given_String {
    public static void main (String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine(); //Hello how are you
        char[] c=s.toCharArray(); //[H,e,l,l,o, ,h,o,w, ,a,r,e, ,y,o,u]

        for(int i=0;i<c.length;i++){
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U'){
                System.out.print(c[i]);
            }
        }

    }

}
