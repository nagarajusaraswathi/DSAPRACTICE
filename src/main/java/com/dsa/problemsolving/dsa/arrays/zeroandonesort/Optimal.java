package com.dsa.problemsolving.dsa.arrays.zeroandonesort;

public class Optimal {
    public static void main(String args[]) {
        int arr[] = {1, 0, 1, 0, 2, 0, 1, 2};
        int res[] = doSolve(arr);
        for (int v : res) {
            System.out.print(v + " ");
        }
    }
    public static int[] doSolve(int arr[]){
        int l=0,m=0;
        int h=arr.length-1;
        while (m<=h){
            if(arr[m]==0){
                int temp =arr[l];
                arr[l]=arr[m];
                arr[m]=temp;
                l++;
                m++;
            }else if(arr[m]==1){
                m++;
            }else{
                int temp=arr[h];
                arr[h]=arr[m];
                arr[m]=temp;
                h--;
            }
        }

        return arr;
    }
}
