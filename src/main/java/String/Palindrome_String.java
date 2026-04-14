package String;

public class Palindrome_String {

    public static void main(String[] args){

    String s="ring";
    System.out.println(s.length());
    String rev="";
    for(int i=s.length()-1;i>=0;i--){
        rev=rev+s.charAt(i);
    }
        System.out.println(rev);

    if(rev.equalsIgnoreCase(s)){
        System.out.println("Palindrome");

    }
    else
        System.out.println("Not Palindrome");

    }
}
