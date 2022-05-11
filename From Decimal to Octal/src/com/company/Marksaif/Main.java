package com.company.Marksaif;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
    	int decimal =  scan.nextInt() ;

	String tooctal = Integer.toOctalString(decimal);
	System.out.println(tooctal);
    }
}
