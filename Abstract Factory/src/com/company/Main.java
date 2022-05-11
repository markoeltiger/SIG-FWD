package com.company;

public class Main {

    public static void main(String[] args) {
	
        AbstractFactory shapeFacttory=FatoryProducer.getFactory("shape");
        Shape shape1 =shapeFacttory.getShape("Square");
        shape1.draw();
       AbstractFactory colorfactory =FatoryProducer.getFactory("color");
        Color color1 = colorfactory.getColor("blue");
        color1.fill();
        
        
        
        
    }
}
