package com.company;

public class Main {

    public static void main(String[] args) {
	Shape circle =new Circle();
	Shape redShape= new RedShapedDecorator(new Circle());
	System.out.println("circle with normer border");
	circle.draw();
	System.out.println("Circle with red border");
	redShape.draw();

            }
}
