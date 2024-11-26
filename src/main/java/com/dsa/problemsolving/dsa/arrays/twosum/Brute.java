package com.dsa.problemsolving.dsa.arrays.twosum;

public class Brute {
    public static void main(String args[]){
        int[] nums = {1, 6, 2, 10, 3};
        int target = 8;
        int re[] = doSolve(nums,target);
        System.out.println(re[0]);
        System.out.println(re[1]);
    }
    public static int[] doSolve(int nums[],int target){
        int result[] = {-1,-1};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
}
