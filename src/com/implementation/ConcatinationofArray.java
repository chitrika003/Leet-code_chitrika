The LeetCode problem Concatenation of Array 1929
package com.implementation;

public class ConcatinationofArray {
    static public int[] concatination(int[] nums){
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }

    public  static void main() {
        int[] num={1,2,3};
        System.out.println(concatination(num));
    }
}
