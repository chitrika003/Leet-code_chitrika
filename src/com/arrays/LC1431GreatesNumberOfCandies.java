package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class LC1431GreatesNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
          List<Boolean> ans = new ArrayList<>();

        int max_Elements=candies[0];
        for(int j=0;j<candies.length;j++){
            if(candies[j]>max_Elements){
                max_Elements=candies[j];
            }
        }

          for(int i=0;i<candies.length;i++) {
                if(candies[i]+extraCandies>=max_Elements){
                    ans.add(true);
                }
                else{
                    ans.add(false);
                }
          }

      return ans;
    }
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3},3));
    }

}

