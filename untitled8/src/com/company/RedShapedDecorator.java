package com.company;

public class RedShapedDecorator extends shapeDecorateor{

    public RedShapedDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
System.out.println("border color :RED");
    }
}
