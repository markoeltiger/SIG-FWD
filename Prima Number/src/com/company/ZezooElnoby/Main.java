package com.company.ZezooElnoby;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
System.out.println("Enter the two numbers");

        Scanner mark =new Scanner(System.in);

        for (int n=mark.nextInt(),m=mark.nextInt();n<=m; n++){

            int number = n ;

            for (int x= 2;x<=9;x++){

                int prima =(number%x) ;
                if (prima ==0){
                    System.out.println(number+ " notPrima");
                    break;
                }
               if(number%9 ==0){ System.out.println(number +" not");}

                else  {
                    System.out.println(number+ " Prima");
                    break;}


            }
        }
        }

    }
