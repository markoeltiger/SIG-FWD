package com.company;

public class ShapeFactory extends AbstractFactory{



    @Override
    Shape getShape(String shape) {
       if (shape==null){return null;}
if (shape.equalsIgnoreCase("Circle")){
    return new Circle();


}
        if (shape.equalsIgnoreCase("Square")){
            return new sqaure();
        }
    return null;}

    @Override
    Color getColor(String color) {
        return null;
    }


}
