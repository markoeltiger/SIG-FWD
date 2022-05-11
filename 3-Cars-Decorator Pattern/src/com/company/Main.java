package com.company;

public class Main {

    public static void main(String[] args) {

            Car car = new CarTireDecorator(new CarNavigationDecorator(new BMW()));
            car.upgrade();

            System.out.println("");
            Car car2 = new CarNavigationDecorator(new Chevorlet());
            car2.upgrade();
    }
}
