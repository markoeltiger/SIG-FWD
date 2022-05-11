package com.company;

public class CarTireDecorator extends CarDecorator {

    public CarTireDecorator(Car car) {
        super(car);
    }

    public void upgrade() {
        super.upgrade();
        System.out.println(" - upgrade to 21 inch tires");
    }

}
