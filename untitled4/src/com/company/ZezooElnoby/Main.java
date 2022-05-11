package com.company.ZezooElnoby;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Write the first name of the First person");
        Scanner f =new Scanner(System.in);
        String fpfn = f.next();
        System.out.println("Write the Last name of the First person");
        Scanner ff =new Scanner(System.in);
        String fpln = f.next();
        System.out.println("Write the first name of the Second person");
        Scanner fff =new Scanner(System.in);
        String spfn = f.next();
        System.out.println("Write the last name of the Second person");
        Scanner ffff =new Scanner(System.in);
        String spln =ffff.next();
        if ( spln.equals(fpln) ){
            System.out.println("brothers");
        }else {
            System.out.println("Not brothers");
        }
    }
}
