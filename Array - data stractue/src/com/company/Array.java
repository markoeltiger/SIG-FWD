package com.company;

import java.util.Arrays;

public class Array {
int lengths=0;
    int [] numbers;
    int index =0;
    int [] newnumbers;
    public Array (int length){
        lengths=length;
       numbers = new int[lengths];
       System.out.println(Arrays.toString(numbers));
    }
    public void Insert (int items){
        //in case of array already completed
        if (numbers.length==index){
            int[]  newinsertnumbers = new int[lengths*2];

            for (int x = 0 ; x < index ;x++){
                newinsertnumbers[x] = numbers[x];
            }
            newinsertnumbers[index]=items;
            index++;
            System.out.println(Arrays.toString(newinsertnumbers));
        }else {
        numbers[index]=items;
        index++;
        System.out.println(Arrays.toString(numbers));
       }
    }
    public void removeat (int items){
        for (int i = 0 ; i <lengths;i++){
            if (i < items){
                 newnumbers = new int[lengths];
                 newnumbers[i]=numbers [i];
            }else {
                newnumbers = new int[lengths];  
                newnumbers[i]=numbers [i+1];}


        }
        System.out.println(Arrays.toString(newnumbers));

    }
}
