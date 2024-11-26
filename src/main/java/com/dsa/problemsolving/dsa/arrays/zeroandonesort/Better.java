package com.dsa.problemsolving.dsa.arrays.zeroandonesort;

public class Better {
    public static void main(String args[]){
        int arr[] = {1,0,1,0,2,0,1,2};
        int res[] = doSolve(arr);
        for(int v:res){
            System.out.print(v+" ");
        }
    }
    public static int[] doSolve(int nums[]){
        int countZeros=0,countOnes=0,countTwos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) countZeros++;
            else if(nums[i]==1) countOnes++;
            else countTwos++;
        }
        int i=0;
       while (countZeros>0){
           nums[i++]=0;
           countZeros--;
       }
       while (countOnes>0){

           nums[i++]=1;
           countOnes--;
       }
       while (countTwos>0){
           nums[i++]=2;
           countTwos--;
       }
        return nums;
    }
}
