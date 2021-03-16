package com.maxwell;

import java.util.Scanner;

public class Additionsquiz {

    public static void main(String[] args) {
        //Generate Numbers
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Display Question
        System.out.print("What is " + number1 + " + " + number2 + "? ");

        //Rx Answer
        int answer = input.nextInt();

        //Show results
        System.out.println( number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

   }
}
