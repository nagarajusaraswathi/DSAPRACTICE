package com.dsa.problemsolving.dsa.arrays.twosum;

import java.util.Arrays;

public class Optimal {
    public static void main(String args[]){
        int[] nums = {1, 6, 2, 10, 3};
        int target = 7;
        System.out.println(doSolve(nums,target));
    }

    public static boolean doSolve(int nums[],int target){
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        boolean found= false;
        while (i <= j) {
            int sum =nums[i]+nums[j];
            if(sum==target){
                found=true;
                break;
            } else if(sum>target){
                j--;
            }else {
                i++;
            }

        }
        return found;
    }
}
