package Array;

import java.util.Scanner;

public class Even_Odd_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the Elements of the Array");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        // Even Number
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.println("Even Numbers are   " + arr[i]);

        }
        // Odd Number
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] % 2 != 0)
                System.out.println("odd Numbers are   " + arr[j]);
            }

        }

    }




