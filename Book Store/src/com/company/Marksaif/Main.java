package com.company.Marksaif;

public class Main {

    public static void main(String[] args) {
	Book howtoberich =new Book("How to be rich","dalia maged",160);
	Book momaizbl2sfr =new Book ("momaiz","mark",200);
	howtoberich.Movetopage(180);
	System.out.println(howtoberich.Is_Open);
	//دخلها في ال if
		//معناها لو اتحركت للصفحة دي بدون اي مشاكل خش بقا جوا if
	howtoberich.Movetopage(201);
System.out.println(howtoberich.pages);
    }
}
