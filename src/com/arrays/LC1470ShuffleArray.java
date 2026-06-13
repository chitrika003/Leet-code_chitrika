package com.arrays;

import java.util.Arrays;

public class LC1470ShuffleArray {
    public static int[] shuffle(int[] nums, int n){
        int[] ans=new int[nums.length];
        int j=n;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=nums[k];
                k++;
            }
            else{
                ans[i]=nums[j];
                j++;
            }

        }

        return ans;

    }

    public  static void main(String[] args) {
int[] nums={2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums,3)));
    }
}
