package com.arrays;

public class LC1512NumberOfGoodpairs {
    public static int numIdenticalPairs(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&&i<j){
                    ans=ans+1;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args){
        int[] num =  {1,1,1,1};
        System.out.println(numIdenticalPairs(num));
    }
}
