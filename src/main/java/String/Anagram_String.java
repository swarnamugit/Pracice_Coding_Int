package String;

public class Anagram_String {
    public static void main(String[]args){
        String s1="kitchen";
        String s2="chicken";

        //converting them to char array
        char []c1=s1.toCharArray();
        char []c2=s2.toCharArray();

        //sort S1
        for(int i=0;i<c1.length;i++) {
            for (int j = i + 1; j < c1.length; j++) {
                if (c1[i] > c1[j]) {
                    char temp = c1[i];
                    c1[i] = c1[j];
                    c1[j] = temp;
                }
            }
        }
        String sortedS1=new String(c1);
        System.out.println(sortedS1);

        //sort S2
        for(int i=0;i<c1.length;i++) {
            for (int j = i + 1; j < c1.length; j++) {
                if (c2[i] > c2[j]) {
                    char temp = c2[i];
                    c2[i] = c2[j];
                    c2[j] = temp;
                }
            }
        }
        String sortedS2=new String(c2);
        System.out.println(sortedS2);


        if(sortedS1.equals(sortedS2)){
            System.out.println("Anagram");
        }
        else
            System.out.println("Not an Anagram");

    }
}
