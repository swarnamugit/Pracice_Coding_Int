package StringS;

public class Vowels_and_consonants
{
    public static void main(String[]args){

        String s="swarnamughi";


        String strV="";
        String strC="";

        int vowels=0;
        int cons=0;
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'){
                vowels++;
                strV=strV+c[i];
            }
            else {
                cons++;
                strC = strC + c[i];
            }

        }
        System.out.println(strV);
        System.out.println(strC);



    }
}
