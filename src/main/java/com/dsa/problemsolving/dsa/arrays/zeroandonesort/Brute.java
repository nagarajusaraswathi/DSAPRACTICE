package com.dsa.problemsolving.dsa.arrays.zeroandonesort;

import java.util.Arrays;

public class Brute {
    public static void main(String args[]){
        int arr[] = {1,0,1,0,2,0,1,2};
        int res[] = doSolve(arr);
        for(int v:res){
            System.out.print(v+" ");
        }
    }
    public static int[]  doSolve(int nums[]){
        Arrays.sort(nums);
        return nums;
    }
}
