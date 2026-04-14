package StringS;

import java.util.Arrays;
import java.util.Scanner;

public class Replace_Vowels_in_Statement {
    public static void main(String[] args) {


        /*
    Replace all vowels with *
    input = "I miss Mahi"
    Convert the given string to character array
    calculate the length of the string/array and iterate
    inside the loop, check if the charAt(index) = vowels
    if its a vowel character, assign it with *
    outside the loop iterate again to print the char array

String: "hello"
After converting to char array: ['h', 'e', 'l', 'l', 'o']
Now each character has an index:
h → s[0]
e → s[1]
l → s[2]
l → s[3]
o → s[4]
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();

//        for(int i=0;i<ch.length;i++){
//            char chr=Character.toLowerCase(ch[i]); // So for changing the charcter to a upper/lowe we use Character class and store in variable
//            if(chr=='a' || chr=='e' ||chr=='i' ||chr=='o' ||chr=='u')
//            {
//                ch[i]='#';
//            }
//        }


        for (int i = 0; i < ch.length; i++) {
//            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') Failes because ch is an array ch[i] is character
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                ch[i] = '#';
            }
        }
            System.out.print(Arrays.toString(ch)); //output [w, h, #, r, #,  , #, r, #,  , y, #, #]
            System.out.print(ch); //output wh#r# #r# y##
        }
    }

