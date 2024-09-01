package com.PrateekLearns;

import java.util.ArrayList;
import java.util.List;

public class AllPossiblePermutations {

    static List<Integer[]> permutation = new ArrayList<>();

    private static void permutations(Integer[] arr , int index){
        //Base case
        if(index == arr.length){
            permutation.add(arr);
            return;
        }

        //Operations and recursive call

        for(int i=index;i<arr.length;i++){
            //First Swap
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;


            permutations(arr , index+1);

            //Rollback changes

            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return;
    }
    public static void main(String[] args) {
        //List<Integer> list = List.of(1,2,3);
        Integer[] arr = {1,2,3};
        permutations(arr , 0);

        for(Integer[] l : permutation) {
            for(int i : l)
            System.out.print(i+" ");
            System.out.println();
        }

    }
}
