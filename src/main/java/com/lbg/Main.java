package com.lbg;

import com.lbg.classes.Car;
import com.lbg.classes.CarColour;

public class Main {
    public static void main(String[] args) {

        Car bartCar = new Car(50, "Toyota", CarColour.RED, "Yaris");

        System.out.println("Bart's car's speed: " +bartCar.getSpeed());

        bartCar.setSpeed(60);

        System.out.println("Bart's car's speed: " +bartCar.getSpeed());
        System.out.println("Bart's car's make: " +bartCar.getMake());

        bartCar.accelerate(30);

        System.out.println("Bart's car's speed: " +bartCar.getSpeed());

        Car lisaCar = new Car();

        System.out.println("Lisa's car's model: " + lisaCar.getModel());

        Car[] cars = {bartCar, lisaCar, new Car()};

        for (Car currentCar: cars
             ) {
            System.out.println(currentCar);
            System.out.println(currentCar.getColour());
            System.out.println(currentCar.getModel());
        }
    }
}