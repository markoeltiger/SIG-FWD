package com.company;

public abstract class CarDecorator implements Car {
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void upgrade() {
        car.upgrade();
    }
}