package com.dsa.problemsolving.dsa.arrays.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optimal {

    public static void main(String args[]){
        int arr[] = {2, -2, 0, 3, -3, 5};

       List<List<Integer>> result = doSolve(arr);

        result.forEach(l->System.out.println(l.toString()));
    }
    public static List<List<Integer>> doSolve(int arr[]){

        Arrays.sort(arr);
        int n =arr.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum =arr[i]+arr[j]+arr[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }else {
                    result.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                    while (j<k && arr[j]==arr[j-1]) j++;
                    while (j<k && arr[k]==arr[k+1]) k--;
                }
            }
        }
        return result;
    }

}
