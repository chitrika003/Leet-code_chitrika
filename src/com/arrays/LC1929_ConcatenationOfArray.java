package com.arrays;

import java.util.Arrays;

public class LC1929_ConcatenationOfArray {

    public  static int[] concatination(int[] nums){
        //int j=0;
        int n=nums.length;
        int[] ans = new int[2*nums.length];
        for(int i=0;i<nums.length;i++) {
//			if(j>nums.length-1) {
//				j=0;
//			}
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return  ans;
    }

    public static void main(String[] args) {
        int[] nums= {1,2,3};
        // TODO Auto-generated method stub
        System.out.println(Arrays.toString(concatination(nums)));

    }

}
