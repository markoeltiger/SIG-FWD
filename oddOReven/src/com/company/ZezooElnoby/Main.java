package com.company.ZezooElnoby;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);
        int x =num.nextInt();
        if (x%2==0){
            System.out.println("EVEN");
        }else {System.out.println("ODD");}
    }
}
