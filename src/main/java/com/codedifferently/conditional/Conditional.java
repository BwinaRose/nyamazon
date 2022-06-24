package com.codedifferently.conditional;

import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float highTemp = 99.0f;
        float lowTemp = 71.0f;
        System.out.println("Enter a temperature in degrees:");
        float outsideTemp = input.nextFloat();
        String output = ((outsideTemp < highTemp) && (outsideTemp>lowTemp)) ? "Let's go outside.":"Let's stay inside.";
//        if ((outsideTemp < highTemp) && (outsideTemp>lowTemp)) {
//            System.out.println("Let's go outside.");
//        }
//        else{
//            System.out.println("Let's stay inside.");
//        }
        System.out.println(output);
    }
    //Todo: create a main method
    //Todo: inside the main method create a new Scanner Object
    //Todo: Create a variable called highTemp and set its value to 99.0
    //Todo: Create a variable called lowTemp and set its value to 71.0
    //Todo: Prompt the user to enter a temperature in degrees
    //Todo: Use the scanner to collect the users input into a variable called outsideTemp
    //Todo: If outsideTemp is less than highTemp and greater than lowTemp print "Lets go outside"
    //Todo: Else print "Lets stay inside"
}
