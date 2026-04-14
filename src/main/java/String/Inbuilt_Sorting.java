package String;

import java.util.Arrays;

public class Inbuilt_Sorting {
    public static void main(String[]args) {

        String s1 = "ricket";
        String s2 = "melon";
//convert into char
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();


        Arrays.sort(c1);
        Arrays.sort(c2);

        System.out.println((c1));
        System.out.println((c2));

        if (Arrays.equals(c1, c2)) {
            System.out.println("Anagram");
        }
        else
        System.out.println("Not an Anagram");

    }
        }

