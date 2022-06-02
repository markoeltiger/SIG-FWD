package com.company;
public class Main {

    public static void main(String[] args) {
        int [] x= {1,3,5,6};
     System.out.println(searchInsert(x, 5));

    }
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0 ;i<nums.length;i++){
         if (nums[i]==target)
             return i;
        }
    return target;}

}