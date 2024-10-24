package com.lbg.classes;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Car {
    private int speed;
    private String make;
    private CarColour colour;
    private String model;

    public Car(int speed, String make, CarColour colour, String model) {
        this.setSpeed(speed);
        this.setModel(model);
        this.setMake(make);
        this.setColour(colour);
    }

    public Car() {
        this.setSpeed(0);
        this.setMake("Unknown");
        this.setColour(CarColour.UNKNOWN);
        this.setModel("Unknown");

    }

    public void accelerate(int deltaV) {
        this.speed += deltaV;
    }

    public void decelerate(int deltaV) {
        this.speed -= deltaV;
    }
}
