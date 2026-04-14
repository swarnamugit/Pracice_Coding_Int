package StringS;

import java.util.Scanner;

public class Reverse_words_in_sentence {
    public static void main(String[] args) {

        /*
        1. Get input
        2. split using " " (space) and store in string array
        3. Apply reverse condition
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sa = s.split(" ");
        String rev="";

        for(String ss:sa) {
            String revss = "";
            for (int i = ss.length() - 1; i >= 0; i--) {
                revss = revss + ss.charAt(i);
            }
             rev= rev+revss+" ";
        }
        System.out.println(rev);

    }
    }
