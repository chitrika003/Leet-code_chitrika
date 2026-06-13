package com.arrays;

import java.util.Arrays;

public class LC1480_RunningSumOf1dArray {
    public static int[] runningsumof1dArrays(int[] nums){
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum=sum+nums[j];
            }
            ans[i]=sum;
        }
        return ans;
    }
    public static int[] runningsumof1dArraysOptimized(int[] nums){
        int[] ans = new int[nums.length];
        int sum=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            ans[j]=sum;
            j++;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] num={1,2,3,4};
        System.out.println(Arrays.toString(runningsumof1dArraysOptimized(num)));
    }
}
