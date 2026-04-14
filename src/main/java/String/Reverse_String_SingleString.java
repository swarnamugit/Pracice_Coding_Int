package String;

import java.util.Arrays;

public class Reverse_String_SingleString {
    public static void main(String[] args){

        String s="Incarcination";
        char [] c=s.toCharArray();
        System.out.println(Arrays.toString(c));
        System.out.println(c.length);


        String rev="";
        for(int i=c.length-1;i>=0;i--){
            rev+=c[i];
        }
        System.out.println(rev);

    }
}
