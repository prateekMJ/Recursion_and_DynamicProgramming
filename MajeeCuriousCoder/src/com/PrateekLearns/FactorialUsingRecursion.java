package com.PrateekLearns;

public class FactorialUsingRecursion {

    private static int factorial(int n){
        //Base Case
        if(n==1) return 1;

        //Operation and Recursive Call
        int recurCall = factorial(n-1);

        int product = n*recurCall;

        return product;
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println(factorial(n));
    }
}
