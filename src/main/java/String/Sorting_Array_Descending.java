package String;

import java.util.Arrays;

public class Sorting_Array_Descending {
        public static void main(String[]args){
            //Ascending
            //String is immutable so we can't directly sort it
        String s = "daby";
        char[] c = s.toCharArray();// {d,a,b,y}
            System.out.println(Arrays.toString(c));
            System.out.println(c.length);


            for (int i = c.length-1; i >=0; i--) {
            for (int j = i - 1; j>=0; j--) {
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
