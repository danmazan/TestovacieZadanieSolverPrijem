package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        boolean finish = false;

        while (!finish) {
            //initialize new calculation
            Calculation collatz = new Calculation();
            boolean correctValue = false;
            long userInput = 0;
            do {
                Scanner keyboardLong = new Scanner(System.in);
                System.out.println("Enter a number");
                try {
                    userInput = keyboardLong.nextLong();
                } catch (InputMismatchException e) {
                    System.out.println("String not accepted");
                }
                if (userInput > 0) {
                    correctValue = true;
                } else {
                    System.out.println("wrong value");
                }
            } while (!correctValue);
            collatz.setInputNum(userInput);
            collatz.calculate();


            System.out.println("Press any key to repeat or N to finish");
            Scanner keyboard = new Scanner(System.in);
            String repeat = null;
            try {
                repeat = keyboard.next();
            } catch (InputMismatchException e) {
                System.out.println("numbers not accepted");
            }
            if (repeat.equalsIgnoreCase("N")) {
                finish = true;
            }
        }
    }
}
