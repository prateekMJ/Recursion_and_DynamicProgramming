package com.PrateekLearns;

public class ReverseArrayUsingRecursion {

    private static void reverseArray(int[] arr, int start , int end){

        //Base Case
        if(start==end) return;

        //Operation and Recursive Call
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr , start+1 , end-1);
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        reverseArray(arr , 0 , arr.length-1);

        for(int i : arr) System.out.print(i+" ");
    }
}
