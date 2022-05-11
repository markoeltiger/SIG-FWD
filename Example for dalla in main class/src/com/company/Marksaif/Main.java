package com.company.Marksaif;

import java.util.Scanner;

public class Main {
    public void plusnum (int a,int b){
System.out.println(a+b);

    }

    public static void main(String[] args) {
        Scanner plus =new Scanner(System.in);

        Main newmain =new Main();
        int a =plus.nextInt();
        int b =plus.nextInt();
	newmain.plusnum(a,b);
	char fuck ='f' ;

        if (fuck==64) {
            System.out.println("true");
        }else {  System.out.println("false");}
    }
}
