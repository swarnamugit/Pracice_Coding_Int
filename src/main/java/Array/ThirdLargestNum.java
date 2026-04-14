package Array;

import java.util.Arrays;

public class ThirdLargestNum {
    public static void main(String args[]){
        //FInding the second largest number in a Array

        int[] num={10,20,30,40,45,36,22};
        System.out.println(Arrays.toString(num));


        int large,second_large,third_large;
        if(num[0]>num[1] &&num[0]>num[2]){
            large=num[0];
            second_large=num[1];
            third_large=num[2];
        }
        else if(num[1]>num[0] && num[1]>num[2]) {
            second_large = num[0];
            large = num[1];
            third_large=num[2];
        }
        else {
            third_large = num[0];
            large = num[1];
            second_large = num[2];
        }

        for(int i=3;i<num.length;i++) {
            if (num[i] > large) {
                third_large=second_large;
                second_large = large;
                large = num[i];
            } else if

            (num[i] > second_large && num[i] != large) {
                third_large=second_large;
                second_large = num[i];
            }
            else {
                if(num[i]>third_large && num[i]!=large && num[i]!=second_large){
                    third_large=num[i];
                }
            }
        }


        System.out.println("First largest number: "+large);
        System.out.println("second largest number: "+second_large);
        System.out.println("third largest number: "+third_large);





    }


}
