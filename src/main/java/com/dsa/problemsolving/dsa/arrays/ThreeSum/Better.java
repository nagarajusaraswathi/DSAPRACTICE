package com.dsa.problemsolving.dsa.arrays.ThreeSum;

import java.util.*;

public class Better {
    public static void main(String args[]){
        int arr[] = {2, -2, 0, 3, -3, 5};
        //
        Set<List<Integer>> result = doSolve(arr);
        result.forEach(s->System.out.println(s.toString()));
    }
    public static Set<List<Integer>> doSolve(int arr[]){
        int n = arr.length;
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> store = new HashSet<>();

            for(int j=i+1;j<n;j++){
                int val =-1*(arr[i]+arr[j]);

                if(store.contains(val)) {
                    List<Integer> list = Arrays.asList(arr[i], arr[j], val);
                    Collections.sort(list);
                    result.add(list);

                }
                store.add(arr[j]);
            }
        }
        return  result;
    }
}
