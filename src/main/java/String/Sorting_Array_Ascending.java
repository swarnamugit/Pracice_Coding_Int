package String;

import java.util.Arrays;

public class Sorting_Array_Ascending {
        public static void main(String[]args){
            //Ascending
            //String is immutable so we can't directly sort it
        String s = "dabyZ";
        s=s.toLowerCase();
        char[] c = s.toCharArray();// {d,a,b,y}
            System.out.println(Arrays.toString(c));
            System.out.println(c.length);
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }

            }
        }

        String ss=new String(c);
        System.out.println(ss);
    }
}
