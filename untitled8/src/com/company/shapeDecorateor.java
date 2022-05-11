package com.company;

public abstract class shapeDecorateor implements Shape{
    protected Shape decoratedShape;
    public  shapeDecorateor (Shape decoratedShape){
    this.decoratedShape=decoratedShape;

    }
public void draw(){decoratedShape.draw();}
}
