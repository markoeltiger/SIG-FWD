package com.company.Marksaif;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter The Two Numbers");
        Scanner marko =new Scanner(System.in);
        int a = marko.nextInt();
        int b =marko.nextInt();
        System.out.println("Choose The Number Of the oberation");
        System.out.println("1(+)_2(-)_3(*)_4(/)");
        int c =marko.nextInt();
        switch (c){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;


        }
    }
}
