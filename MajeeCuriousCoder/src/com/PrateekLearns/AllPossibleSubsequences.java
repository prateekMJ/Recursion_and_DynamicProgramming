package com.PrateekLearns;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubsequences {

    private static List<String> result = new ArrayList<>();

    private static void subsequence(String str , String temp , int start){

        //Base case
        if(str.length()==start) {
            result.add(temp);
            return;
        }

        //Operation and Recursive call
        subsequence(str , temp+str.charAt(start) , start+1);
        subsequence(str , temp , start+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequence(str ,"", 0);

        for(String s : result) System.out.println(s);
    }
}
