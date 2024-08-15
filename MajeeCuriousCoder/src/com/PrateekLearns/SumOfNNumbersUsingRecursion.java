package com.PrateekLearns;

public class SumOfNNumbersUsingRecursion {

    private static int sumOfNNumbers(int n){

        //Base Case
        if(n==0) return 0;

        //Operation and Recursive Call

        int recurCall = sumOfNNumbers(n-1);
        int sum = n+recurCall;

        return sum;

    }

    public static void main(String[] args) {
        int n=6;

        System.out.println(sumOfNNumbers(n));
    }
}
