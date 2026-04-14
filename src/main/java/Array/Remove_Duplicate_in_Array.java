package Array;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_in_Array {
    public static void main(String[] args){

        int[] a={2,2,3,1,5,1,6,7};
        System.out.println(a.length);

        Set<Integer> s=new HashSet<>();

        for(int ss:a ){
            s.add(ss);

        }
        System.out.println(s);

        

    }
}
