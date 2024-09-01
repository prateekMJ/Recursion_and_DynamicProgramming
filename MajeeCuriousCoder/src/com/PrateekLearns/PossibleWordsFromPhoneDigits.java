package com.PrateekLearns;

import java.util.ArrayList;
import java.util.List;

public class PossibleWordsFromPhoneDigits {


    private static void AllCombinations(int[] a , int N ,int index ,ArrayList<String> phone ,ArrayList<String> combinations , StringBuilder str){

        //Base Case
        if(index == N){
            combinations.add(str.toString());
            return;
        }

        if(str.length() == N){
            combinations.add(str.toString());
            return;
        }

        //Operations and Recursive Call

        String chars = phone.get(a[index]);


        for(int i=0;i<chars.length();i++){

            //Adding char to the temp str
            str.append(Character.toString(chars.charAt(i)));
            AllCombinations(a , N , index+1 , phone, combinations, str);

            //Removing the recently added char
            str.deleteCharAt(str.length()-1);

        }
    }
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {

        ArrayList<String> phone = new ArrayList<>();
        ArrayList<String> combinations = new ArrayList<>();

        // your code here
        phone.add(null);
        phone.add(null);
        phone.add("abc");
        phone.add("def");
        phone.add("ghi");
        phone.add("jkl");
        phone.add("mno");
        phone.add("pqrs");
        phone.add("tuv");
        phone.add("wxyz");

        AllCombinations(a , N , 0 ,phone ,combinations, new StringBuilder(""));

        return combinations;

    }

    public static void main(String[] args) {
        int[] arr = {2,4};
        List<String> combination = possibleWords(arr , arr.length);

        for(String s : combination){
            System.out.println(s);
        }
    }
}
