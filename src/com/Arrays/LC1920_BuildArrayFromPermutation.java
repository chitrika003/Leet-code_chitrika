package com.Arrays;

import java.util.Arrays;

public class LC1920_BuildArrayFromPermutation {
    static public int[] permutatedArray(int[]num){
        int[] ans = new int[num.length];
        int j=0;
      for(int i=0;i<num.length;i++){


          //System.out.println(j);
        ans[j]=num[num[i]];
         j++;
        }

        return ans;
    }

    public  static void main() {
  int[] num={0,2,1,5,3,4};
        System.out.println(Arrays.toString(permutatedArray(num)));
    }
}
