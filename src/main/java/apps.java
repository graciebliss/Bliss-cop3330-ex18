/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit. ");
        String convert=in.nextLine();

        System.out.println("Your choice: "+convert);
        convert=convert.toUpperCase();

        int temp=0;
        String converted="Celsius";

        if(convert.equals("C")){
            System.out.print("Please enter your temperature in Fahrenheit: ");
            String current=in.nextLine();

            int currentTemp=Integer.parseInt(current);

            temp=(currentTemp-32)*5/9;
            converted="Fahrenheit";
        }
        else{
            if(convert.equals("F")){
                System.out.print("Please enter your temperature in Celsius: ");
                String current=in.nextLine();

                int currentTemp=Integer.parseInt(current);

                temp=(currentTemp*9/5)+32;
            }
        }

        System.out.print("The temperature in "+converted+" is "+temp+".");

    }
}
