package com.dsa.problemsolving.dsa.arrays.ThreeSum;

import java.util.*;

public class Brute {

    public static void main(String args[]){
        int arr[] = {2, -2, 0, 3, -3, 5};

       Set<List<Integer>> result = doSolve(arr);

        result.forEach(s->System.out.println(s.toString()));
    }
    public static Set<List<Integer>> doSolve(int arr[]){
        int n = arr.length;
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k =j+1;k<n;k++){
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum==0){
                        List<Integer> list =  Arrays.asList(arr[i],arr[j],arr[k]);//
                        Collections.sort(list);
                        result.add(list);
                    }
                }
            }
        }
        return result;
    }
}
