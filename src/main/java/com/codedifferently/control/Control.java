package com.codedifferently.control;

import java.util.Scanner;
public class Control {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: \n>>> ");
        int number = input.nextInt();
        for (int i = 1; i<=number; i+=2){
            System.out.print(i+" ");
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
        }
    }
    //Todo: create a main method
    //Todo: inside the main method create a new Scanner Object
    //Todo: prompt the user a number
    //Todo: Use the scanner object to store the value entered by the user in a variable
    //Todo: Create a for-loop to print only the ODD numbers from 1 to the number entered by the user.
}
