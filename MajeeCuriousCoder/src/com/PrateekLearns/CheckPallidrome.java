package com.PrateekLearns;

public class CheckPallidrome {

    private static boolean checkPallindrome(String str , int s , int e){

        int len = str.length();
        //Base Case
        if(len == 0 || len == 1) return true;

        if(s>=e) return true;

        if(str.charAt(s)!=str.charAt(e)) return false;

        //operation and Recursive Call

        return checkPallindrome(str , s+1 , e-1);
    }
    public static void main(String[] args) {

        System.out.println(checkPallindrome("prateek" , 0 , 6));
        System.out.println(checkPallindrome("noon" , 0 , 3));

    }
}
