package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       int[] nums= new int[]{1, 3, 2};
        permuteUnique(nums);
    }


    public static void permuteUnique(int[] nums) {
      int conditions =0;
        nums= new int[]{1, 3, 2};
         ArrayList<Integer> sorted = new ArrayList<Integer>();
         ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
         ArrayList<Boolean> visited = new ArrayList<Boolean>();
        for (int i = 0; i < nums.length; i++) {
            for (int x =0 ;x<nums.length;x++){
                 if (nums[i]>nums[x]){
                     sorted.add(nums[i]); 
                 }

            }
            System.out.println(sorted);

        }
     }
}
