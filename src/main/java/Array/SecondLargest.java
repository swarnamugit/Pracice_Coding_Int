package Array;

public class SecondLargest {
    public static void main(String args[]){


        int[] n={8,6,2,4,1,9,11};
        int large , second_large;

        if(n[0]>n[1]){
            large=n[0];
            second_large=n[1];
        }
        else
        {
            large=n[1];
            second_large=n[0];
        }

        for(int i=2; i<n.length;i++){
            if(n[i]>large){
                second_large=large;
                large=n[i];

            }
            else
            {
                if(n[i]>second_large && n[i]!=large){
                    second_large=n[i];
                }
            }
        }
        System.out.println("First largest" +large);

        System.out.println("Second largest" +second_large);

    }


}
