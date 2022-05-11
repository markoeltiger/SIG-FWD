package com.company.ZezooElnoby;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);

        Scanner second = new Scanner(System.in);
        Scanner third = new Scanner(System.in);
         float a = first.nextFloat();
        float b =second.nextFloat();
        float c =third.nextFloat();

        double  z = ((2*a)+(3*b))*(5*c);
        BigDecimal ans = new BigDecimal(z).setScale(6, RoundingMode.HALF_EVEN);
        z=ans.doubleValue();
        System.out.println(ans);



    }
}
