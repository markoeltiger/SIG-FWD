package com.company.Marksaif;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner doda =new Scanner(System.in);
        int n =doda.nextInt();
        int i =1 ;
        while (i<=n){
            System.out.println("  ");
            for (int x = 1;x<i ;x++){
                System.out.print(x);
            }
            i++;}

        while (n>0) {
            System.out.println(" ");
            for (int m =1 ;n>=m;m++){
                System.out.print(m);
            }
            n--;  }


    }


}



/*
*n =4
*
* 1
* 12
* 123
* 1234
* 123
* 12
* 1
*
*
*
*
 */