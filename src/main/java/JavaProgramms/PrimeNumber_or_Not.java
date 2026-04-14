package JavaProgramms;

import java.util.Scanner;


/*
1. Number should be >1 or not
2. Number should have only 2 factors one and itself
 */
public class PrimeNumber_or_Not {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();

        int count=0; //creating one more varibale to check how many factors are there.
        if(num>1){
            //It will divide this number by 1 and the number itself
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }

            if(count==2){
                System.out.println("Its a prime Number");
            }
            else
                System.out.println("Its Not a prime Number");


        }
    }
}
