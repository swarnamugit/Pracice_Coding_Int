package String;

public class Reverse_AllWords_inString {

    public static void main(String[]args){

        String s="How're you doing";
        String[] sr=s.split(" ");

        String rev_sen="";

        for(String sa:sr){
            String rev="";

            for(int i=sa.length()-1;i>=0;i--){
                rev=rev+sa.charAt(i);
            }
            rev_sen=rev_sen+rev+" ";

        }

System.out.println(rev_sen);
    }
}
