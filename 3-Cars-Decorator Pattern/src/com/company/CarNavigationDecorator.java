package com.company;

public class CarNavigationDecorator extends CarDecorator {

    public CarNavigationDecorator(Car car) {
        super(car);
    }

    public void upgrade() {
        super.upgrade();
        System.out.println(" - Add Turbo ");
    }

}