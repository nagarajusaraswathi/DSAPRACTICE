package com.dsa.problemsolving.dsa.arrays.twosum;

import java.util.HashMap;
import java.util.Map;

public class OptimalTwo {
    public static void main(String args[]){
        int[] nums = {1, 6, 2, 10, 3};
        int target = 8;
        int re[] = doSolve(nums,target);
        System.out.println(re[0]);
        System.out.println(re[1]);
    }
    public static int[] doSolve(int nums[],int target){
        Map<Integer,Integer> map = new HashMap<>();
        int res[]={-1,-1};
        for(int i=0;i<nums.length;i++){
            int val = target-nums[i];
            if(map.containsKey(val)){
                res[0]=map.get(val);;
                res[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
