package com.company;

public class Calculation {

    public long inputNum;
    public long remainder;
    public int oddNum;
    public int evenNum;
    public long maxValue;

    Calculation(){
        inputNum = 0;
        remainder = 0;
        oddNum = 0;
        evenNum = 0;
        maxValue = 0;
    }

    public void calculate(){
        //while the number is not equal to 1 (1 is the last value in Collatz Conjecture)
        while (inputNum != 1){
            //get remainder to know if it is odd or even number
            remainder = inputNum % 2;
            //if inputNumber is odd
            if (remainder == 1){
                inputNum = 3*inputNum +1;
                oddNum++;
                //if current number is higher then set new maximal value
                if (inputNum > maxValue){
                    maxValue = inputNum;
                }
            }
            //if inputNumber is even
            if (remainder == 0){
               inputNum = inputNum/2;
               evenNum++;
            }
        }

        System.out.println("Number of 3k + 1 operations: " + oddNum);
        System.out.println("Number of 2k operations: " + evenNum);
        System.out.println("Maximum member: " + maxValue);
    }

    public void setInputNum(long newInputNumber) {
        this.inputNum = newInputNumber;
    }

}
