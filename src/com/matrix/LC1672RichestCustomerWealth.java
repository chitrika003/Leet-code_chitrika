package com.matrix;

public class LC1672RichestCustomerWealth {
    public static int richestCustomer(int[][] nums){

       int maxWealth=0;

        for(int i=0;i< nums.length;i++){
            int res=0;
            for(int j=0;j<nums[i].length;j++){

               res =res+nums[i][j];
            }
            if(maxWealth<res){
                maxWealth=res;
            }
        }

        return maxWealth;
    }

    public static void main() {
int[][] num={{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(richestCustomer(num));
    }
}
