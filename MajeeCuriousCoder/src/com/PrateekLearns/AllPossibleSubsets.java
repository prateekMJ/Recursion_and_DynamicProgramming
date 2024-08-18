package com.PrateekLearns;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubsets {

    private static List<List<Integer>> list = new ArrayList<>();
    private static void subsets(List<Integer> arr ,List<Integer> temp , int len , int index){

        //Base Case
        if(index == arr.size()){
            list.add(new ArrayList<>(temp));
            return;
        }

        //Operation and Recursive Call
        temp.add(arr.get(index));
        subsets(arr , temp , len , index+1);
        temp.remove(temp.size()-1);
        subsets(arr , temp , len , index+1);

        return;
    }
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3);
        List<Integer> temp = new ArrayList<>();

        subsets(list1 , temp , list1.size() , 0);

        for(List<Integer> l : list){
            System.out.println(l);
        }
    }
}
