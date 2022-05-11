package com.company.Marksaif;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner mak = new Scanner(System.in);
        int a, b, c;
        a = mak.nextInt();
        b = mak.nextInt();
        c = mak.nextInt();
        if (a > b && a > c) {

            System.out.println(a + " Is the biggest num");
        } else if (b > a && b > c) {
            System.out.println(b + " is the biggest num");
        } else {
            System.out.println(c + " is the biggest num");
        }
    }
}
