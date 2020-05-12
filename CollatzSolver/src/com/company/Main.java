package com.company;

import java.util.Scanner;

public class Main extends Calculation {

    public static void main(String[] args) {
        //initialize keyboard input
        Scanner keyboard = new Scanner(System.in);
        //initialize new calculation
        Calculation collatz = new Calculation();

        System.out.println("Enter a number");
        collatz.setInputNum(keyboard.nextLong());
        collatz.calculate();

        //do you want to calculate for another number
        System.out.println("Again? (Y/N) : ");
        String var = keyboard.next();
        //if user type Y run main method from beginning
        if(var.equalsIgnoreCase("Y")){
            main(null);
        }
    }
}
