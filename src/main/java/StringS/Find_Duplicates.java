package StringS;

public class Find_Duplicates {
    public static void main(String[]args){

        String s="incarcination";
       String r="";

       for(int i=0;i<s.length();i++){
           if(r.indexOf(s.charAt(i))==-1){
               r=r+s.charAt(i);
           }
       }
        System.out.println(r);


    }
}
