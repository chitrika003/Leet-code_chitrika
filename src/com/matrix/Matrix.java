package com.matrix;
/**
 * This programme is to understand the implementation and how to iterate through a 2D array.
 * A 2D array is an array of arrays. It is a collection of elements arranged
 * every array inside  array is treated as object and we can access the elements of the array by using the index of the array and the index of the element
 * */
public class Matrix {
    public static void matrix(int[][] nums){

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }


    }
     public static void main() {
        int[][] nums={{1,2,3},{4,5,5}};
        matrix(nums);
    }
}
