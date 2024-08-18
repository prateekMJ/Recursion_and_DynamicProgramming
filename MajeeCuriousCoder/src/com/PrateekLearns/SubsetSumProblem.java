package com.PrateekLearns;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumProblem {
    /**
     * Find the Subset whose sum is equivalent to Target
     */
    static List<List<Integer>> result = new ArrayList<>();
    private static void subsetSum(int arr[] ,List<Integer> temp , int target , int index){

        //Base Case
        if(index == arr.length) {
            if(target == 0){
                result.add(new ArrayList<>(temp));
                return ;
            }
            return;
        }

        if(target == 0){
            result.add(new ArrayList<>(temp));
            return ;
        }

        //Operation and Recursive Call
        //Eligible
        if(arr[index]<=target){

            //Take
            temp.add(arr[index]);
            subsetSum(arr , temp , target-arr[index] , index+1);
            //Not take
            temp.remove(temp.size()-1);
            subsetSum(arr , temp , target , index+1);

        }
        else{
            //Not Eligible
            subsetSum(arr , temp , target , index+1);
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,11,3,5,12};
        int target = 5;
        List<Integer> temp = new ArrayList<>();

        subsetSum(arr , temp , target , 0);

        for(List<Integer> l : result) System.out.println(l);
    }
}
