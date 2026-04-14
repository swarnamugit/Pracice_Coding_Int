package JavaProgramms;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.Scanner;

public class Find_Position_of_Alphabets {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Alphabet: ");

        // Step 1: Get the char input
        char ch=sc.next().charAt(0);

        //Convert them either to uppercase or lower case
        //Because user might give a/A -> the ASCII value is different for both so either conver them into 1
        //ASCII A=65 and a=97
        ch=Character.toUpperCase(ch);

        //Store the character in the integer
        int asciivalue= (int)ch; //type casting
        int position=asciivalue-64;
        System.out.println("The Position of Alphabets is: "+position);


    }
}
