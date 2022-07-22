package com.company;
public class Main {

    public static void main(String[] args) {
        int [] x= {1,3,5,6};
     System.out.println(searchInsert(x));

    }
    public static int[] searchInsert(int[] nums) {
        int [] newx=new int[nums.length*2];

        for (int i = 0 ;i<newx.length;i++){

           if (i < nums.length)
               newx[i]=nums[i];
          else {
              int m = i- nums.length;
               newx[i] = nums[m];
           }
        }
    return newx;}

}