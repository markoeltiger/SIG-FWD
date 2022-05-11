package com.company.ZezooElnoby;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dec = new Scanner(System.in);
        Double x = dec.nextDouble() ;

            for (x = dec.nextDouble(); x > 0; x = x / 8) {
                if ((x % 8) == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }

    }
}