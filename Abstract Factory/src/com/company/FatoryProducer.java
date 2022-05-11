package com.company;

public class FatoryProducer {
public static  AbstractFactory getFactory(String choice){
    if (choice.equalsIgnoreCase("shape")){return new ShapeFactory(); }
    if (choice.equalsIgnoreCase("color")){return new ColorFatory(); }
return null;



}
}
