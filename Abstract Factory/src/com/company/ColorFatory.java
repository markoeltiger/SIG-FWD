package com.company;

public class ColorFatory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        if (color==null){return null;}
        if (color.equalsIgnoreCase("green")){return new Green();}
        if (color.equalsIgnoreCase("blue")){return new Blue();}



        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
